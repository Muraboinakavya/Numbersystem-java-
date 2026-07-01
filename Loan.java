import java.util.Scanner;
public class Loan {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
      System.out.println("Enter the Application age");
       int age= scanner.nextInt();
       System.out.println("Enter the Monthly income");
       double income =scanner.nextDouble();
       System.out.println("Enter the credits score");
       double credits =scanner.nextDouble();
       System.out.println("Enter the Existing loan");
       double existingloan =scanner.nextDouble();
       System.out.println("Enter the Requested Loan");
       double Requestedloan =scanner.nextDouble();
       if(age>=21&&age<=60){
        if(credits>500){
            if(income>20000){
                System.out.println("The Application is Approved");
            }
        }
       }
       else{
        System.out.println("The Loan is Rejected");
       }
       double DTI=scanner.nextDouble();
        DTI= existingloan/income;
        if(DTI>0.6){
            System.out.println("Rejected");

        }
        if(DTI<=0.6){
            System.out.println("continue");
        }
        double low =0;
        double medium=0;
        double High=0;
        if(credits>750){
            low =20*income;
            System.out.println("it is Low Risk"+low);
            if(Requestedloan<=low){
                System.out.println("Approve FullAmount");
            }
            else if(Requestedloan>low){
                System.out.println("Approve only maximum amount");
            }

        }
        else if(credits>=650&&credits<=749){
            medium=15*income;
            System.out.println("it is Medium Risk"+medium);
            if(Requestedloan<=medium){
                System.out.println("Approve FullAmount");
            }
            else if(Requestedloan>medium){
                System.out.println("Approve only maximum amount");
            }


        }
        else if(credits>=500&&credits<=649){
            High=10*income;
            System.out.println("it is High Risk"+High);
            if(Requestedloan<=High){
                System.out.println("Approve FullAmount");
            }
            else if(Requestedloan>High){
                System.out.println("Approve only maximum amount");
            }

        }
        else{
            System.out.println("The Enter  credits value is invalid ");
        }
        scanner.close();
    
       
    }
    
}
