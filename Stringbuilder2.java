import java.util.*;
// public class Stringbuilder1 {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         String x =sc.nextLine();
//         StringBuilder sb =new StringBuilder(x);
//         System.out.println("String x is :"+ sb);
//         // String result= "";
//         // Stringbuilder sd =new Stringbuilder(result);
//         for(int i=0; i<sb.length(); i++){
//             if(sb.charAt(i)=='e'){
//                 sb.setCharAt(i, 'i');
//             }
            
//         }
//         System.out.println("string result is "+ sb);
//     }
// }



public class Stringbuilder2{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the email :");
        String a =sc.nextLine();
        StringBuilder sb =new StringBuilder(a);
        
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i)== '@'){
                sb.delete(i, sb.length());
                break;
            }
        }
        System.out.println("the username is :"+ sb);
    }
}
