public class Comm{
    public static void main(String[] args) {
        int n = 7 ; 
        // num คือ ตัวเลขที่ต้องการตรวจสอบ
        int check = n % 2;
        if (check != 0 ) {
            System.out.println(n + " is even number");
        } else {
            System.out.println(n + " is odd number");
        }
        System.out.println("End program");
    }
}