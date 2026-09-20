import java.util.Scanner;

interface BankAccount
{
    void deposit(double amount);
    void withdraw(double amount);
    void balanceEnquiry();
}

class Bank implements BankAccount
{
    String name;
    int accNo;
    double balance;

    Bank(String name,int accNo,double balance)
    {
        this.name=name;
        this.accNo=accNo;
        this.balance=balance;
    }

    public void deposit(double amount)
    {
        balance=balance+amount;
        System.out.println("Amount Deposited Successfully");
        System.out.println("Available Balance: Rs. "+balance);
    }

    public void withdraw(double amount)
    {
        try
        {
            if(amount>balance)
                throw new Exception("Insufficient Balance");

            balance=balance-amount;
            System.out.println("Amount Withdrawn Successfully");
            System.out.println("Available Balance: Rs. "+balance);
        }
        catch(Exception e)
        {
            System.out.println("Exception: "+e.getMessage());
            System.out.println("Transaction Failed");
            System.out.println("Available Balance: Rs. "+balance);
        }
    }

    public void balanceEnquiry()
    {
        System.out.println("Available Balance: Rs. "+balance);
    }
}

public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name=sc.nextLine();

        System.out.print("Enter Account Number: ");
        int acc=sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double bal=sc.nextDouble();

        Bank b=new Bank(name,acc,bal);

        System.out.println("\n1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Balance Enquiry");

        System.out.print("Enter your choice: ");
        int ch=sc.nextInt();

        switch(ch)
        {
            case 1:
                System.out.print("Enter Deposit Amount: ");
                double d=sc.nextDouble();
                b.deposit(d);
                break;

            case 2:
                System.out.print("Enter Withdraw Amount: ");
                double w=sc.nextDouble();
                b.withdraw(w);
                break;

            case 3:
                b.balanceEnquiry();
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
