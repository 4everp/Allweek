import java.util.Scanner;
public class Bmi{
    public static void main(String[] args) {
     Scanner kb = new Scanner(System.in);
     
     System.out.print("ป้อนน้ำหนัก(kg) : ");
     float kg = kb.nextFloat();
     System.out.print("ป้อนความสูง(m) : ");
     float m = kb.nextFloat();


     System.out.print("น้ำหนัก = "+kg);
     System.out.print("ส่วนสูง = "+m);

     float bmi = kg/(m*m);
     System.out.println("ค่าดัชนีมวลกาย(BMI) = "+bmi);
     kb.close();
    }
}