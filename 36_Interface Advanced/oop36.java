@FunctionalInterface
// it has only one method in Functional Interface
interface A{
    void show();
}
/*class B implements A{
    public void show(){
        System.out.println("In Show");
    }
}*/
public class oop36 {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("In show");
            }
        };
        obj.show();
        
    }    
}
