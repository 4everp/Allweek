public class RuleOfName{
    public static void main(String[] args) {
        // สามารถมีตัวเลข  ตัวอักษร และเครื่องหมาย ประกอบกันได้ _ $
        //การประกาศตัวแปร => ชนิดตัวแปร ชื่อตัวแปร = ค่าของข้อมูล;
        int num$01 = 10;
        System.out.println(num$01);

        //ห้ามซ้ำกับคำสงวน
        // case sentitive 
        int Num1 = 15;
        int num1 = 50;
        System.out.println(Num1);
        System.out.println(num1);

        int a=1 , b=2 , c=3 , d ;
        
        final int NUM2=20; //ค่าคงที่
        int num3=30;

        System.out.println(NUM2);
        System.out.println(num3);

        //num2=50;
        System.out.println(NUM2);
    }
}