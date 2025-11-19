abstract class Car{
    public abstract void drive();
    public void playmusic(){
        System.out.println("Play Music");
    }
}
class WagonR extends Car{
    public void drive(){
        System.out.println("Driving");
    }
}
public class oop29 {
    public static void main(String[] args) {
        // cannot create object of abstract class
        Car obj = new WagonR();
        obj.drive();
        obj.playmusic();
    }
}