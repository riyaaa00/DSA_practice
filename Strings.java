import java.util.*;

// public class dsa{
//     // public static void binary(int arrr[], int tar){
//     //     for(int i=0; i<arrr.length; i++){
//     //         if(arrr[i]==tar){
//     //             System.out.println("element found at index:"+i);
//     //         }
//     //     }
//     // }
//     // public static void main(String args[]){
//     //     int arr[]= {2, 5, 6, 13, 55, 89, 16, 23};
//     //     int tar= 16;
//     //     binary(arr, tar);
//     // }

//     public static void binarysearch(int left, int right, int arr[], int target){
//         while(left<=right){
//             int mid=(right+left)/2;
//             if(arr[mid]==target){
//                 System.out.println("target found:"+ mid);
//                 break;
//             }
//             else if(arr[mid]>target){
//                 right=mid-1;
                
//             }
//             else{
//                 left=mid+1;
//             }
//         }
            
        
//     }
//     public static void main(String args[]){
//         int arr[] ={2,  3, 4, 6,7, 9, 13, 135, 145, 153, 6163};
//         binarysearch(0, arr.length, arr, 153);
        
        
//     }
// }

// public class dsa{
//     public static void main(String args[]) {
//         Scanner sc =new Scanner(System.in);
//         int size =sc.nextInt();
//         // String a =sc.nextLine();
//         String arr[]= new String[size];
//         int totallength=0;
//         for (int i=0; i<size; i++) {
//             arr[i] =sc.nextLine();
//             int lengthstring=arr[i].length();
//             totallength = totallength + lengthstring;
//         } 
//         System.out.println(totallength);
//     }
// }

// for(int i=0; i<a.length(); i++){
        //     System.out.print("string a is :"+a.charAt(i));
        // }
        // for(int i=0; i<a.length(); i++){
        //     if(a.charAt(i)== 'e'){
        //         a.charAt(i). equals(i);
        //     }
        // }
        // String result =" ";
        // System.out.println(" ");
        // for(int i=0; i<result.length(); i++){
        //     System.out.print("string result is :"+result.charAt(i));
        // }
// public class dsa{
//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         String a =sc.nextLine();
//         System.out.print("string a is :"+ a);
//         String result="";
        
//         for(int i=0; i<a.length(); i++){
//             if(a.charAt(i)=='e'){
//                 result= result +'i';

                
//             }
//             else{
//                 result =result+ a.charAt(i);
//             }
//         }
//         System.out.println(" ");
//         System.out.print("string result is :"+ result);
        
//     }
// }



// public class dsa{
//     public static void main(String[] args) {
//         
        
//     }
// }

public class Strings{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please enter a email");
        String str =sc.nextLine();
        System.out.println("the email is :"+ str);
        
        String result ="";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '@'){
                break;
            }
            else{
                result = result + str.charAt(i);
            }
        }
        System.out.println("the username is :"+ result);
    }
}