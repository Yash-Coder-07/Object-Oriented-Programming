class A{
    public final void show(){
        System.out.println("By Yash");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
class adv extends A{
    // cannot override method,variable,class with final keyword
    /*public void show(){
        System.out.println("By Pranav");
    }*/
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
public class oop27 {
    public static void main(String[] args) {
        adv obj = new adv();
        obj.show();
        obj.add(5,6);
    }
}
