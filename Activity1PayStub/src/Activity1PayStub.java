import java.util.Scanner;

public class Activity1PayStub
{
    public static final double OVERTIME_RATE = 1.5;
    public static final double SOCIAL_SECURITY_WITHHOLDING = 0.1;
    public static final double FEDERAL_TAX = 0.2;
    /**
     * It all starts with the main method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        String name, ssn;
        int Rhours, Ohours;
        double rate;
        System.out.print("Please input your name:");
        Scanner scan1 = new Scanner(System.in);
        name = scan1.next();
        System.out.print("Please input your social security number:");
        Scanner scan2 = new Scanner(System.in);
        ssn = scan2.next();
        System.out.print("Please input your regular hours:");
        Scanner scan3 = new Scanner(System.in);
        Rhours = scan3.nextInt();
        System.out.print("Please input your overtime hours:");
        Scanner scan4 = new Scanner(System.in);
        Ohours = scan4.nextInt();
        System.out.print("Please input your hourly pay rate:");
        Scanner scan5 = new Scanner(System.in);
        rate = scan5.nextDouble();
        double Rpay = Rhours * rate;
        double Orate = OVERTIME_RATE * rate;
        double Opay = Orate * Ohours;
        double Gpay = Rpay + Opay;
        double ssw = SOCIAL_SECURITY_WITHHOLDING * Gpay;
        double Ftax = FEDERAL_TAX * (Gpay - ssw);
        double Npay = Gpay - ssw - Ftax;
        System.out.println("__________________________________________________________________________");
        String format1 = "Name: %-37s SSN: %-11s\n";
        System.out.printf(format1, name, ssn);
        String format2 = "Regualar Hours: %-8d Reg Rate: $%-8.2f Reg Pay: $%-8.2f\n";
        System.out.printf(format2, Rhours, rate, Rpay);
        String format3 = "Overtime Hours: %-8d OT Rate: $%-8.2f OT Pay: $%-8.2f\n";
        System.out.printf(format3, Ohours, Orate, Opay);
        String format4 = "Gross Pay: $%-8.2f\n";
        System.out.printf(format4, Gpay);
        String format5 = "SS Withholding: $%-8.2f\n";
        System.out.printf(format5, ssw);
        String format6 = "Federal Tax: $%-8.2f\n";
        System.out.printf(format6, Ftax);
        String format7 = "Net Pay: $%-8.2f\n";
        System.out.printf(format7, Npay);
        System.out.println("__________________________________________________________________________");
    }  
}