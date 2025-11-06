class Mobile{
    String brand;
    int price;
    static String name;

    static{
         name = "Phone";
         System.out.println("In Static Block");
    }

    public Mobile(){
        brand="";
        price = 200;
        System.out.println("In Constructor Block");
    }

}
public class oop12 {
    public static void main(String[] args) {
        // Static block called only once
        // constructor called twice as there is 2 object 
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();
    }
}
