//Create a program to find the bonus of 10 employees 
//based on their years of service as well as thetotal bonus

public class BonusCalculator 
{
    // method to generate salary and years of service
    public static int[][] generateSalary(int employees) 
	{
        int[][] data = new int[employees][2];

        for (int i = 0; i <employees; i++) {

            int salary=(int)(Math.random() * 90000) + 10000;
            int years=(int)(Math.random() * 10) + 1;

            data[i][0]=salary;
            data[i][1]=years;
        }
        return data;
    }

    // method to calculate new salary and bonus
    public static double[][] calculateBonus(int[][] employeeData) {

        double[][] result=new double[employeeData.length][2];

        for (int i=0; i<employeeData.length;i++) {

            int salary=employeeData[i][0];
            int years=employeeData[i][1];
            double bonus;

            if (years > 5) {
                bonus=salary * 0.05;
            } else {
                bonus=salary * 0.02;
            }

            result[i][0]=salary + bonus;
            result[i][1]=bonus;
        }
        return result;
    }

    // method to display salary table and totals
    public static void displayDetails(int[][] oldData, double[][] newData) {
    
	    double totalOldSalary=0;
        double totalNewSalary=0;
        double totalBonus=0;

        System.out.println("Employee Bonus Details");

        for (int i=0;i<oldData.length;i++) {

            int oldSalary=oldData[i][0];
            int years=oldData[i][1];
            double bonus=newData[i][1];
            double newSalary=newData[i][0];

            totalOldSalary+=oldSalary;
            totalBonus+=bonus;
            totalNewSalary+=newSalary;

            System.out.println("Employee Number : " + (i + 1));
            System.out.println("Old Salary : " + oldSalary);
            System.out.println("Years of Service : " + years);
            System.out.println("Bonus Amount : " + bonus);
            System.out.println("New Salary : " + newSalary);
            System.out.println();
        }

        System.out.println("Total Old Salary of Company : " + totalOldSalary);
        System.out.println("Total Bonus Paid by Company : " + totalBonus);
        System.out.println("Total New Salary of Company : " + totalNewSalary);

    }

    public static void main(String[] args) {

        int employees=10;

        int[][] employeeData=generateSalary(employees);
        double[][] updatedData=calculateBonus(employeeData);

        displayDetails(employeeData,updatedData);
    }
}
