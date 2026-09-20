package employee;
import java.util.Scanner;
public class Employee {
    String Emp_name, Designation, Address, Mail_id;
    int Emp_id;
    long Mobile_no;
    double BP, DA, HRA, GP, PF, Staff, NP;
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        Emp_name = in.nextLine();
        System.out.print("Enter Employee ID: ");
        Emp_id = in.nextInt();
        in.nextLine();
        System.out.print("Enter Address: ");
        Address = in.nextLine();
        System.out.print("Enter Mail ID: ");
        Mail_id = in.nextLine();
        System.out.print("Enter Mobile Number: ");
        Mobile_no = in.nextLong();
        System.out.print("Enter Basic Pay: ");
        BP = in.nextDouble();
    }
    public void calculateSalary() {
    }
    public void output() {
        System.out.println("\nEmployee Name : " + Emp_name);
        System.out.println("Employee ID   : " + Emp_id);
        System.out.println("Designation   : " + Designation);
        System.out.println("Basic Pay     : " + BP);
        System.out.println("DA            : " + DA);
        System.out.println("HRA           : " + HRA);
        System.out.println("Gross Pay     : " + GP);
        System.out.println("PF            : " + PF);
        System.out.println("Staff Club    : " + Staff);
        System.out.println("Net Pay       : " + NP);
    }
    static class Programmer extends Employee {
        Programmer() {
            Designation = "Programmer";
        }
        public void calculateSalary() {
            DA = BP * 97 / 100;
            HRA = BP * 10 / 100;
            PF = BP * 12 / 100;
            Staff = BP * 1 / 100;
            GP = BP + DA + HRA;
            NP = GP - PF - Staff;
        }
    }
    static class AssistantProfessor extends Employee {
        AssistantProfessor() {
            Designation = "Assistant Professor";
        }
        public void calculateSalary() {
            DA = BP * 110 / 100;
            HRA = BP * 20 / 100;
            PF = BP * 12 / 100;
            Staff = BP * 5 / 100;
            GP = BP + DA + HRA;
            NP = GP - PF - Staff;
        }
    }
    static class AssociateProfessor extends Employee {
        AssociateProfessor() {
            Designation = "Associate Professor";
        }
        public void calculateSalary() {
            DA = BP * 130 / 100;
            HRA = BP * 30 / 100;
            PF = BP * 12 / 100;
            Staff = BP * 10 / 100;
            GP = BP + DA + HRA;
            NP = GP - PF - Staff;
        }
    }
    static class Professor extends Employee {
        Professor() {
            Designation = "Professor";
        }
        public void calculateSalary() {
            DA = BP * 140 / 100;
            HRA = BP * 40 / 100;
            PF = BP * 12 / 100;
            Staff = BP * 15 / 100;
            GP = BP + DA + HRA;
            NP = GP - PF - Staff;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Programmer");
        System.out.println("2. Assistant Professor");
        System.out.println("3. Associate Professor");
        System.out.println("4. Professor");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();
        Employee emp = null;

        switch (choice) {
            case 1:
                emp = new Programmer();
                break;
            case 2:
                emp = new AssistantProfessor();
                break;
            case 3:
                emp = new AssociateProfessor();
                break;
            case 4:
                emp = new Professor();
                break;
            default:
                System.out.println("Invalid Choice");
                return;
        }
        emp.input();
       
            if ((choice == 1 && (emp.BP < 15000 || emp.BP > 20000)) ||
            (choice == 2 && (emp.BP < 20001 || emp.BP > 30000)) ||
            (choice == 3 && (emp.BP < 30001 || emp.BP > 40000)) ||
            (choice == 4 && emp.BP <= 40000)) {
            System.out.println("Invalid Basic Pay");
            return;
        }
        emp.calculateSalary();
        emp.output();
    }
}
