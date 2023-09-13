public class PayrollSystemTest 
{
    public static void main(String[] args)
    {
        SalariedEmployee1 salariedEmployee1 = new SalariedEmployee1("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee1 hourlyEmployee1 = new HourlyEmployee1("Karen", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee1 commissionEmployee1 = new CommissionEmployee1("Sue", "Jones", "333-33-3333", 10000, .06);
        BasePlusCommissionEmployee1 basePlusCommissionEmployee1 = new BasePlusCommissionEmployee1("Bob", "Lewis", "444-44-4444", 5000, .04, 300);

        System.out.println("Employees processed individually:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n",salariedEmployee1, "earned", salariedEmployee1.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",hourlyEmployee1, "earned", hourlyEmployee1.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",commissionEmployee1, "earned", commissionEmployee1.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",basePlusCommissionEmployee1,"earned", basePlusCommissionEmployee1.earnings());

        Employee1[] employees = new Employee1[4];

        employees[0] = salariedEmployee1;
        employees[1] = hourlyEmployee1;
        employees[2] = commissionEmployee1;
        employees[3] = basePlusCommissionEmployee1;

        System.out.printf("Employees processed polymorphically:%n%n");

        for (Employee1 currentEmployee : employees)
        {
            System.out.println(currentEmployee);

            if currentEmployee instanceof BasePlusCommissionEmployee1()
            {
                BasePlusCommissionEmployee1 employee = (BasePlusCommissionEmployee1) currentEmployee ;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increase is: $%,.2f%n",employee.getBaseSalary());
            }

            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        }

        for (int j = 0; j < employees.length; j++)
        System.out.printf("Employee %d is a %s%n", j,employees[j].getClass().getName());


    }
}
