public class Array_LoopData{
    public static void main(String[] args) {
        String [] car = {"BMW","FORD","TOYOTA","TESLA"};
        //วนลูปในอาเรย์
        for (int i = 0; i < car.length; i++){
            system.out.println("สมาชิกตำแหน่งที่ " + i + "มีค่าเท่ากับ " + car[i]);
        }

        for (int i = 0; i < car.length; i++){
            system.out.println("สมาชิกช่องที่ "+ i +" มีค่าเท่ากับ " + car[i]);
        }
       
    }
}