package appd;

import java.util.Scanner;
import banking.bankApp;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO MY SYSTEM!");
        System.out.println("What do you feel doing today?");
        System.out.println("1. Banking");
        System.out.println("2. Appointment");
        System.out.println("3. Shopping");
        System.out.print("Enter your choice: ");
        
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
                bankApp ba = new bankApp();
                    System.out.print("Enter account no.: ");
                    int acct = sc.nextInt();
                    System.out.print("Enter pin: ");
                    int pin = sc.nextInt();

                        if(ba.verifyAccount(acct, pin)){
                            System.out.println("LOGIN SUCCESS");
                        }else{
                            System.out.println("INVALID ACCOUNT!");
                        }
                
                
                
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid Selection");
        }
        
    }
}
