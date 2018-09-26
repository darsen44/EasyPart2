
// Task 2,8,9
public class Array {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        int arr3[] = new int[9];
        random(arr);
        int j = 1;
        printArr(arr);
        System.out.println("Changed array (zero): ");
        zeroing(arr, j);
        printArr(arr);
        System.out.println("Changed array (change column): ");
        change(arr, arr2);
        printArr(arr2);
        directArray(arr2, arr3);
        System.out.println("Changed array (to 1D array): ");
        printArr(arr3);
    }

    private static void directArray(int[][] arr2, int[] arr3) {
        for (int i = 0, k = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr3[k] = arr2[i][j];
                k++;
            }
        }
    }

    private static void change(int[][] arr, int[][] arr2) {
        for (int i = 0, s = 2; i < arr.length; i++, s--) {
            for (int j = 0, k = 0; j < arr[i].length; j++, k++) {
                arr2[i][j] = arr[k][s];
            }
        }
    }

    private static void zeroing(int[][] arr, int j) {
        for (int i = 0; i < arr[j].length; i++) {
            arr[i][j] = 0;
        }
    }

    private static void random(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    private static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }
    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }


}
