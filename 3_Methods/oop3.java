class Computer{
    public void playMusic(){
        System.out.println("Music Playing...");
    }

    public String getMePen(int cost){
        if(cost>=10){
            return "Pen";
        }
        return "need more amount";
    }
}
public class oop3 {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMePen(10);
        System.out.println(str);
    }    
}

