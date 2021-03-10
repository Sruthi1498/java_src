public class Inner {
     int n = 10;
 public class Innner {
     int a=8;
 }
    public static void main(String[] args) {
     Inner ob = new Inner();
        Inner.Innner obj = new Inner().new Innner();
        System.out.println(obj.a);
        ob.display();
    }
    void display()
    {
        System.out.println(Inner.this.n);
    }
}
