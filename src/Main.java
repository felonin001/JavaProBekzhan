import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sv = new Scanner(System.in);
      int n = sv.nextInt();
      int m = sv.nextInt();
      int [][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sv.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int max = array[0][j];
                if(array[i][j]>max){
                    max = array[i][j];
                    System.out.print(max);
                }
            }
            System.out.println();
        }
    }
}




