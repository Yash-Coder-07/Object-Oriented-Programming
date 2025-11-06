class Human{
    private int age =11;
    private String name="Yash";

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        age = a;
    }
    public void setName(String s){
        name = s;
    }
}
public class oop15 {
    public static void main(String[] args) {
        Human obj = new Human();
        // private variable can access by getters methods
        // assign value to private variable by setters methods
        obj.setAge(20);
        obj.setName("Yash");
        System.out.println(obj.getName()+": "+obj.getAge());
    }
}