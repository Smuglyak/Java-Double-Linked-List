// class DoubleIteratorClass<T> implements DoubleIterator {

// Node<T> current;

// /**
// * // returns false if next element does not exist
// */
// @Override
// public boolean hasNext() {
// // TODO Auto-generated method stub
// return current != null;
// }

// /**
// * // return current data and update pointer
// */
// @Override
// public T next() {
// // TODO Auto-generated method stub
// T data = current.getData();
// current = current.getNext();
// return data;
// }

// @Override
// public boolean hasPrior() {
// // TODO Auto-generated method stub
// return false;
// }

// @Override
// public Object prior() {
// // TODO Auto-generated method stub
// return null;
// }

// }

// class DoubleIterableClass implements DoubleIterable {//after

// @Override
// public DoubleIterator iterator() {
// return null;
// }

// }

// interface DoubleIterator<T> {
// /**
// * Detects whether this iterator has completed its traversal
// * and gone beyond the last entry in the collection of data.
// *
// * @return True if the iterator has another entry to return.
// */
// public boolean hasNext();

// /**
// * Retrieves the next entry in the collection and
// * advances this iterator by one position.
// *
// * @return A reference to the next entry in the iteration,
// * if one exists.
// * @throws NoSuchElementException if the iterator had reached the
// * end already, that is, if hasNext() is false.
// */
// public T next();

// /**
// * Detects whether this iterator has completed its back traversal
// * and gone below the first entry in the collection of data.
// *
// * @return True if the iterator has a prior entry to return.
// */
// public boolean hasPrior();

// /**
// * Retrieves the prior entry in the collection and
// * advances this iterator by one position.
// *
// * @return A reference to the prior entry in the iteration,
// * if one exists.
// * @throws NoSuchElementException if the iterator had reached the
// * end already, that is, if hasPrior() is false.
// */
// public T prior();
// } // end Iterator

// interface DoubleIterable<T> {
// /** @return A doubleIterator for a collection of objects of type T. */
// DoubleIterator<T> iterator();
// } // end DoubleIterable
