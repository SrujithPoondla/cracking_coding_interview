package sorting;

/**
 * Created by srujithpoondla on 11/21/16.
 */
public class mergesort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,2,2,32,2,5};
        sortarray(arr);
    }

    private static void sortarray(int[] arr) {
        int[] helper = new int[arr.length];
        mergesorting(arr,helper,0,arr.length-1);

    }

    private static void mergesorting(int[] arr, int[] helper, int low, int high) {
        if(low<high){
            int middle=(low+high)/2;
            mergesorting(arr,helper,low,middle);
            mergesorting(arr,helper,middle+1,high);
            merge(arr,helper,low,middle,high);

        }

    }

    private static void merge(int[] arr, int[] helper, int low, int middle, int high) {
        for (int i =low;i<high;i++){
            helper[i]=arr[i];
        }

        int helperleft = low;
        int helperright=middle+1;
        int current = low;
        while (helperleft<=middle && helperright<=high){
            if(helper[helperleft]<=helper[helperright]){
                arr[current]=helper[helperright];
                helperright++;
            }
            current++;
        }
        int remaining = middle-helperleft;
        for(int i=0;i<=remaining;i++){
            arr[current+i]=helper[helperleft+i];
        }
    }
}
