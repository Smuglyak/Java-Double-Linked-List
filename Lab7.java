class Lab7 {

    public static void main(String[] args) {
        DlistImplementation newList = new DlistImplementation();
        newList.add("1");
        newList.add("2");
        newList.add("3");
        newList.add("4");
        // System.out.println(newList.getLength());
        // System.out.println(newList.isEmpty());
        // System.out.println(newList.contains("4"));
        // System.out.println(newList.getEntry(2));
        // System.out.println(newList.replaceEntry(1, "San"));
        // System.out.println(newList.getEntry(1));
        // // newList.clear();
        // // System.out.println(newList.isEmpty());
        // System.out.println(newList.remove(1));
        // System.out.println(newList.getEntry(1));
        System.out.println(newList.toString());
        System.out.println(newList.toArray());
    }
}