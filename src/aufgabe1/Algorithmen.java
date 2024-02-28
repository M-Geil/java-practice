package aufgabe1;
public class Algorithmen {
    public static boolean isSorted (int[] Array) {
        for (int i = 0; i < Array.length - 1; i++) {
            if (Array[i] > Array[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static int[] sort (int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            for (int j = i + 1; j < Array.length; j++) {
                int tmp = 0;
                if (Array[i] > Array[j]) {
                    tmp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = tmp;
                }
            }
        }
        return Array;
    }
    public static boolean binarySearch (int[] Array, int x) {
        if (!isSorted(Array)) {
            sort(Array);
        }
        int low = 0;
        int high = Array.length - 1;
        while (low <= high) {
            int mid = (low  + high) / 2;
            if (Array[mid] == x) {
                System.out.println(x + " ist vorhanden");
                return true;
            }
            else if (Array[mid] < x) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        System.out.println(x + " ist nicht vorhanden");
        return false;
    }
}