public class StringMt_Trim{
    public static void main(String[] args) {
        String fullname = "   Natthaphong Soison   ";

        int count = fullname.length();
        system.out.println(count);
        system.out.println("before => "+fullname);
        // .trim() ตัดช่องว่างหน้าหลังออก

         String result = fullname.trim();
         system.out.println("after ==> "+result);
         system.out.println(result.length());


         // .indexOf() แสดงตำแหน่งที่ของตัวอักษร
         system.out.println(fullname.indexOf("hap"));

         // .toUpperCase()  .toLowerCase()
         system.out.println(result.toUpperCase());
         system.out.println(result.toLowerCase());

         //.substring() การตัดคำที่ต้องการ
        String uni ="Nakhon Pathom Rajabhat University";
        system.out.println(uni.substring(5,12));

    }
} 