interface A{
    // variable inside interface they are static and final
    // by default public abstract
    String name="Yash";
    int age=20;
    void show();
    void config();
}
class B implements A{
    // In implements we get only method not variable
    public void show(){
        System.out.println("In Show");
    }
    public void config(){
        System.out.println("In Config");
    }
}
public class oop31 {

    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.age); // A.age bcz its static
               
    }
}