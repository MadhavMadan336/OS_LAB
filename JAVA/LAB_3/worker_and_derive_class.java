//WRITE A CLASS WORKER AND DERIVE CLASSES DAILYWORKER AND SALARIEDWORKER FROM IT. EVERY WORKER HAS A NAME AND A SALARY RATE. WRITE METHOD COMPAY (INT HOURS) TO COMPUTE THE WEEK PAY OF EVERY WORKER. A DAILY WORKER IS PAID ON THE BASIS OF THE NUMBER OF DAYS HE/SHE WORKS. THE SALARIED WORKER GETS PAID THE WAGE FOR 40 HOURS A WEEK NO MATTER WHAT THE ACTUAL HOURS ARE. TEST THIS PROGRAM TO CALCULATE THE PAY OF WORKERS.

package EXPERIMENT_3;
//Worker class with name and salary rate attributes
class Worker {
 String name;
 double salaryRate;

 // Constructor to initialize name and salary rate
 public Worker(String name, double salaryRate) {
     this.name = name;
     this.salaryRate = salaryRate;
 }

 // Method to compute weekly pay
 public double computePay(int hours) {
     return hours * salaryRate; // For generic worker, pay is computed based on provided hours
 }
}

//DailyWorker class extending Worker
class DailyWorker extends Worker {

 // Constructor to initialize name and salary rate (calls superclass constructor)
 public DailyWorker(String name, double salaryRate) {
     super(name, salaryRate);
 }

 // Method to compute weekly pay for DailyWorker (paid based on actual hours worked)
 @Override
 public double computePay(int hours) {
     return super.computePay(hours); // DailyWorker is paid based on actual hours worked
 }
}

//SalariedWorker class extending Worker
class SalariedWorker extends Worker {

 // Constructor to initialize name and salary rate (calls superclass constructor)
 public SalariedWorker(String name, double salaryRate) {
     super(name, salaryRate);
 }

 // Method to compute weekly pay for SalariedWorker (paid for 40 hours, regardless of actual hours)
 @Override
 public double computePay(int hours) {
     return super.computePay(40); // SalariedWorker is paid for 40 hours, regardless of actual hours worked
 }
}

//Main class
public class worker_and_derive_class {
 public static void main(String[] args) {
     // Create instances of DailyWorker and SalariedWorker
     DailyWorker dailyWorker = new DailyWorker("SRK", 15.0);
     SalariedWorker salariedWorker = new SalariedWorker("RAHUL", 20.0);

     // Calculate and print weekly pay
     int hoursWorked = 40; // Example: DailyWorker worked for 40 hours

     double dailyWorkerPay = dailyWorker.computePay(hoursWorked);
     System.out.println("Weekly pay for Daily Worker: rupies" + dailyWorkerPay);

     double salariedWorkerPay = salariedWorker.computePay(hoursWorked);
     System.out.println("Weekly pay for Salaried Worker: rupies" + salariedWorkerPay);
 }
}
