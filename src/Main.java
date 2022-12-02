import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Длинна массива = ");
        int FirstNum = input.nextInt();

        System.out.println("Максимальное значение в массиве = ");
        int SecNum = input.nextInt();

        int[] array = new int[FirstNum];
        

        for (int i = 0; i< array.length; i++); {
            int i = 0;
            array[i] = ((int)(Math.random() * SecNum));
            System.out.print(array[i] + " ");
        }
    }
}