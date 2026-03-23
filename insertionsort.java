import java.util.*;
public class insertionsort {
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
          int curr=arr[i];
          int prev=i-1; 
          while(prev>=0 && arr[prev]>arr[curr]){
           arr[prev+1]=arr[prev];
           prev--;

          }
          arr[prev+1]=arr[curr];
          

          }
          
        }

     
          
         


        
    

     public static void printarr(int arr[]){
       for(int i=0;i<arr.length;i++){

        System.out.print(arr[i]  + " ");
      }
      System.err.println();

    }
    public static void main(String args[]){
    int arr[]={1,2,3,4,5};
     insertion(arr);
     printarr(arr); 


    }
}
    

