package DivideAndConquer;

public class SortString {

    //return true if s1 appears before s2 in alphabetical order
    public static boolean isAlphabeticallySmaller(String str1, String str2){
        if(str1.compareTo(str2) < 0){
            return true;
        }
        return false;
    }

    public static String[] merge(String[] arr1, String[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String[m + n];
        
        int idx = 0;
        int i = 0; 
        int j = 0;

        while(i < m && j < n){
            if(isAlphabeticallySmaller(arr1[i], arr2[j])){
                arr3[idx] = arr1[i];
                idx++;
                i++;
            } else {
                arr3[idx] = arr2[j];
                idx++;
                j++;
            }
        }

        //if left part element remain
        while(i < m){
            arr3[idx] = arr1[i];
            i++;
            idx++;
        }

         //if right part element remain
        while(j < n){
            arr3[idx] = arr2[j];
            idx++;
            j++;
        }

        return arr3;
    }

    public static String[] sort(String[] arr, int si, int ei){
        //base case
        if(si == ei){
            String[] A ={ arr[si]};
            return A;
        }

        //divide the array
        int mid = si + (ei - si)/2;
        String[] arr1 = sort(arr, si, mid);
        String[] arr2 = sort(arr, mid + 1, ei);

        String[] arr3 = merge(arr1, arr2);
        return arr3;

    }
    public static void main(String[] args){
        String[] arr = { "sun", "earth", "mars", "mercury"};
        String[] sortedArray = sort(arr, 0, arr.length-1);
        print(sortedArray);
    }

    private static void print(String[] sortedArray) {
        for(int i = 0; i < sortedArray.length; i++){
            System.out.print(sortedArray[i]+" ");
        }
    }
}
