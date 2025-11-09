class Calc{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }
}
class AdvCalc extends Calc{
    public int div(int n1, int n2){
        return n1/n2;
    }
    public int multi(int n1,int n2){
        return n1*n2;
    }
}
public class oop19 {
        public static void main(String[] args) {
            //An AdvCalc is a Calc (so it can add and sub)
            //but a Calc is not an AdvCalc (so it can't div or multi).
            AdvCalc obj = new AdvCalc();
            int r1 = obj.add(4,6);
            int r2 = obj.sub(8,5);
            int r3 = obj.div(10,5);
            System.out.println(r1+";"+r2+";"+r3);
        }
}
