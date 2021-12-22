import java.util.Scanner;
public class IfElse_Login{
    public static void main(String[] args) {
       String username db = "root";
       String password db = "3333";

       Scanner kb = new Scanner(System.in);

        System.out.print("Enter Username");
       String username =kb.nextLine();
       System.out.print("Enter Passwored");
       String Passwored =kb.nextLine();
       
        if(username.equals(username_db) && (password.equals(password_db))) {
            System.out.println("You are Login");
        }else{
            System.out.println("You are not Admin");
        }    
    }

}