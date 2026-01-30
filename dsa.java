import java.util.*;

public class dsa{
    // public static void binary(int arrr[], int tar){
    //     for(int i=0; i<arrr.length; i++){
    //         if(arrr[i]==tar){
    //             System.out.println("element found at index:"+i);
    //         }
    //     }
    // }
    // public static void main(String args[]){
    //     int arr[]= {2, 5, 6, 13, 55, 89, 16, 23};
    //     int tar= 16;
    //     binary(arr, tar);
    // }

    public static void binarysearch(int left, int right, int arr[], int target){
        while(left<=right){
            int mid=(right+left)/2;
            if(arr[mid]==target){
                System.out.println("target found:"+ mid);
                break;
            }
            else if(arr[mid]>target){
                right=mid-1;
                
            }
            else{
                left=mid+1;
            }
        }
            
        
    }
    public static void main(String args[]){
        int arr[] ={2,  3, 4, 6,7, 9, 13, 135, 145, 153, 6163};
        binarysearch(0, arr.length, arr, 153);
        
        
    }
}