import java.util.Scanner;

public class array9 {
    public static void main(String[] atrgs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and column of 1st matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter the rows and column of 2nd matrix");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();


        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] C = new int[r1][c2];
        System.out.println("Enter elements of first matrix:");//lop for matrix
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of Second matrix:");// loop for second matrix
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println("multiplicationw of 2 matrix");//Addition of two matrix
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                C[i][j]=0;// this is for muyltiplication

                for(int k=0;k<c1;k++){// multiplication done through the 1 row 1 column
                    C[i][j] =C[i][j]+A[i][k]* B[k][j];

                }

            }
        }
        System.out.println("Enter elements of Second matrix:");// printing both the matrix
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
