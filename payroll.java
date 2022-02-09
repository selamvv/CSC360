package PayRollProgram;
import java.util.ArrayList;

public class payroll
{
	//list of employee class objects
	ArrayList<employee> employees = new ArrayList<employee>();

	public static void main(String[] args)
	{
		
		//pay all the employees	
	}
	
	public void add_emp(String fname, String lname, String jt, int r, int h)
	{
		employee emp = new employee(fname, lname, jt, r, h);
		employees.add(emp);
	}
	
	public ArrayList<Float> payAll()
	{	
		int emp_len=employees.size();
		//array to be filled with amount paid to each employee 
		ArrayList<Float> amt_paid = new ArrayList<Float>();
		//float[] amt_paid;
		float amt;
		int i;
		employee x;
		for (i =0; i<emp_len; i++)
		{
			x= employees.get(i);
			if (x.jobType == "Hourly")
			{
				HourlyEmpPayCalc HE= new HourlyEmpPayCalc();
				amt = HE.pay(x);
			}else if (x.jobType == "Salary"){
				SalaryEmpPayCalac SE = new SalaryEmpPayCalac();
				amt = SE.pay(x);
			} else {
				ContractorEmpPayCalc CE = new ContractorEmpPayCalc();
				amt = CE.pay(x);
			}
			amt_paid.add(amt);
		}
			
		//return an array of floats
		return amt_paid;
	}
	
}
