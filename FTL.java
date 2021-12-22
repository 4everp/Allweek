import java.util.Scanner;

public class FTL {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in); // ประกาศตัวแปรที่ใช้รับค่าจากคีบอร์ด
      System.out.println(" ป้อนตัวเลข");
      System.out.print("Please input n : ");
      
      int result = 1;
      int n = scan.nextInt(); // รับค่าจากคีบอร์ดมาเก็บในตัวแปร n

      for (int i = n; i >= 1; i--) { // n! = n * (n - 1) * (n - 2) * ... * 1
         result *= i; // วนลูปนำผลคูณที่ได้มาเก็บใน result
      }

      System.out.println("Result = " + result); // แสดงผลลัพธ์ Factorial
   }
}
