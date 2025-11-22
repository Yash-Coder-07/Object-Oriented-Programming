enum Laptop{
    MacBook(2000), XPS(2200), Surface ,ThinkPad(1000);

    private int price;

    
    private Laptop() {
        price = 500;
    }
    private Laptop(int price){
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    


}
public class oop34 {
    public static void main(String[] args) {
        
        Laptop lap  = Laptop.MacBook;
        //System.out.println(lap);
        //System.out.println(lap.getPrice());

        for(Laptop lap1 :Laptop.values()){
            System.out.println(lap1+": "+lap1.getPrice());
        }

    }
}
