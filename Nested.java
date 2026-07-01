import java.util.Scanner;
class Nested{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the consumer type \"Domestic\" or \"commercial\" ");
        String type = scanner.nextLine();
        System.out.println("Enter the units");
        double units = scanner.nextDouble();
        double basebill=0;
        
        if(type.equalsIgnoreCase("Domestic")){
            if(units<=100){
                basebill= units*3;
                System.out.println("The rate per unit is 3 Rs"+basebill); 
            }
            else if(units<=300){
                basebill=units*5;
                System.out.println("The rate per unit is 5 Rs"+basebill);
            }
            else{
                basebill=units*8;
                System.out.println("The rate per unit is 8 Rs" +basebill);
            }
        }
            else if 
                (type.equalsIgnoreCase("Commerical")){
                    if(units<=200){
                        basebill=units*6;
                        System.out.println("The rate per unit is 6 Rs"+basebill);
                    
                    }
                    else if(units<=500){
                        basebill=units*9;
                        System.out.println("The rate per unit is 9 Rs"+basebill);
                    }
                    else{
                        basebill=units*12;
                        System.out.println("The rate per unit is 12 Rs"+basebill);
                    }
                }
                
             else{
                        System.out.println("The units value is invalid ");

                    }
                
                System.out.println("The basebill is : " +basebill);
                System.out.println("Enter the peak Hour usage ");
                   double peak= scanner.nextDouble();
                 System.out.println("Are you senior citizen?(true/false)");
                 boolean base =scanner.nextBoolean();
                 System.out.println("Enter the previous outstanding amount");
                 double amount = scanner.nextDouble();
                 System.out.println("Enter the green energy bonus");
                 double energy=scanner.nextDouble();
                 double finalamount=basebill;
                 boolean surchargeApplied=false;
                 boolean discountApplied =false;
                 boolean penality=false;
               if(peak>40){
            
              finalamount= basebill +(basebill*15/100);
                  surchargeApplied=true;
        
                System.out.println("The base bill is "+(basebill));
                
               }
               if(type.equalsIgnoreCase("Domestic")&& base==true){
            finalamount= basebill -(basebill* 10/100.0);
                   discountApplied=true;
               System.out.println("The result value is " +basebill);
            
               }
            if(amount>0){
        
           finalamount= basebill+(amount*5/100);
              penality=true;
              
                System.out.println("After adding the 5%to the the prevoius outstanding "+basebill);
               }
               if(units<=150 &&peak<20/100){
                finalamount=basebill-(basebill*20/100);
                discountApplied =true;
            
              System.out.println("The amount decreses by green energy is : " +basebill);
               }
               
               System.out.println("The basebill : "+basebill);
            
               System.out.println("Final finalAmount : " +finalamount);
               if(surchargeApplied==true&&discountApplied==true){
                System.out.println("The BillStatus :  mixed Adjustment " );
               }
               else if(surchargeApplied==true){
                System.out.println("The BillStatus :  surchargeApplied " );
               }
               else if(discountApplied==true){
                System.out.println("The BillStatus :  discountApplied " );

               }
              else if(penality ==true){
                System.out.println("The BillStatus : penalityApplied");

                  }
              else{
                System.out.println("The BillStatus : normal");
               }
               scanner.close();
               }

               }
               
               
               


            

            
            

   

     