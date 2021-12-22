import java.util.Scanner;

public class Ay {
    public static void main( String [] args)throws IOException //แบบตายตัวของโปรแกรมรับค่าและแสดงผล
    {
      BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in)); //แบบตายตัวของโปรแกรมรับค่าและแสดงผล
            int m=1; //กำหนดตัวแปร m ชนิดตัวเลข มีค่าเท่ากับ1      
            int c=0;//กำหนดตัวแปร c ชนิดตัวเลข มีค่าเท่ากับ0  
            int a; //กำหนดตัวแปร a ชนิดตัวเลข
            String  i; //กำหนดตัวแปร i ชนิดตัวอักษร
            String b; //กำหนดตัวแปร b ชนิดตัวอักษร
    do //เริ่มการวนซ้ำ
     {       
           System.out.println(" "); //แสดง " "
           System.out.print ("Input Buddhist years : " ); //แสดง"Input Buddhist years : " 
        i=stdin.readLine(); //กำหนดตัวแปร i มีค่าเท่ากับค่าที่รับมา
          c = Integer.parseInt(i); //ให้ค่า i ที่รับมาเป็นชนิดตัวอักษรเท่ากับค่าcชนิดตัวเลข
             m  = c - 543; //กำหนดให้ mเท่ากับ c บวก 543
                      
          System.out.print ("Christian Year: " + m ); //แสดงค่า"Christian Year: " บวกด้วนค่า m 
          System.out.println(" "); //แสดง " "
          System.out.print ( " Continue please  press 1.If quit program please  press 0 : "  );//แสดง"Continue please  press 1.If quit program please  press 0 : "
        b=stdin.readLine(); //กำหนดตัวแปร b มีค่าเท่ากับค่าที่รับมา
        a=Integer.parseInt(b); //ให้ค่า b ที่รับมาเป็นชนิดตัวอักษรเท่ากับค่าaชนิดตัวเลข
    }
    while ( a == 1);  //จบการวนซ้ำ (กำหนดให้aมีค่าเท่ากันกับ 1)
    }
   
} 
    