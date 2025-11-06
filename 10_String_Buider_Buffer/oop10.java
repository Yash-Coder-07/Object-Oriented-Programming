public class oop10 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Yash");
        System.out.println(sb.capacity());// always 16 space is available
        System.out.println(sb.length());
        sb.append(" Garale");
        sb.deleteCharAt(2);
        System.out.println(sb);

        //String str = sb.toString();// used to convert string buffer to string.

    }
}
