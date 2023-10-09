// public class Inverted_half_pyramid {
//     public static void main(String[] args) {
//         for(int i=1; i<=4; i++){
//             for(int j=4; j>=i; j--){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
    
// }

//inverted half pyramid(rotated by 180deg)

public class Inverted_half_pyramid{
    public static void main(String[] args) {
        int n= 4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}