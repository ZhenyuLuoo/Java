import java.util.Scanner;

public class Activity2PayStub
{
    public static final double OVERTIME_RATE = 1.5;
    public static final double SOCIAL_SECURITY_WITHHOLDING = 0.1;
    public static final double FEDERAL_TAX = 0.2;
    private String name;
    private String ssn;
    private int Rhours, Ohours;
    private double rate, Rpay, Orate, Opay, Gpay, ssw, Ftax, Npay;
    /**
     * It all starts with the main method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
    	Scanner keyboard = new Scanner(System.in);
        Activity2PayStub a2ps = new Activity2PayStub();
        a2ps.getInput(keyboard);
        a2ps.calculate();
        a2ps.printPayStub();
    }
    
    public void getInput(Scanner keyboard)
    {
        System.out.print("Please input your name:");
        name = keyboard.nextLine();
        System.out.print("Please input your social security number:");
        ssn = keyboard.next();
        System.out.print("Please input your regular hours:");
        Rhours = keyboard.nextInt();
        System.out.print("Please input your overtime hours:");
        Ohours = keyboard.nextInt();
        System.out.print("Please input your hourly pay rate:");
        rate = keyboard.nextDouble();
    }
    
    public void calculate()
    {
    	Rpay = Rhours * rate;
        Orate = OVERTIME_RATE * rate;
        Opay = Orate * Ohours;
        Gpay = Rpay + Opay;
        ssw = SOCIAL_SECURITY_WITHHOLDING * Gpay;
        Ftax = FEDERAL_TAX * (Gpay - ssw);
        Npay = Gpay - ssw - Ftax;
    }
    
    public void printPayStub()
    {
    	System.out.println("__________________________________________________________________________");
        String format1 = "Name: %-37s SSN: %-11s\n";
        System.out.printf(format1, name, ssn);
        String format2 = "Regualar Hours: %-8d Reg Rate: $%-8.2f Reg Pay: $%-8.2f\n";
        System.out.printf(format2, Rhours, rate, Rpay);
        String format3 = "Overtime Hours: %-7d OT Rate: $%-9.2f OT Pay: $%-8.2f\n";
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
