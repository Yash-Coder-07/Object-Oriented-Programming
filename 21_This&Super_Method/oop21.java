class A{
    public A(){
        super();
        System.out.println("In A");
    }
    public A(int n){
        super();
        System.out.println("In A int");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("In B");
    }
    public B(int n){
        this();// this wil exceute constructor of same class and then super class 
        System.out.println("In B int");
    }
}

public class oop21 {
    public static void main(String[] args) {
       B obj = new B(5);

    }
}