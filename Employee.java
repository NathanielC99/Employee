/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        // to be completed
        if (age>=16)
         return (true);
        else 
        System.out.println(16-age); 
        return(false); 
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        // to be completed
        double totalSalary = (unpaidHours * hourlyWage);
        double taxes = (00.30);
        double Sum = (totalSalary * taxes);
        double calculatePay = (totalSalary - Sum);
        return(calculatePay);
    }
    
    private void setName(String name){
        fullname = name;
    }
    
    public String newName(){
        return(fullname);
    }
    
    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        // to be completed
        double calculatePay;
        System.out.println("fullname" + "has received a wire transfer of" +
        calculatePay() + "CAD");
        unpaidHours=0;
    }
}