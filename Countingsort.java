import java.util.*;
public class Countingsort {
    public static void countsort(int arr[]){
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      largest=math.max(largest,arr[i]);
    }


    

    int count[]=new int[largest+1];
    for(int i=0;i<arr.length;i++){
     count(arr[i])++;
    }


        
        
      

    

    for(int i=0;i<count.length;i++){
       while(count[i]>0){
     arr[j]=i;
     j++;

     count[i]--;

    }

}
    }

    public static void  printarr(int arr){
   for(int i=0;i<arr.length;i++){
    System.out.print(arr[i] + " ");

                 

   }
   System.out.print(arr[i] + " ");

                 



    }

    

    public static void main(String args[]){
        int arr[]={1,3,4,5,6};
        countsort(arr);
        printarr(arr);


    }
}



    

    



        

    
    

