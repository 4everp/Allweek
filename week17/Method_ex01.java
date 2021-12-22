public class Method_ex01{
    public static void main(String[] args) {
        //ไม่มีการส่งค่าจาก Method main และ ไม่มีการคืนค่ากลับจาก method ลูก
     openFile(); 
     playFile();
     pauseFile();
     closeFile();

    }
    public static void openFile(){
        System.out.println("Open file.............");
    }

    public static void playFile(){
        System.out.println("Play Misic............");
    }
    public static void pauseFile(){
        System.out.println("Stop Misic............");
    }
    public static void closefile(){
        System.out.println("Essit............");
    }
}