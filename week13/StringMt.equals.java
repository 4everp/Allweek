public class StringMt.equals{
    public static void main(String[] args) {
        String lastname1 = "Soison";
        String lastname2 = "soison";

        // เปรียบเทียบเท่ากัน . equals()
        boolean result = lastname1.equals(lastname2);
        //system.out.println(result);

         // เปรียบเทียบเท่ากันไม่สนใจอักษรเล็กใหญ่ . equals()
         boolean result2 = lastname1.equalsIgnoreCase(lastname2);

        if(result2) {
            system.out.println(lastname1 + " เท่ากับ " +lastname2);
        }else{
            system.out.println(lastname1 + " ไม่เท่ากับ " + lastname2);
        }

    }
}