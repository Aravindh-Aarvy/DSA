
class SelectionSort {
    public static void main(String[] args) {
        
        int[] arr = {5,25,84,2,5,8,224,78,4,124};
        print(sort(arr));
    }
    
    static int[] sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min_index = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[min_index]){
                    
                    min_index = j;
                }
             }
             int temp = arr[min_index];
             arr[min_index] = arr[i];
             arr[i] = temp;
            
        }
        return arr;
        
    }
    
    static void print(int [] arr){
        for(int k: arr)
        System.out.print(k + "\t");
        

    }
}
