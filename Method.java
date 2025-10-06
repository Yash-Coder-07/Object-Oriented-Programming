public class Method {
    public static void main(String[] args) {
          Computer obj = new Computer();
          obj.playMusic();
          String str = obj.getMeAPen(12);
          System.out.println(str);
    }
}

class Computer{
//For every method, we also have to specify the type of access to it.

    public void playMusic(){
        System.out.println("Music is playing..");
    }
//We can pass also pass values in a method.
    public String getMeAPen(int num){
        if(num>=10){
            return "Pen";
        }
        return "Nothing";
    }
}
