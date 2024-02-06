package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Binary search");

    }
    // Time complexity 0(n)
    public int binarySearch(int[] arr,int key){
        int low = 0;
        int high = arr.length - 1;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key) return mid;
            if (key < arr[mid]) high = mid -1;
            else low = mid + 1;
        }
        return -1;
    }

    // Find Insertion position in sorted array
    public int searchInsert(int []arr,int target){
        int low = 0,high = arr.length-1;
        while (low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target) return mid;
            if(target<arr[mid]) high = mid-1;
            else low = mid + 1;
        }
        return low;
    }
    
}
