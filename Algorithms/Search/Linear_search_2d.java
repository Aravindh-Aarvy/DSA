class Linear_search_2d{
   public static void main (String [] args){
     int[][] arr = { {1,2,3} , {4,5,6} , {7,8,9} };
    int target = 3;
      linearSearch(arr,target);
   
   }
   
   static void  linearSearch(int[][] arr,int target){
     
     int row =0;
     int column =0;
    boolean found = false;
     for(int[] outer : arr) {
       for (int  inner : outer){
         if(arr[row][column] == target){
           
           System.out.print("row :"+row+"column "+ column);
           found = true;
           break;
         }
         column++;
         
       }
       row++;
       column = 0;
     }
       
       
       if(!found)
                  System.out.print("not Found");

       
   }

}
