import java.util.Scanner;

public class Grade1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Score : ");
        int score = kb.nextInt();

        String result = "";

        if (score >= 120)){
            System.out.println("คะเเนนไม่ถูกต้อง");

        } else if (score >= 80) {
            result = "A";
            System.out.println("Grade = " + result);
        } else if (score >= 70) {
            result = "B";
            System.out.println("Grade = " + result);
        } else if (score >= 60) {
            result = "C";
            System.out.println("Grade = " + result);
        } else if (score >= 50) {
            result = "D";
            System.out.println("Grade = " + result);
        } else if{(score >=0) {
            result = "E";
        System.out.println("Grade = " + result);
        }else{
            result = "คะเเนนไม่ผ่านเกณฑ์";
            System.out.println( result);
        }
        kb.close();
        

    }
}