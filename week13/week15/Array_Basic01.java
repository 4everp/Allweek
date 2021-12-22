public class Array_Basic01{
    public static void main(String[] args) {
        //การประกาศตัวแปรแบบ array
        //แบบที่1 ประกาศแบบกำหนดสมาชิก
        int [] number ={1,2,3,4,5,6,7,8,};

        int size =number.length;

        system.out.println(size);
        system.out.println(number.length);// หาความยาวอาเลย์
        system.out.println(number[3]);//เข้าถึงตำแหน่งตัวแปร
        number[3] = 31; //  การเปลี่ยนค่าข้อมูลในตัวแปร
        system.out.println(number[3]);

        //แบบที่2 ประกาศแบบกำหนดขนาด
        
        char [] alphabet;  //ประกาศอาเรย์
       alphabet = new char[26]; //สร้างอาเรย์

       char [] alphabet = new char[26]; //ประกาศและสร้างอาเรย์
       alphabet[0] = 'a';
       alphabet[1] = 'b';
       system.out.println(alphabet[2]);
       system.out.println(alphabet[22]);
       system.out.println(alphabet.length);//หาความยาว

       int []num = new int [10];
       system.out.println(num[9]);


    }
}