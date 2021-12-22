
public class StringMt{
    public static void main(String[] args) {
        String name = "Natthaphong";
        String city = new String("Nakhon Pathom");

        system.out.println(name);

        //การต่อสตริง  .concat()
        system.out.println(name+city);

        String result = name+city;
        system.out.println(result);

        String result2 = name+city+" .com";
        system.out.println(result);

        system.out.println(result2.concat(".ac.th"));//อันเดียวกัน

        system.out.println(result2+".ac.th");//อันเดียวกัน

        //หาความยาวของสตริง .Length()
        system.out.println(name.length());

         int count = name.length();
         system.out.println(count);

         //หาตำเเหน่งตัวอักษรในข้อความ .charAt()
         system.out.println(name.charAt(0));

         char  characters = name.charAt(0);
         system.out.println(characters);


    }
}
    
