import java.util.Scanner;
public class Perfectnumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        for(int i=1;i<=num;i++){
            int sum =0;
            for(int j=1;j<=i/2;j++){
                if(i%j==0){
                    sum+=j;
                }
            
    
            }
           if(sum==i){
                System.out.println("The value is a perfect number " +i);
            }
        }
    scanner.close();
    
}
}
