public interface Default_method {

    public void display(int amt);
    default void show()
    {
        System.out.println("inside default");
    }
}
