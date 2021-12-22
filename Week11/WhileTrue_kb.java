import java.util.Scanner;
public class WhileTrue_kb{
    public static void main(String[] args) {
        Scanner kb =new Scanner(Scanner.in);

        while(true){
            System.out.println("Enter number : ");
            int number = kb.nextInt();

            if (number==0){
                 break;
            }
        
        }
    }
}