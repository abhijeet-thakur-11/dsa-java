public class sort {
    
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
