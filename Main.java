import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();   // move to next line

        int[][] M = new int[R][C];

        for(int i = 0; i < R; i++){
            String row = sc.nextLine();

            for(int j = 0; j < C; j++){
                M[i][j] = row.charAt(j) - '0';
            }
        }

        int maxCount = 0;
        int rowIndex = -1;

        for(int i = 0; i < R; i++){
            int count = 0;

            for(int j = 0; j < C; j++){
                if(M[i][j] == 1){
                    count++;
                }
            }

            if(count > maxCount){
                maxCount = count;
                rowIndex = i + 1;   // 1-based row number
            }
        }

        System.out.println(rowIndex);
    }
}