import java.util.*;

// public class recursion1 {
//     public static void recursive(int n){
//         if(n>5){
//             return;
//         }
//         System.out.println(n);
//         recursive(n+1);
//     }
//     public static void main(String[] args) {
//         int n=1;
//         recursive(n);
//     }
// }

// public class recursion2{
//     public static void sum(int a, int n, int s){
//         if(a==n){
//             s+=a;
//             System.out.println(s);
//             return;
//         }
//         s+=a;
//         // System.out.print(s+" ");
//         sum(a+1, n, s);
//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("enter the n for sum of n natural numbers: ");
//         int n =sc.nextInt();
//         int s=0;
//         sum(1, n, s);
//     }
// }


// public class recursion3{
//     public static void factorial(int a, int b, int c){
//         if(a==b){
//             c*=a;
//             System.out.println("Factorial of this number is :"+ c);
//             return;
//         }
//         c*=a;
//         factorial(a+1, b, c);
//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.print("Enter the number for which u need factorial! :"+" ");
//         int n =sc.nextInt();
//         int fact=1;
//         factorial(1, n, fact);
//     }
// }

// public class recursion4{
//     public static void fibonacci(int n, int a, int b){
//         if(n<=0){
//             return;
//         }
//         int c =a+b;
//         System.out.print(c +" ");
//         a=b;
//         b=c;
        
//         fibonacci(n-1, a, b);
//     }
//     public static void main(String[] args) {
//         int a =0; 
//         int b =1;
//         System.out.print(a +" "+ b+" ");
//         int n =10;
//         fibonacci(n-2, 0, 1);
//     }
// }

// public class recursion4{
//     public static void fibonacci(int a, int b, int z){
//         if(z<=0){
//             return;
//         }
//         int c =a+b;
//         System.out.print(c +" ");
//         a=b;
//         b=c;
        
//         fibonacci(a, b, z-1);
        
//     }
//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         System.out.println("enter the no. of terms of fibonacci");
//         int n =sc.nextInt();
//         int a =0;
//         int b  =1;
//         System.out.print(a+" ");
//         System.out.print(b+" ");
//         fibonacci(a, b, n-2);
//     }
// }

// public class recursion5{
//     public static void print(int r , int x, int z){
//         if(r==0){
//             z=z*x;
//             System.out.println("value of x^n is :"+z);
//             return;
//         }
//         z=z*x;
//         System.out.println("num");
//         print(r-1, x, z);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         int x =sc.nextInt();
//         int z=1;
//         print(n-1, x, z);
//     }
// }


// public class recursion5{
//     public static int print(int x, int n){
//         if(x==0){
//             return 0;
//         }
//         if(n==0){
//             return 1;
//         }
        
//         int z= print(x, n-1);
        
//         z =z*x;
        
//         return z;
        
//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter the value of x in x^n: ");
//         int x =sc.nextInt();
//         System.out.println("Enter the value of n now :");
//         int n =sc.nextInt();
//         int z =1;
//         int result = print(x, n);
//         System.out.println(result);
//     }
// }

// public class recursion1 {
//     public static void print(int n){
//         if(n==0){
//             return;
//         }
        
//         print(n-1); //4

//         // public static void print(int n){
//         // if(n==0){
//         //     return;
//         // }
//         // print(n-1); //3

//             // public static void print(int n){
//             // if(n==0){
//             //     return;
//             // }
//             // print(n-1); //2

//                 // public static void print(int n){
//                 // if(n==0){
//                 //     return;
//                 // }
//                 // print(n-1); //1

//                     // public static void print(int n){
//                     // if(n==0){
//                     //     return;
//                     // }
//                     // print(n-1); //0

//                         // public static void print(int n){
//                         // if(n==0){
//                         //     return;
//                         // }

//             //         System.out.println(n);
//             //     System.out.println(n);
//             // System.out.println(n);
        
//         // System.out.println(n);
//         System.out.println(n);
//     }
//     public static void main(String[] args) {
//         int n =5;
//         print(n);
        
//     }
// }



// public class recursion2{
//     public static void sum(int a, int n, int t){
//         if(n==1){
//             t =t+a;
        
//             System.out.println("sum:"+ t);
//             return;
//         }
//         t =t+a;
        
//         sum(a+1, n-1, t);
        
//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter the 'n' till which u want to print natural number");
//         int n =sc.nextInt();
//         int a =1;
//         int temp=0;
//         sum(a, n, temp);
        
//     }
// }




// public class recursion2{
//     public static int sum(int a, int n){ //1,5
//         if(a>n){
//             return 0;
//         }
//         int s= sum(a+1, n); //2, 5 
//             // public static int sum(int a, int n){
//             // if(a>n){
//             //     return 0;
//             // }
//             // int s= sum(a+1, n); //3, 5
//                     // public static int sum(int a, int n){
//                     // if(a>n){
//                     //     return 0;
//                     // }
//                     // int s= sum(a+1, n); //4, 5
//                             // public static int sum(int a, int n){
//                             // if(a>n){
//                             //     return 0;
//                             // }
//                             // int s= sum(a+1, n); //5, 5
//                                     // public static int sum(int a, int n){
//                                     // if(a>n){
//                                     //     return 0;
//                                     // }
//                                     // int s= sum(a+1, n); //6, 5
//                                             // public static int sum(int a, int n){
//                                             // if(a>n){
//                                             //     return 0;
//                                             // }
                                           
//                                     // s=s+a; //s=0 s=5
//                                     // return s;
//                                     // }
//                             // s=s+a; 
//                             // return s;
//                             // }
//                     // s=s+a;
//                     // return s;
//                     // }
//             // s=s+a;
//             // return s;
//             // }
//         s=s+a;
//         return s;
//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter the 'n' till which u want to print natural number");
//         int n =sc.nextInt(); //n=5
//         int a =1;
//         int summ =sum(a, n);
//         System.out.println("the sum is :"+ summ);
//     }
// }


// public class recursion3{
//     public static int factorial(int a, int n){
//         if(a>n){
//             return 1;
//         }
//         // int z =1;
//         // z =z*a;
//         int z =factorial(a+1, n);
//         z =z*a;
//         return z;
//     }
//     public static void main(String[] args) {
//         int n =5;
//         int a =1;
//         int fact= factorial(a, n);
//         System.out.println("factorial is : "+ fact);
//     }
// }


// public class recursion5{
//     public static void print(int x, int n, int t){
//         if(n==1){
//             t =t*x;
//             System.out.println(t);
//             return;
//         }
//         t =t*x;
        
//         print(x, n-1, t);
//     }
//     public static void main(String[] args) {
//         int x =2;
//         int n =5;
//         int t=1;
//         print(x, n, t);

//     }
// }

// public class recursion5{
//     public static int print(int x, int n, int t){
//         if(n==0){
//             return 1;
//         }
        
//         t =print(x, n-1, t);
//         t =t*x;
//         return t;
//     }
//     public static void main(String[] args) {
//         int x =2;
//         int n =6;
//         int t=1;
//         int p= print(x, n, t);
//         System.out.println(p);
//     }
// }

