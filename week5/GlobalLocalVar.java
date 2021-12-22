public class GlobalLocalVar{
    public static void main(String[] args) {
        //ตัวเเปรแบบ Global
        int a = 100;
        int b = 200;
        
        System.out.println(a);
        {
        //ตัวเเปรแบบLocal
        int c = 300;
        System.out.println(c);
        System.out.println(a);
        }
    }
}