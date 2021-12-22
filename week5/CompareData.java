public class CompareData{
    public static void main(String[] args) {
        //การเปรียบเทียบผลลัพธ์จะได้  Teur / False
        int a = 10 , b = 5;

       
        System.out.println(a+" มีค่าเท่ากับ "+ b + " หรือไม่ ? " + (a==b)); // = =
        System.out.println(a+" มีค่าไม่เท่ากับ "+ b + " หรือไม่ ? " + (a?b));
        System.out.println(a+" มีค่าน้อยกว่า "+ b + " หรือไม่ ? " + (a<b));
        System.out.println(a+" มีค่ามาก "+ b + " หรือไม่ ? " + (a>b));
        System.out.println(a+" มีค่าน้อยกว่าหรือเท่ากับ "+ b + " หรือไม่ ? " + (a<=b));
        System.out.println(a+" มีค่ามากกว่าเท่ากับ "+ b + " หรือไม่ ? " + (a>=b));
        
    }
}
    
