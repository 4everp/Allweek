public class StringMt_startEnd{
    public static void main(String[] args) {
        String fullname = "นายสมชาย สายเสมอ";

        //หาตำแหน่งของคำจากด้านหน้า .startsWith()
       boolean result = fullname.startsWith(นาย);

       if (result) {
        system.out.println(fullname +"เพศชาย");
       } else{
        system.out.println(fullname +"เพศหญิง");
       }

         //หาตำแหน่งของคำจากด้านหลัง .endWith()

         String code = "123456TH";
        boolean result1 = code.endWith("TH");

        if (result) {
            system.out.println("สินค้า" + code  + "มาจากประเทศไทย");
           } else{
            system.out.println("สินค้า" + code  + "ไม่ได้มาจากประเทศไทย");
           }
           
    }
}