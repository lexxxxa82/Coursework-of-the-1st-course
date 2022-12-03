public class Main {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();

        employeeData.addEmployee("Баранова Полина Ильинична", "12000");
        employeeData.addEmployee("Белоусов Артемий Дмитриевич", "14500");
        employeeData.addEmployee("Горбунова Надежда Александровна", "13200");
        employeeData.addEmployee("Еремин Александр Никитич", "21700");
        employeeData.addEmployee("Крюкова Мария Викторовна", "18600");
        employeeData.addEmployee("Кузнецова Кира Елисеевна", "19600");
        employeeData.addEmployee("Фомин Максим Егоровича", "23500");
        employeeData.addEmployee("Рябов Михаил Фёдорович", "25600");
        employeeData.addEmployee("Савин Артемий Елисеевич", "17900");
        employeeData.addEmployee("Казаков Лев Ильич", "15800");
        //employeeData.addEmployee("Крылова Вера Данииловна", "22400");



        employeeData.printAllEmployees();
        System.out.println();

        System.out.println("Количество сотрудников: " + employeeData.getCurrentSize());
        System.out.println();

        employeeData.removeEmployee("Фомин Максим Егоровича");
        employeeData.findEmployee("Фомин Максим Егоровича");

        employeeData.addEmployee("Крылова Вера Данииловна", "22400");
        employeeData.printAllEmployees();
        System.out.println();
        System.out.println("Количество сотрудников: " + employeeData.getCurrentSize());

    }
}