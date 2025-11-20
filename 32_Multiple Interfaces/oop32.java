// class - class => extends
// class-interface => implements
// interface -interface => extends
interface A{
    int age =20;
    String area ="Yash";
    void show();
    void config();
}
interface X{
    void run();
}
interface Y extends X{
    
}

class B implements A,X{
    public void show(){
        System.out.println("In a Show");
    }
    public void config(){
        System.out.println(area);
    }
    public void run(){
        System.out.println("Running");
    }
}
public class oop32 {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        X obj1 = new B();
        obj1.run();
    }
}
