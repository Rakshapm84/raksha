import java.util.Scanner;

public class array8 {
    public static void main(String[] args){
        /*int array[][]={// directly we can print
                {2,8,1},
                {5,2,8},
                {4,0,2}
        };*/
        Scanner sc=new Scanner(System.in);//user input
        System.out.println("Enter the number of rows and colms");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] array=new int[r][c];
        System.out.println("Enter the array elements");

        for(int i=0;i<r;i++){// if we dont no the ARRAy size
            for(int j=0;j<c;j++){// until it false it will iterate

                array[i][j]=sc.nextInt();

            }
            System.out.println();
        }
        for(int i=0;i<r;i++){// if we dont no the ARRAy size
            for(int j=0;j<c;j++){// until it false it will iterate

                System.out.print(array[i][j]);

            }
            System.out.println();
        }
    }
}
