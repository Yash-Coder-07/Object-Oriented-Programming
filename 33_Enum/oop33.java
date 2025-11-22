// status is class here and all that 4 are object
enum Status{
    Running, Failed, Pending, Success;
}

public class oop33 {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s); 
        //Based on numbering it starts fom zero 
        //System.out.println(s.ordinal()); 

        // For printlng all 
        Status[] ss = Status.values();
        System.out.println(ss); // this print adress
        
        for(Status s1:ss){
            System.out.println(s1 +": "+s1.ordinal());
        }
    }    
}
