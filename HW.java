public class HW{
    public static void main(String[] args) {
        String[] name = {"นายประยา มาดี","นางปารีนา จัดจ้าน","นางสมคิด คิดไม่ออก","นายสบาย ดี","นางสาววิภา นาคี"};
        System.out.println("มีรายชื่อประกอบ" + name.length + "คน");

        for (int i =0; i < name.length; i++){
            boolean check = name[i].startsWhith("นาย");
            if (check) {
                System.out.println((i+1) +name[i] + " ==> " + "เพศชาย");
            } else {
            System.out.println((i+1) +name[i] + " ==> " + "เพศหญิง");
            }
        }
    }
}