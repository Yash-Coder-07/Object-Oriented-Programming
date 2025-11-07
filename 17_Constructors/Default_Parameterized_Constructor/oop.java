class Human{
    private int age;
    private String name;

    public Human(){ // default
        age = 20;
        name = "Yash";
    }

    public Human(int age, String name){ // Parametrized
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    

}
public class oop {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 =new Human(22,"Himanshu");
        System.out.println(obj.getAge()+": "+obj.getName());
        System.out.println(obj1.getAge()+":"+obj1.getName());
    }
}
