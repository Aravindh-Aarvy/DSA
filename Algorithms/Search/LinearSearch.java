
import java.util.*;
class LinearSearch {
    public static void main(String[] args) {
        
        
       int [] arr = {9,2,5,7,1};
       int target = 8;
       
       int val = linearSearch(arr, target);
       
       if(val == -1)
            System.out.println("Target value not present in list");
        
        else
           System.out.println("Target value present in index "+ val);
       
    }
    
    public static int linearSearch(int [] arr , int target){
        int size = arr.length;
        for(int i=0; i<size; i++){
           if(arr[i] == target){
              return i;
           }
       }
       return -1;
    }
}
