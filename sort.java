public class sort {
    public static void printArray(int a[]){
        for(int i =0 ; i<a.length ; i++){
            System.out.println(a[i]);
        }
    }
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
*//* 
    
    //Merge sort 
    int arry[] = {3,8,19,6,};
    for (int size = 1; size < arry.length; size = 2 * size) {
        for (int left = 0; left < arry.length - 1; left += 2 * size) {
            int mid = (left + size - 1 < arry.length - 1) ? (left + size - 1) : (arry.length - 1);
            int right = (left + 2 * size - 1 < arry.length - 1) ? (left + 2 * size - 1) : (arry.length - 1);

            int merged[] = new int[right - left + 1];
            int i = left, j = mid + 1, k = 0;

            while (i <= mid && j <= right) {
                if (arry[i] <= arry[j]) {
                    merged[k++] = arry[i++];
                } else {
                    merged[k++] = arry[j++];
                }
            }
            while (i <= mid) merged[k++] = arry[i++];
            while (j <= right) merged[k++] = arry[j++];

            for (int m = 0; m < merged.length; m++) {
                arry[left + m] = merged[m];
            }
        }
    }
    printArray(arry);
     */
    


}
}

