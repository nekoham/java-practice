package Lab3;

import java.util.Scanner;

public class Pro32_64010765 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            list2[i] = input.nextInt();
        }

        int[] mergedList = new int[size1 + size2];
        mergedList = merge(list1, list2);

        System.out.print("The merged list is ");
        for (int i = 0; i < mergedList.length; i++) {
            System.out.printf("%d ", mergedList[i]);
        }

        input.close();
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] result = new int[list1.length + list2.length];
        System.arraycopy(list1, 0, result, 0, list1.length);
        System.arraycopy(list2, 0, result, list1.length, list2.length);
        java.util.Arrays.sort(result);

        return result;
    }
}
