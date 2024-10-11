import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[];
        int size;
        int index;

        do {
            System.out.print("Enter the size of the array: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        arr = new int[size];

        System.out.print("Enter the number which you want to add: ");
        int number = scanner.nextInt();
        do {
            System.out.print("Enter the index position: ");
            index = scanner.nextInt();
            if (index < 0 || index > arr.length) {
                System.out.println("Index out of bounds. Can't add the number into the array");
            }
        } while (index < 0 || index > arr.length);
        arr[index] = number;
        for (int x: arr) {
            System.out.print(x + "\t");
        }
    }
}
