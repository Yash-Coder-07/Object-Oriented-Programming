class A{
    public void show(){
        System.out.println("In A show");
    }
}

public class oop30_2 {
    public static void main(String[] args) {
        // below is Anonymous class
        // Same also work with Abstract class no need to override class and for multiple methods.
        A obj = new A(){
            public void show(){
                System.out.println("In a new show");
            }
        };
        obj.show();
    }
}
