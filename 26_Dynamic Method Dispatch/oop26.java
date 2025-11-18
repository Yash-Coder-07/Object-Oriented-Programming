class A{
    public void show(){
        System.out.println("In A show");
    }
}
class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}
public class oop26 {
    public static void main(String[] args) {
        // it works when there is inheritance
        // It also works types is parent but object is subclass
        A obj = new A();
        obj.show();
        obj = new B();
        obj.show(); // it acess B class 

    }
    
}
