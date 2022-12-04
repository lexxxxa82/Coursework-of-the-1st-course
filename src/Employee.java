public class Employee {
     private final String id;
     private String department;
     private double salary;

     public Employee (String id, String department, double salary) {
         this.id = id;
         this.department = department;
         this.salary = salary;
     }

     public String getId() {
        return id;
     }

     public String getDepartment(){
        return department;
     }

     public void setDepartment(String Department) {
              this.department = Department;
     }
     public double getSalary() {
        return  salary;
     }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.id + " отдел: " + this.getDepartment() + " зарплата: " + this.getSalary();
    }
}
