
public class Main {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();

        employeeData.addEmployee("Баранова Полина Ильинична", "1",2.23);
        employeeData.addEmployee("Белоусов Артемий Дмитриевич", "2",14);
        employeeData.addEmployee("Горбунова Надежда Александровна", "3",13);
        employeeData.addEmployee("Еремин Александр Никитич", "4",21);
        employeeData.addEmployee("Крюкова Мария Викторовна", "5",8);
        employeeData.addEmployee("Кузнецова Кира Елисеевна", "1",19);
        employeeData.addEmployee("Фомин Максим Егоровича", "2",23);
        employeeData.addEmployee("Рябов Михаил Фёдорович", "3",25);
        employeeData.addEmployee("Савин Артемий Елисеевич", "4",17);
        employeeData.addEmployee("Казаков Лев Ильич", "5",15);
       // employeeData.addEmployee("Крылова Вера Данииловна", "2",22400);

        employeeData.printAllEmployees();
        System.out.println();
        System.out.println(employeeData);

        System.out.println("Количество сотрудников: " + EmployeeData.getCurrentSize());
        System.out.println();

        employeeData.removeEmployee("Фомин Максим Егоровича");
        employeeData.findEmployee("Фомин Максим Егоровича");

        //employeeData.addEmployee("Крылова Вера Данииловна", "2",22);
        employeeData.printAllEmployees();//список сотрудников
        System.out.println();
        System.out.println("Количество сотрудников: " + EmployeeData.getCurrentSize());
        EmployeeData.totalEmployeePay();//общие затраты на выплату  зарплат
        System.out.println();
        EmployeeData.averageStaffSalary();// средняя зарплата
        System.out.println();
        EmployeeData.highestPaidEmployeePrint();//сотрудник с максимальной зарплатой
        System.out.println();
        EmployeeData.minimumWageEmployeePrint();//сотрудник с минимальной зарплатой
    }
}