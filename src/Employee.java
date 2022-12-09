public class Employee {
    private final String name;
    private String department;
    private double salary;
    private final int id;
      private static int size=1;

    public Employee ( String name, String department, double salary) {
        this.id = size++;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
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
        return name.equals(c2.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }

    @Override
    public String toString() {
        return " номер п/п " + id + " " + this.name + " отдел: " + this.getDepartment() + " зарплата: "
                + this.getSalary() + "\n";
    }
}