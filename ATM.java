
                          /* Task 2 (....ATM Interface....) */

import java.util.*;

class BackAccount {
    private double balance = 1000000;
    private int password = 2005;
    public double Amount;

    public void deposite() {
        System.out.print("\n\t\tEnter your password :");
        Scanner sc = new Scanner(System.in);
        password = sc.nextInt();

        if (password == 2005) {
            System.out.print("\t\tEnter the Deposite Amount :");
            Amount = sc.nextInt();
            balance = balance + Amount;

            System.out.println("\t\tDeposite Amount :" + Amount);
            System.out.println("\t\tTotal Balance :" + balance);
        } else {
            System.out.println("\t\t..Incorrect Password.!!!!!");
        }
    }

    public void withdraw() {
        System.out.print("\n\t\tEnter your password :");
        Scanner sc = new Scanner(System.in);
        password = sc.nextInt();

        if (password == 2005) {
            System.out.print("\t\tEnter the Withdraw Amount :");
            Amount = sc.nextInt();
            balance = balance - Amount;

            System.out.println("\t\tWithdrawn Amount :" + Amount);
            System.out.println("\t\tTotal Balance :" + balance);
        } else {
            System.out.println("\t\t..Incorrect Password.!!!!!");
        }
    }

    public void checkBalance() {
        System.out.print("\tEnter your password :");
        Scanner sc = new Scanner(System.in);
        password = sc.nextInt();
        if (password == 2005) {
            System.out.println("\tAvailable Balance is = " + balance);
        } else {
            System.out.println("\t..Incorrect Password.!!!!!");
        }
    }
}

class ATM {
    public static void main(String[] args) {
        BackAccount b = new BackAccount();

        for (int i = 0; i <= 100; i++) {

            System.out.println("1.Deposite");
            System.out.println("2.Withdraw");
            System.out.println("3.ChackBalance");
            System.out.println("4.Exit");

            int Choise;
            System.out.print("Choose any Number :");
            Scanner ch = new Scanner(System.in);
            Choise = ch.nextInt();

            if (Choise <= 3) {
                switch (Choise) {
                    case 1:
                        System.out.print("......YOUR TRANSACTION IS BEING PROCESSED.......!");
                        b.deposite();
                        break;
                    case 2:
                        System.out.print("......YOUR TRANSACTION IS BEING PROCESSED.......!");
                        b.withdraw();
                        break;
                    case 3:
                        b.checkBalance();
                        break;
                    default:
                        System.out.printf(".........Invailed Choise........");

                }
            } else {
                break;
            }
            System.out.print("\n");
            continue;
        }

    }
}