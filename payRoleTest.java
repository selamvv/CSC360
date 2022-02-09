package PayRollProgram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class payRoleTest
{

	@BeforeEach
	void setUp() throws Exception
	{
		payroll pr = new payroll();
		//add employee
		pr.add_emp( "sam","baldino", "contractor", 15, 30);
		pr.add_emp("tom", "moss", "hourly", 30, 44);
		//assert total amount paid to all employees is correct
		pr.payAll(payroll.employees);
	}

	@Test
	void test()
	{
		assert (empoyees.size()==2);
		
	}

}
