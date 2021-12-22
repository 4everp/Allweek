public class Array_ForEach{
    public static void main(String[] args) {
        String [] name = {"นายป๊อก","นายตู่","นางสาวปารีณา","นายป้อม","นายเสี่ยโอ",}
        system.out.println(name.length);
       int i =1;
        For (String showName : name){
            system.out.println(i+". "+showName);
            i++;
        }

        int [] number = {1,2,3,4,5,6,7,8,9};
        int sum =0;
        For (int j : number){
            if (i == number){
                system.out.println(i+",");  
            }
            sum = sum+j;

        }
   
     }     
}

 //     for (int i =0; i < name.length; i++) {
    //         boolean check name[i].startWith("นาย");
    //         if(check) {
    //             system.out.print(name[i]);
    //             system.out.println("เพศชาย");
            
    //         } else {
    //             system.out.print(name[i]);
    //             system.out.println("เพศหญิง");
    //         }
    //     }