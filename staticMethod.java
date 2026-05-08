class Mobile
{
    int price;
    String company;
    static String type;

    public void show()
    {
        System.out.println(company + " : " + price);
    }
    public static void show1(Mobile a)
    {
        System.out.println(a.company + " : " + a.price);
    }

}
public class staticMethod {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();
        obj1.price = 10000;
        obj1.company = "Apple";
        obj2.price = 15000;
        obj2.company = "Samsung";
        
        obj1.show();
        Mobile.show1(obj2);

    }
}