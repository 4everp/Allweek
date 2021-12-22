import java.util.scanner;
public class Ftl2{
    public static void main(String[] args) {
       scanner kb = new scanner(system.in);
       system.out.prinlt("Enter Number :");
       int number = kb.nextInt();
       // output 4! ==> 4x3x2x1 =24
       
       int i =number;
       int result=1;

       system.out.prinlt(number+t" ! ==> ";)
       while(i >=1){
           if(i==number){
            system.out.print(i);
           }else{
            system.out.print("x+"+1);
           }
        system.out.print(i+"x");
        result = result*i;
        i--;
    
        }
        system.out.print(" = "+result);
    }
}