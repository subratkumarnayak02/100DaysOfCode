import java.util.*;

public class BinarySearch {
    public static void main(String [] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
            int size = input.nextInt();

            if(size<=0){
                System.out.println("Please enter a number greater than 0");
                System.exit(0);
            }
            int[] arr1 = new int[size];
            System.out.println("Enter the Elements of an Array");

            for (int i = 0; i < size; i++) {
                arr1[i] = input.nextInt();
            }

            Arrays.sort(arr1);

            System.out.println("Array after sorting: ");
            for(int i=0;i<size;i++){
                System.out.print(arr1[i]+" ");
            }
            System.out.println("\nEnter the Element to search");

            int num = input.nextInt();
        
            
        int last = size - 1;
        binarySearch(arr1, 0, last, num);
    }
    public static void binarySearch(int arr1[], int first, int last, int num) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr1[mid] < num) {
                first = mid + 1;
            } else if (arr1[mid] == num) {
                System.out.println("Element is at: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element not found!");
        }
    }
}
