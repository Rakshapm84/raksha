import java.util.Scanner;

public class array4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente the size of the array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = sc.nextInt();//user input
        }
        //for (int i = 0; i < array.length; i++)
        //{
            System.out.println(array);
        }
    }
