public class sort {
    public static void printArray(int a[]){
        for(int i =0 ; i<a.length ; i++){
            System.out.println(a[i]);
        }
    }
    /* 
     //merge sort time complexity :- o(nlogn)
    public static void conquer(int arry[] , int si , int mid , int ei ){
       int merged[] = new int[ei-si+1];
       int idx1 = si ;
       int idx2 = mid+1;
       int x = 0;
       while (idx1 <= mid && idx2 <= ei){
        if (arry[idx1] <=arry[idx2]){
            merged[x++] = arry[idx1++];   
        }
        else {
                merged[x++] = arry[idx2++];
        } 
        }
        while(idx1 <= mid){
            merged[x++] = arry[idx1++];
        }
         while (idx2<= ei){
            merged[x++] = arry[idx2++];
        }
        for(int i = 0 , j=si ; i<merged.length ; i++ , j++){
            arry[j] = merged [i];
        }
    }
    public static void divide(int arry[] , int si , int ei ){
        if (si>= ei ) {
            return;
        }
        int mid  = si + (ei -si)/2;
         divide(arry , si , mid);
         divide(arry , mid+1 , ei);
         conquer(arry , si , mid , ei );

    }
    /* 
   //quick sort time complexity :- worst :- o(n^2) , average :- o(nlogn)
   // worst case occurs when the pivot is always the smallest or the largest element of the array .
   // it can only happen when the array is the sorted array or the reverse sorted array.
    public static int partition(int arry[] , int low , int high ){
        int pivot = arry[high];
        int i = low - 1 ;
        for (int j=low;j<high ; j++){
            if (arry[j] < pivot ){
                i++;
                //swap
                int temp = arry[i];
                arry[i]=arry[j];
                arry[j] = temp;

            }

        }i++;
        //swap the pivot 
        int temp = arry[i];
        arry[i] = pivot;
        arry[high] = temp ;
        return i ;
    }
   /* 
   


    public static void quick(int arry[] , int low , int high){
        if(low <high){
            int pivot = partition(arry, low , high);
            quick(arry , low ,pivot-1);
            quick(arry , pivot+1, high);


        }

    }
   
    */

    
    public static void main(String[] args) {    
    // Bubble sort 
       /*  int[] arry = {3,8,19,6,};

        for(int i=0 ; i<arry.length-1; i++){
            for(int j =0;j<arry.length-1-i ; j++){
                if(arry[j]> arry[j+1]){
                    int temp = arry[j];
                   arry[j]=arry[j+1];
                    arry[j+1]=temp;
                }

            }
        }printArray(arry);
*//* 

    //Selectioon Sort
    int[] arry = {3,8,19,6,};
        for(int i = 0 ; i<arry.length-1 ; i++){
            int smallest = i ;
            for (int j = i+1 ; j<arry.length ; j++){
                if (arry[smallest] > arry[j]){ 
                    smallest = j;  
                }
            }int temp = arry[smallest];
            arry[smallest]=arry[i];
            arry[i]=temp;
        }printArray(arry);
*/
    
    
    
    }
}

