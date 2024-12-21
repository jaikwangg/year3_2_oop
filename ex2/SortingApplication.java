package ex2;

import java.util.Scanner;

public class SortingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortingAlgorithm algorithm = null;

        System.out.println("Choose a sorting algorithm:");
        System.out.println("1. Selection Sort");
        System.out.println("2. Merge Sort");
        System.out.println("3. Insertion Sort");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                algorithm = new SelectionSort();
                break;
            case 2:
                algorithm = new MergeSort();
                break;
            case 3:
                algorithm = new InsertionSort();
                break;
            default:
                System.out.println("Invalid choice! Try again!");
                
        }

        algorithm.sort();
        sc.close();
    }
}
