@FunctionalInterface
interface A{
    void show(int i);
}
public class oop37 {
    public static void main(String[] args) {
// -> this is the lambda Function it only use with Functional Interface
// In case of parametrized function mentioned like below A obj = (int i)->
// else kept it vacant;        
        A obj =(int i) -> 
        {
            System.out.println("In show"+i);
        };
        obj.show(5);
    }
}
