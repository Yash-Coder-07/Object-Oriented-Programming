@FunctionalInterface
interface A{
    int add(int i,int j);
}
public class oop37_2 {
    public static void main(String[] args) {
        
        A obj =(int i,int j) -> 
        {
            return i+j;
        };
        int result = obj.add(5,7);
        System.out.println(result);
    }
}
