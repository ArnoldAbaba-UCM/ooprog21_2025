public class Employee {
    int employeeNumber;
    double payRate;
    final int MAX_EMPLOYEE_NUMBER = 9999;
    final double MAX_RATE = 60.00;
    final double OVERTIME_MULTIPLIER = 1.5;
 
    public Employee() {
       employeeNumber = 0;
       payRate = 0;
    }
 
    public void setPayRate(double rate) {
          payRate = rate;
    }
 
    public double computeRegularPay(double hours) {
       if (hours > 40){
          return 40 * payRate;
        }else{
          return hours * payRate;
        }
    }
 
    public double computeOvertimePay(double hours) {
       if (hours > 40){
          return (hours - 40) * payRate * OVERTIME_MULTIPLIER;
        }else{
          return 0;
        }
    }
 }
