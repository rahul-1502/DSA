public class BubbleSort {
    public static void main(String[] args) {

    }
    // Largest element pop at end at end at enery iteration and sorts the array
    public void Sort(int[] arr){
        int n = arr.length;
        boolean isSwaped ;
        for(int i=0;i<n-1;i++){
            // this helps to check if more array is sorted or got sorted in mid and need not nay more swap
            isSwaped = false;
            // On every iteration largest element will we at end
            for (int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwaped = true;
                }
            }
            // this means array got sorted
            if(!isSwaped) break;
        }
    }
}
