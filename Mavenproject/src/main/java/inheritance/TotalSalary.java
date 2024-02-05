package inheritance;

public class TotalSalary extends SalaryCalculator{

	double totalSalary;

	    public void generateSalarySlip() 
	    {
	        totalSalary = basicPay + hra - pf - deduction + bonus;

	        System.out.println("Salary Slip");
	        System.out.println("Basic Pay: " + basicPay);
	        System.out.println("Deduction: " + deduction);
	        System.out.println("HRA: " + hra);
	        System.out.println("PF: " + pf);
	        System.out.println("Bonus: " + bonus);
	        System.out.println("Total Salary: " + totalSalary);
	    }
	


	    public static void main(String[] args) {
	        TotalSalary obj = new TotalSalary();

	        // Get details from console
	        obj.getDetails();

	        // Calculate HRA and PF
	        obj.calculateSalary();

	        // Generate and display salary slip
	        obj.generateSalarySlip();
	    }
	}