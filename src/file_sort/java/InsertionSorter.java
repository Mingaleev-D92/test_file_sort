
public class InsertionSorter {
    public InsertionSorter() {
    }

    public static void sortIntArray(int[] arr, boolean isAscending) {
        for(int i = 1; i < arr.length; ++i) {
            int tmp = arr[i];

            int j;
            for(j = i - 1; j >= 0; --j) {
                if (isAscending) {
                    if (arr[j] <= tmp) {
                        break;
                    }
                } else if (arr[j] >= tmp) {
                    break;
                }

                arr[j + 1] = arr[j];
            }

            arr[j + 1] = tmp;
        }

    }

    public static void sortStringArray(String[] arr, boolean isAscending) {
        for(int i = 1; i < arr.length; ++i) {
            String tmp = arr[i];

            int j;
            for(j = i - 1; j >= 0; --j) {
                if (isAscending) {
                    if (arr[j].compareTo(tmp) <= 0) {
                        break;
                    }
                } else if (arr[j].compareTo(tmp) >= 0) {
                    break;
                }

                arr[j + 1] = arr[j];
            }

            arr[j + 1] = tmp;
        }

    }
}
