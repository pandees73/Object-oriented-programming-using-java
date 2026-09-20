import java.util.ArrayList;
import java.util.Scanner;
public class Travel
{
   public static void main(String[]args)
{
   ArrayList<String>cityname=new ArrayList<>();
   Scanner sc=new Scanner(System.in);
   int choice;
     System.out.println("\n----- CITY MANAGEMENT -----");
     System.out.println("1. Append City");
     System.out.println("2. Insert City");
     System.out.println("3. Search City");
     System.out.println("4. Display Cities Starting with a Letter");
     System.out.println("5. Display All Cities");
     System.out.println("6. Exit");
   do
   {
     System.out.print("Enter your choice: ");
     choice = sc.nextInt();
     sc.nextLine();
     switch (choice) {
       case 1:
            System.out.print("Enter city to append: ");
            String city = sc.nextLine();
            cityname.add(city);
            System.out.println(city + " added successfully");
            break;  
       case 2:

            if (cityname.size() == 0) 
            {

                System.out.println("List is empty. Please append a city first.");
             }
            else 
            {
                System.out.print("Enter index");
                int index = sc.nextInt();
                sc.nextLine();
                if (index >= 0 && index <= cityname.size()) 
                {
                    System.out.print("Enter city to insert: ");
                    String newcity = sc.nextLine();
                    cityname.add(index, newcity);
                    System.out.println(newcity + " inserted successfully.");
                }
               else 
               {
                    System.out.println("Invalid index.");
               }
            }
            break;
       case 3:
           System.out.print("Enter city to search: ");

           String searchcity = sc.nextLine();

           if (cityname.contains(searchcity))

                System.out.println(searchcity + " is found.");
           else
                System.out.println(searchcity + " is not found.");
           break;
        case 4:
            System.out.print("Enter starting letter: ");

            char letter = sc.next().charAt(0);

            System.out.println("Cities starting with '" + letter + "':");

            boolean found = false;

            for (String c : cityname) 
            {

                if 
        (c.toLowerCase().startsWith(String.valueOf(letter).toLowerCase())) 
                {
                    System.out.println(c);
                    found = true;
                }
            }
            if (!found)
                System.out.println("No cities found.");
                break; 
        case 5:
            if (cityname.isEmpty())
                System.out.println("No cities available.");
            else
                System.out.println("All Cities: " + cityname);
            break;
        case 6:
            System.out.println("Exiting...");
            break;
        default:
            System.out.println("Invalid choice.");
}
} while (choice != 6);
sc.close();
}
}
