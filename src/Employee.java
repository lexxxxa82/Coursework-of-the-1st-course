public class Employee {
            private final String id;
            private String employeeData;
           // private int salary;
           // private int department;

            public Employee (String id, String employeeData) {
                this.id = id;
                this.employeeData = employeeData;
            }

            public String getId() {
                return id;
            }

            public String getEmployeeData(){
                return employeeData;
            }

            public void setEmployeeData(String employeeData) {
                this.employeeData = employeeData;
            }

}
