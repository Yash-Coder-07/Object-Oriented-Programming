class A{
    public void show(){
        System.out.println("In a show");
    }
}
public class oop18 {
    public static void main(String[] args) {
        /*A obj = new A();
        obj.show();*/
        // Refference Object 
        A obj;
        obj = new A();
        obj.show();

        // anonymous object every time this line runs create a new object 
        new A().show(); //  cant use this line once more 
    }
}
