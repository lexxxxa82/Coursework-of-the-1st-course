public class EmployeeData {
    private final Employee[] employees;
    private int size;

    public EmployeeData() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String employeeId, String employeeData) {
        if (size >= employees.length) {
            System.out.println("Все вакансии заняты , ввод нового сотрудника не возможен");
        }
        Employee newEmployee = new Employee(employeeId, employeeData);
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
//Этот метод сдвигает массив влево на одну ячейку, затирая ячейку под номером i путем смещения всех элементов справа на одну ячейку влево
            }
        }
    }
    public void findEmployee(String employeeId) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getId().equals(employeeId)) {
                System.out.println(employee.getId() + ": " + employee.getEmployeeData());
                return;
            }
        }
        System.out.println("сотрудник " + employeeId + " не найден");
    }

    public void printAllEmployees() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getId() + ": " + employee.getEmployeeData());
        }
    }

    public int getCurrentSize() {
        return size;
    }

}


