package javaapplication43;

public class JavaApplication43 {
 
    public static void main(String[] args) {
            String arr [][] = new String[4][4]; //make it a 4x4 2D array as requested
      //input the names in the correct positions
      arr[0][0] = "Zanele";
      arr[0][1] = "  Justice";
      arr[0][2] = "  Ken";
      arr[0][3] = "    Daniel";
      arr[1][0] = "Lebo";
      arr[1][1] = "    Tebu";
      arr[1][2] = "     Gugu";
      arr[1][3] = "   Fabian";
      arr[2][0] = "Ndaba";
      arr[2][1] = "   Mudau";
      arr[2][2] = "    Zizile";
      arr[2][3] = " Kagiso";
      arr[3][0] = "Andrew";
      arr[3][1] = "  Tian";
      arr[3][2] = "     Ruan";
      arr[3][3] = "   Xoliswa";
      
      //print those names in the position that was requested
      System.out.println(arr[0][0] + arr[0][1] + arr[0][2] + arr[0][3]);
        System.out.println(arr[1][0] + arr[1][1] + arr[1][2] + arr[1][3]);
        System.out.println(arr[2][0] + arr[2][1] + arr[2][2] + arr[2][3]);
        System.out.println(arr[3][0] + arr[3][1] + arr[3][2] + arr[3][3]);
    }
}

