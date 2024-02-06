public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Linear Search");
        int[] arr = new int[5];


    }
    public int Search(int[] arr,int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i]==x) return i;
        }
        return -1;
    }
}
