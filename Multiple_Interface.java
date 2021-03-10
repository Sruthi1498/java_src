public class Multiple_Interface implements Interface1,Interface2{
public void show()
{
    Interface1.super.show();
    Interface2.super.show();
}

    public static void main(String[] args) {
        Multiple_Interface m = new Multiple_Interface();
        m.show();
    }
}
