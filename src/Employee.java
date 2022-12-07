public class Employee {
    private final String id;
    private String department;
    private double salary;
    private final int obj;
      private static int size;

    public Employee ( String id, String department, double salary) {
        this.obj = size++;
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
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
         Employee c2 = (Employee) other;
        return id.equals(c2.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }

    @Override
    public String toString() {
        return " номер п/п " + obj + " " + this.id + " отдел: " + this.getDepartment() + " зарплата: "
                + this.getSalary() + "\n";
    }
}