ppublic class WhileLoop_001{
    public static void main(String[] args) {
       
        
        
        int count = 0;   // ค่าเริ่มต้น
        while (true) {   // เงื่อนไข      
            count++;    // update รอบ
            System.out.println("รอบที่" +count+ "Java");   // ค่าที่ต้องการแสดงผล
            if (count==1000){
                break;
            }
         }
    }
}