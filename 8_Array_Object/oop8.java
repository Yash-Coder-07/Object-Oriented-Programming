class Student{
    int rollno;
    String name;
    int marks;
}
public class oop8 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Yash";
        s1.marks =90;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Pranav";
        s2.marks =80;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Himanshu";
        s3.marks =85;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name+" :"+students[i].marks);
        }

        /*int[] nums= new int[6];
        nums[0] =4;
        nums[1] = 6;
        nums[2] = 7;
        nums[3] = 8;
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }*/
    }
}
