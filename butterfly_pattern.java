public class butterfly_pattern {
    public static void main(String[] args) {
       int n=4;
       //upper pattern
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int k=1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
          

            for(int h=1; h<=i; h++){
                System.out.print("*");
            }
            
            System.out.println("");
  
        }
        //lower pattern

         for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int k=1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
          

            for(int h=1; h<=i; h++){
                System.out.print("*");
            }
            
            System.out.println("");
  
        }




       
    
}
}
