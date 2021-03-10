public class def implements Default_method{
    public void display(int amt)
    {
        System.out.println(amt);
    }

    public static void main(String[] args) {
        def d = new def();
        d.display(10);
        d.show();
    }
}