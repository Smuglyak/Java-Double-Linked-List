class Node<T> {
    T element;
    Node next;
    Node prev;

    public Node(T element, Node next, Node prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}

public class DlistImplementation<T> implements ListInterface {

    Node firstNode;
    Node lastNode;
    int numberOfElements;
    int maxCapacity = 10000;

    public Node nodeWithPosition(int givenPosition) {
        Node r = firstNode;
        for (int i = 0; i < givenPosition; i++) {
            r = r.next;
        }
        return r;
    }

    @Override
    public void add(Object newEntry) {
        if (numberOfElements > maxCapacity) {
            return;
        }
        numberOfElements++;
        Node newNode = new Node(newEntry, null, null);
        if (firstNode == null) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            Node r = firstNode;
            while (r.next != null) {
                r = r.next;
            }
            r.next = newNode;
            newNode.prev = r;
        }
    }

    @Override
    public void add(int newPosition, Object newEntry) {
        if (numberOfElements > maxCapacity) {
            return;
        }
        numberOfElements++;
        Node newNode = new Node(newEntry, null, null);
        if (firstNode == null) {
            firstNode = newNode;
            lastNode = newNode;
            return;
        } else {
            Node n = nodeWithPosition(newPosition).next;
            Node p = nodeWithPosition(newPosition).prev;
            newNode.prev = p;
            newNode.next = n;
            p.next = newNode;
            n.prev = newNode;
        }
    }

    @Override
    public Object remove(int givenPosition) {
        Node nodeToBeRemoved = nodeWithPosition(givenPosition);
        if (nodeToBeRemoved == null) {
            return null;
        }
        numberOfElements--;
        Node p = nodeToBeRemoved.prev;
        Node n = nodeToBeRemoved.next;
        p.next = n;
        n.prev = p;
        return nodeToBeRemoved.element;
    }

    @Override
    public void clear() {
        numberOfElements = 0;
        firstNode = null;
        lastNode = null;
    }

    @Override
    public Object replaceEntry(int givenPosition, Object newEntry) {
        Node nodeEntryToBeReplaced = nodeWithPosition(givenPosition);
        Object result = nodeEntryToBeReplaced.element;
        nodeEntryToBeReplaced.element = newEntry;
        return result;
    }

    @Override
    public Object getEntry(int givenPosition) {
        Node getEntryNode = nodeWithPosition(givenPosition);
        if (getEntryNode.element != null) {
            return getEntryNode.element;
        }
        return false;
    }

    @Override
    public String[] toArray() {
        String[] result = new String[numberOfElements];
        Node r = firstNode;
        int i = 0;
        while (r != null) {
            result[i] = (String) r.element;
            i++;
            r = r.next;
        }
        return result;
    }

    @Override
    public boolean contains(Object anEntry) {
        Node r = firstNode;
        while (r != null) {
            if (r.element == anEntry) {
                return true;
            }
            r = r.next;
        }
        return false;
    }

    @Override
    public int getLength() {
        return numberOfElements;
    }

    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    @Override
    public String toString() {
        String result = "[";
        Node r = firstNode;
        while (r != null) {
            result += (r == firstNode ? "" : ",") + r.element;
            r = r.next;
        }
        return result + "]";
    }
}
