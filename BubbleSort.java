public class BubbleSort {

        // Implementation 1
	public static void sort(int[] array) {
            int n = array.length;
            for (int i = 0; i < n; i++) {
        	for (int j = 1; j < n - 1; j++) {
        		if (array[j - 1] > array[j]) {
        			swap(array, j - 1, j);
        		}
        	}
            }
	}
        
        // Implementation 2
        public static void sort2(int[] array) {
            boolean swapped = true;
            int j = 0;
            while (swapped) {
                swapped = false;
                j++;
                for (int i = 0; i < array.length - j; i++) {
                    if (array[i] > array[i + 1]) {
                        swap(array, i, i + 1);
                    }        
                }
            }        
        }

	private static void swap(int[] array, int i, int j) {
	    int temp = array[i];
	    array[i] = array[j];
	    array[j] = temp;
	}
}