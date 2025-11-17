class A{
    /*public void show(){
        System.out.println("In show");
    }
    public void config(){
        System.out.println("In Config");
    }*/
    public int add(int n1, int n2){
        return n1+n2;
    }
}
class B extends A{
    /*public void show(){
        System.out.println("In B Show");
    }*/
   public int add(int n1,int n2){
       return n1+n2+1;// it must have different behaviour
    }
}
public class oop22 {

    public static void main(String[] args) {
        B obj  = new B();
        //obj.show();
        //obj.config();
        int r1 = obj.add(3,4);
        System.out.println(r1);
    }
}
