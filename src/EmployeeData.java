
import java.util.Arrays;

public class EmployeeData {
    private static  Employee[] employees;

   / private static int size;

    public EmployeeData() {
        employees = new Employee[10];
    }

    public void addEmployee(String employeeId, String department, double salary) {
        if (size >= employees.length) {
            System.out.println("Все вакансии заняты , ввод нового сотрудника не возможен");
        }
        Employee newEmployee = new Employee(employeeId, department,salary);
        employees[size++] = newEmployee;
    }
    public void removeEmployee(String employeeId) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId().equals(employeeId)) {
                System.out.println("Сотрудник " + employees[i].getId() + " удален(а)");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
        }
    }
    public void findEmployee(String employeeId) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getId().equals(employeeId)) {
                System.out.println(employee.getId() + " отдел: " + employee.getDepartment()  +", зарплата: "+ employee.getSalary());
                return;
            }
        }
        System.out.println("сотрудник " + employeeId + " не найден");
    }

    public void printAllEmployees() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println( employee.getId());
        }
    }

    public static int getCurrentSize() {
        return size;
    }
    public static void totalEmployeePay() {
        System.out.printf("Общие затраты на выплату  зарплат сотрудникам состовляет: %.2f рублей.\n " ,totalEmployeePay(employees));
    }
    private static double totalEmployeePay(Employee[] employees) {
        EmployeeData.employees = employees;
        double paymentAmount=0;
        for (Employee employee: employees){
            if (employee != null){
                paymentAmount+= employee.getSalary();
            }
        }
        return paymentAmount;
    }
    static void averageStaffSalary() {
        System.out.printf("Средняя зарплата сотрудника состовляет: %.2f рублей.\n ",averageStaffSalary(employees));
    }
    private static double averageStaffSalary(Employee[]employees) {
        double averageSalary;
        averageSalary = totalEmployeePay(employees) / size;
        return averageSalary;
    }
    public static void highestPaidEmployeePrint() {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() == highestPaidEmployee(employees)) {
                    System.out.println("Сотрудник с максимальной зарплатой: " + employee);
                }
            }
        }
    }
    private static double highestPaidEmployee (Employee[]employees){
        double maximumSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > maximumSalary) {
                    maximumSalary = employee.getSalary();
                }
            }
        }
        return maximumSalary;
    }
    public static void minimumWageEmployeePrint() {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() == minimumWageEmployee(employees)) {
                    System.out.println("Сотрудник с минимальной зарплатой: " + employee);
                }
            }
        }
    }
    private static double minimumWageEmployee (Employee[]employees){
        double minimumSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (i==0){
                minimumSalary = employees[i].getSalary();
            }
            if (employees[i] != null) {
                if (employees[i].getSalary() < minimumSalary) {
                    minimumSalary = employees[i].getSalary();
                }
            }
        }
        return minimumSalary;
    }
    @Override
    public String toString() {
        return "список сотрудников \n"+ Arrays.toString(employees);
    }

}