class Static_Inner {
    public static void display()
    {
        System.out.println("inside");
    }
    static class Inner {
        public static void main(String[] args) {
            System.out.println("inner class");
            display();
        }
    }
}
