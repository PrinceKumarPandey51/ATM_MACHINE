import java.util.*;


import javax.sound.midi.Soundbank;

class ATM{

    float Balance;
    int PIN=5674 ;
  public void checkpin(){
    System.out.println("Enter your pin:");
    Scanner sc=new Scanner(System.in);
    //Scanner.close();
    int enteredpin = sc.nextInt();
    if(enteredpin==PIN){
        menu();
    }
      else{
        System.out.println("Enter a valid pin:");
      }

  }


   public void menu(){
  
   System.out.println("Enter your choice:");
   System.out.println("1. Check A/C Balance ");
   System.out.println("2. Withdraw Money ");
   System.out.println("3. Deposit Money ");
   System.out.println("4. EXIT");

   Scanner sc= new Scanner(System.in);
   int opt = sc.nextInt();

   if(opt== 1){
    checkBalance();

   }
   else if(opt==2){
      withdrawMoney();
   }

     else if(opt==3){
      depositMoney();
     }

     else if(opt==4){
      return;
     }

     else{
      System.out.println("Enter a valid choice ");
     }
   

   }



   public void checkBalance(){
    System.out.println("Balance: " +Balance);
    menu();
   }
   Scanner sc = new Scanner(System.in);
   public void withdrawMoney(){
   System.out.println("Enter Amount to Withdraw:");
   float amount = sc.nextFloat();
   if(amount>Balance){
    System.out.println("Insufficient Balance ");
   }
   else{
    Balance =Balance- amount;
    System.out.println("Money Withdrawl Successful");
   }

   menu();

   }

   public void depositMoney(){
    System.out.println("Enter the amount: ");
    Scanner sc= new Scanner(System.in);
    float amount = sc.nextFloat();
    Balance = Balance + amount ;
    System.out.println("Money Deposited Successfully ");
menu();;

   }


}

public class ATMMachine {
   public static void main(String[]args){

ATM obj = new ATM();
obj.checkpin();


   }
    
}