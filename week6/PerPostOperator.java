public class PerPostOperator {
    public static void main(String[] args) {
        // declare variable
        int x = 5, y = 4;
        int ans;
        // Increment [++]
       // num++; // num = num+1 
       // num = num+1;
       System.out.println("x = " + x);
       System.out.println("y = " + y);

       //ans = x + ++y;
       ans = x + y++;
       System.out.println("ans = " + ans);
       System.out.println("y = " + y);


        //System.out.println("num = " + num );