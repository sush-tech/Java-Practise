public class Assg_1_4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++)
            {
                 if(i==1||j==4||j==1||i==4)
                 {  System.out.print("$");}  //do not give space between "" and $
                else
                 { System.out.print(" ");}
            }
            System.out.println("");
        }

    }
}