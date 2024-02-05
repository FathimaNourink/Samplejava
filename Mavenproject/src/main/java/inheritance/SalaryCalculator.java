package inheritance;

public class SalaryCalculator extends Employee{
double hra;
double pf;
public void calculateSalary()
{
	hra = 0.05 * basicPay;
    pf = 0.20 * basicPay;
}
}
