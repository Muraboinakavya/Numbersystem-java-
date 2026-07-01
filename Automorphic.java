import java.util.Scanner;
public class Automorphic {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int count = 0;
        for(int i=1;i<=num;i++){
            int square = i*i;
            
            System.out.println("the number between 1 to num is : "+i);
        
           System.out.println("The square for the number is :"+square );
        

        
        if(square%100==i){
            System.out.println("The given number is Automorphic");
            count++;
            System.out.println(count);
        

        }
        else{
            System.out.println("The given number is not a Automorphic ");
        }
    }
       // System.out.println("the number between 1 to num is : "+count);
       System.out.println("the Automorphic numbers are frome 1 to num is " + count);
        scanner.close();
    }
    
}

