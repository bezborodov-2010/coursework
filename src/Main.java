public class Main {
    static int counter = 1;
    static Employee[] employeeArray = new Employee[10];

    public static void main(String[] args) {
        System.out.println("Курсач");

        String employeeName1 = "Борис ";
        String employeeName2 = "Олеся ";
        String employeeName3 = "Виталий ";
        String employeeName4 = "Наталья ";
        String employeeName5 = "Андрей ";

        String employeeName6 = "Василий ";
        String employeeName7 = "Анжела ";
        String employeeName8 = "Ольга ";
        String employeeName9 = "Семен ";
        String employeeName10 = "Геннадий ";

        String employeeSecondName1 = "Сергеевич ";
        String employeeSecondName2 = "Владимировна ";
        String employeeSecondName3 = "Витальевич ";
        String employeeSecondName4 = "Андреевна ";
        String employeeSecondName5 = "Васильевич ";

        String employeeSecondName6 = "Степанович ";
        String employeeSecondName7 = "Петровна ";
        String employeeSecondName8 = "Викторовна ";
        String employeeSecondName9 = "Семенович ";
        String employeeSecondName10 = "Петрович ";

        String employeeLastName1 = "Иванов";
        String employeeLastName2 = "Степанова";
        String employeeLastName3 = "Евсеев";
        String employeeLastName4 = "Кузьмина";
        String employeeLastName5 = "Новожилов";

        String employeeLastName6 = "Мальцев";
        String employeeLastName7 = "Сергеева";
        String employeeLastName8 = "Шубина";
        String employeeLastName9 = "Турбина";
        String employeeLastName10 = "Малахов";

        int deptName1 = 1;
        int deptName2 = 2;
        int deptName3 = 3;
        int deptName4 = 4;
        int deptName5 = 5;

        int deptName6 = 1;
        int deptName7 = 2;
        int deptName8 = 3;
        int deptName9 = 4;
        int deptName10 = 5;

        int employeeSalary1 = 85000;
        int employeeSalary2 = 75000;
        int employeeSalary3 = 65000;
        int employeeSalary4 = 95000;
        int employeeSalary5 = 83000;

        int employeeSalary6 = 87000;
        int employeeSalary7 = 89000;
        int employeeSalary8 = 54000;
        int employeeSalary9 = 85500;
        int employeeSalary10 = 10000;

        employeeArray[0] = new Employee(employeeName1, employeeSecondName1, employeeLastName1, deptName1, employeeSalary1);
        employeeArray[1] = new Employee(employeeName2, employeeSecondName2, employeeLastName2, deptName2, employeeSalary2);
        employeeArray[2] = new Employee(employeeName3, employeeSecondName3, employeeLastName3, deptName3, employeeSalary3);
        employeeArray[3] = new Employee(employeeName4, employeeSecondName4, employeeLastName4, deptName4, employeeSalary4);
        employeeArray[4] = new Employee(employeeName5, employeeSecondName5, employeeLastName5, deptName5, employeeSalary5);
        employeeArray[5] = new Employee(employeeName6, employeeSecondName6, employeeLastName6, deptName6, employeeSalary6);
        employeeArray[6] = new Employee(employeeName7, employeeSecondName7, employeeLastName7, deptName7, employeeSalary7);
        employeeArray[7] = new Employee(employeeName8, employeeSecondName8, employeeLastName8, deptName8, employeeSalary8);
        employeeArray[8] = new Employee(employeeName9, employeeSecondName9, employeeLastName9, deptName9, employeeSalary9);
        employeeArray[9] = new Employee(employeeName10, employeeSecondName10, employeeLastName10, deptName10, employeeSalary10);
//
        printEmployeListAndData(counter);
        System.out.println();
        calculateAndPrintMounthSalary(counter);
        System.out.println();
        findeAndPrintMinSalaryEmployee(counter);
        System.out.println();
        findeAndPrintMaxSalaryEmployee(counter);
        System.out.println();
        calculateAndPrintAverageMounthSalary(counter);
        System.out.println();
        printEmployeeList(counter);
        System.out.println();
    }


    public static void printEmployeListAndData(int idEmp) {
        for (int i = 0; i < employeeArray.length; i++) {
            System.out.println(employeeArray[i]);
        }
    }

    public static void calculateAndPrintMounthSalary(int idEmp) {
        int i = 0;
        int sum = 0;
        for (Employee emp : employeeArray) {
            if (i++ < idEmp - 1) {
                sum = sum + emp.getSalary();
            } else break;
        }
        System.out.println("Сумма зарплат сотрудников за месяц = руб." + sum);
        System.out.println();
    }


    public static void findeAndPrintMinSalaryEmployee(int idEmp) {
        int i;
        int j = 0;
        int salary = employeeArray[0].getSalary();
        Employee employeeWithMinSalary = employeeArray[0];
        for (i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getSalary() < salary) {
                employeeWithMinSalary = employeeArray[i];
                salary = employeeArray[i].getSalary();
            }

        }
        System.out.println("Сотрудник с минимальной з/п:\n" +
                "номер: " + employeeArray[j].getId() +
                ";\t имя: " + employeeArray[j].getName() +
                ";\t отчество: " + employeeArray[j].getSecondName() +
                ";\t фамилия: " + employeeArray[j].getLastName() +
                ";\t отдел: " + employeeArray[j].getDepartmentName() +
                ";\t з/п: " + employeeArray[j].getSalary() + " руб.");
    }

    public static void findeAndPrintMaxSalaryEmployee(int idEmp) {
        int i;
        int j = 0;
        int salary = employeeArray[0].getSalary();
        Employee employeeWithMaxSalary = employeeArray[0];
        for (i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getSalary() < salary) {
                employeeWithMaxSalary = employeeArray[i];
                salary = employeeArray[i].getSalary();
            }

        }
        System.out.println("Сотрудник с максимальной з/п:\n" +
                "номер: " + employeeArray[j].getId() +
                ";\t имя: " + employeeArray[j].getName() +
                ";\t отчество: " + employeeArray[j].getSecondName() +
                ";\t фамилия: " + employeeArray[j].getLastName() +
                ";\t отдел: " + employeeArray[j].getDepartmentName() +
                ";\t з/п: " + employeeArray[j].getSalary() + " руб.");
    }

    public static void calculateAndPrintAverageMounthSalary(int idEmp) {
        int i = 0;
        int sum = 0;
        double sumAverage = 0;
        for (Employee emp : employeeArray) {
            if (i++ < employeeArray.length) {
                sum = sum + emp.getSalary();
            } else break;
        }
        sumAverage = (double) sum/employeeArray.length;
        System.out.println("Средняя з/п сотрудников за месяц =" + sumAverage);
        System.out.println();
    }

    public static void printEmployeeList(int idEmp) {
        for (int i = 0; i < employeeArray.length; i++) {
            System.out.println("ФИО сотрудника " + employeeArray[i].getName() + employeeArray[i].getSecondName() + employeeArray[i].getLastName());
        }
    }

}


