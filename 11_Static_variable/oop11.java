class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand +":"+price+":"+name);
    }

}
public class oop11 {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile(); 
        Mobile obj2 = new Mobile();   
        obj1.brand = "Apple";
        obj1.price = 1700;
        Mobile.name = "smartphone";

        obj2.brand = "Samsung";
        obj2.price = 2200;
        Mobile.name = "smartphone";
        Mobile.name = "Cell Phone";
        obj1.show();
        obj2.show();

    }
}
