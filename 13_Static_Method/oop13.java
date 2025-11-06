class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand +":"+price+":"+name);
    }
    // cannot use instance variable without referrence of object..
    public static void show1(Mobile obj){
         System.out.println(obj.brand +":"+obj.price+":"+name);
    }

}
public class oop13 {
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
        Mobile.show1(obj1);

    }
}
