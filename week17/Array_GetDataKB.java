import java.util.Scanner;
public class Array_GetDataKB{
    public static void main(String[] args) {
       Scanner kb = new Scanner (system.in);

       int [] number = new int [2];
      // system.out.println(number.length);

        for(int i =0; i < number.length; i++) {
            system.out.println("enter number : ");
             number [i] = kb.nextInt();
        }
        int sumt=0;
        system.out.println("{");
        for (int i : number) {
            system.out.print(i+",");
             sum=sum+i;
        }
        system.out.println("}");
        system.out.println(sum);
        kb.close();
    }
}