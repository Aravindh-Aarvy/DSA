class BinarySearch {
    
    static int binarySearch(int arr[], int target) {
        int start = 0; 
        int end = arr.length - 1;
        
        while (start <= end) {
            // Calculate the middle index
            // Using `start + (end - start) / 2` instead of `(start + end) / 2` to avoid integer overflow
            // Explanation: 
            // - `(end - start)` gives the distance between `start` and `end`.
            // - Dividing by 2 gives half the distance.
            // - Adding `start` ensures we get the correct middle index in the current search space.
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } 

            // - Update `start` to `mid + 1` to exclude `mid` and all elements before it.
            else if (arr[mid] < target) {
                start = mid + 1;
            } 

            // - Update `end` to `mid - 1` to exclude `mid` and all elements after it.
            else {
                end = mid - 1;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 7, 9, 11, 22, 33, 44, 55, 56, 789, 1094};
        int target = 789;
        
        int result = binarySearch(arr, 1094);
  
        if (result != -1) {
            System.out.println("Value found at index " + result);
        } else {
            System.out.println("Value not found in the array");
        }
    }
}
