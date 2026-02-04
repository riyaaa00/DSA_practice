import java.util.*;
// public class bubblesort {
//     public static void main(String[] args) {
//         int arr[] = {33, 6, 90, 2, 67, 55};
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr.length-1-i; j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


public class Selectionsort{
    public static void main(String args[]){
        int arr[] = {3, 90, 45, 32, 98, 4, 1, 77};
        for(int i=0; i<arr.length; i++){
            int small =i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[small];
            arr[small]=temp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
