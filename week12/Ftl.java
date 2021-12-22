import java.util.scanner;
public class Ftl{
    public static void main(String[] args) {
       scanner kb = new scanner(system.in);
       system.out.prinlt("Enter Number :");
       int number = kb.nextInt();
       
       int i =1;
       int result=1;

       system.out.prinlt(number+t" ! ==> ";)
       while(i <=number){
           if(i==number){
            system.out.print(i);
           }else{
            system.out.print(i+"x");
           }
        system.out.print(i+"x");
        result = result*i;
        i++;
    
        }
        system.out.print(" = "+result);
    }
}