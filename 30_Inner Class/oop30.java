class A{
    int age;
    public void show(){
        System.out.println("In show");
    }
    class B{
        public void config(){
            System.out.println("In config");
        }
    }
}
public class oop30 {
   public static void main(String[] args) {
    A obj = new A();
    obj.show();

    A.B obj1 = obj.new B();
    // If class B is static then A.b obj1 = new A.B();
    obj1.config(); 
   } 
}
