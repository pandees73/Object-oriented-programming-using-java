import java.util.Scanner;
public class EBBill
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        String type;
        int units;
        double amount = 0;
        System.out.print("Enter Connection Type: ");
        type = sc.nextLine();
        System.out.print("Enter Units Consumed: ");
        units = sc.nextInt();
        if(type.equalsIgnoreCase("Domestic")) 
       {
            if(units <= 100)
                amount = 0;
            else if(units <= 200)
                amount = units * 2;
            else if(units <= 500)
                amount = units * 4;
            else
                amount = units * 6;
        }
        else if(type.equalsIgnoreCase("Commercial")) 
        {
            if(units <= 100)
                amount = units * 2;
            else if(units <= 200)
                amount = units * 4;
            else if(units <= 500)
                amount = units * 6;
            else
                amount = units * 7;
        }
        System.out.println("Amount to be Paid: Rs. " + amount);
    }
}
