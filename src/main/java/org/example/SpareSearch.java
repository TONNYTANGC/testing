package org.example;

public class SpareSearch {
    public static int findString(String[] arr, String target) {
        if (arr == null || target == null || target.isEmpty()) {
            return -1;
        }
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    private static int binarySearch(String[] arr, String target, int left, int right) {
        while (left <= right) { // left = 0 and right = 13
            int mid = (left + right) / 2; // mid = 6

            // If mid is an empty string, move to nearest non-empty string (to find out the nearest non-empty middle array element)
            if (arr[mid].isEmpty()) { // arr[6] = ""
                int l = mid - 1; // l = 5
                int r = mid + 1; // r = 7
                while (true) {
                    if (l < left && r > right) {
                        return -1; // no non-empty string found
                    } else if (r <= right && !arr[r].isEmpty()) {
                        mid = r;
                        break;
                    } else if (l >= left && !arr[l].isEmpty()) {
                        mid = l;
                        break;
                    }
                    r++;
                    l--;
                }
            }

            // Compare mid value with target
            if (arr[mid].equals(target)) {
                return mid; // found target
            } else if (arr[mid].compareTo(target) < 0) {
                left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        String[] arr = {
                "cat", "", "dog", "", "", "", "elephant", "", "lion", "", "", "tiger", "", ""
        };

        String target = "tiger";
        int index = findString(arr, target);
        System.out.println("Index of \"" + target + "\": " + index);
    }
}
