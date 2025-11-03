class MyCalculator{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public double add(double n1, int n2)
    {
        return n1+n2;
    }
    public int add(int n1,int n2, int n3)
    {
        return n1+n2+n3;
    }
}
public class oop4{
    public static void main(String[] args) {
        MyCalculator obj = new MyCalculator();
        int r1 = obj.add(3,2);
        System.out.println(r1);
        int r2 = obj.add(4,1,3);
        System.out.println(r2);
        double r3 = obj.add(3,6);
        System.out.println(r3);
    }
}