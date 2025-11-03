class Calculator{
    int a;
    public int add(int x1,int x2){
        int result = x1+x2;
        return result;
    }
}
public class oop{
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        Calculator calc = new Calculator();
        int result = calc.add(num1,num2);
        //int result = num1 + num2;
        System.out.println(result);
    }
}