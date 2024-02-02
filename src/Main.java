public class Main {

    static Employee[] employeeArray = new Employee[10];

    public static void main(String[] args) {
        System.out.println("Курсач");

        employeeArray[0] = new Employee("Борис ", "Сергеевич ", "Иванов", 1, 85000);
        employeeArray[1] = new Employee("Олеся ", "Владимировна ", "Степанова", 2, 75000);
        employeeArray[2] = new Employee("Виталий ", "Витальевич ", "Евсеев", 3, 65000);
        employeeArray[3] = new Employee("Наталья ", "Андреевна ", "Кузьмина", 4, 95000);
        employeeArray[4] = new Employee("Андрей ", "Васильевич ", "Новожилов", 5, 83000);
        employeeArray[5] = new Employee("Василий ", "Степанович ", "Мальцев", 1, 87000);
        employeeArray[6] = new Employee("Анжела ", "Петровна ", "Сергеева", 2, 89000);
        employeeArray[7] = new Employee("Ольга ", "Викторовна ", "Шубина", 3, 54000);
        employeeArray[8] = new Employee("Семен ", "Семенович ", "Турбина", 4, 85500);
        employeeArray[9] = new Employee("Геннадий ", "Петрович ", "Малахов", 5, 10000);
//
        printEmployeListAndData();
        System.out.println();
        calculateAndPrintMounthSalary();
        System.out.println();
        findeAndPrintMinSalaryEmployee();
        System.out.println();
        findeAndPrintMaxSalaryEmployee();
        System.out.println();
        calculateAndPrintAverageMounthSalary();
        System.out.println();
        printEmployeeList();
        System.out.println();
    }


    public static void printEmployeListAndData() {
        for (int i = 0; i < employeeArray.length; i++) {
            System.out.println(employeeArray[i]);
        }
    }

    public static void calculateAndPrintMounthSalary(int idEmp) {
        int i = 0;
        int sum = 0;
        for (Employee emp : employeeArray) {
            if (i++ < employeeArray.length) {
                sum = sum + emp.getSalary();
            } else break;
        }
        System.out.println("Сумма зарплат сотрудников за месяц = " + sum + " руб.");
        System.out.println();
    }


    public static void findeAndPrintMinSalaryEmployee() {
        int i;
        int salary = employeeArray[0].getSalary();
        Employee employeeWithMinSalary = employeeArray[0];
        for (i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getSalary() < salary) {
                employeeWithMinSalary = employeeArray[i];
                salary = employeeArray[i].getSalary();
            }

        }
        System.out.println("Сотрудник с минимальной з/п: " + employeeWithMinSalary);

    }

    public static void findeAndPrintMaxSalaryEmployee() {
        int i;
        int salary = employeeArray[0].getSalary();
        Employee employeeWithMaxSalary = employeeArray[0];
        for (i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getSalary() > salary) {
                employeeWithMaxSalary = employeeArray[i];
                salary = employeeArray[i].getSalary();
            }

        }
        System.out.println("Сотрудник с максимальной з/п: " + employeeWithMaxSalary);

    }

    public static void calculateAndPrintAverageMounthSalary() {
        int i = 0;
        int sum = 0;
        double sumAverage = 0;
        for (Employee emp : employeeArray) {
            if (i++ < employeeArray.length) {
                sum = sum + emp.getSalary();
            } else break;
        }
        sumAverage = (double) sum / employeeArray.length;
        System.out.println("Средняя з/п сотрудников за месяц =" + sumAverage);
        System.out.println();
    }

    public static void printEmployeeList() {
        for (int i = 0; i < employeeArray.length; i++) {
            System.out.println("ФИО сотрудника " + employeeArray[i].getName() + employeeArray[i].getSecondName() + employeeArray[i].getLastName());
        }
    }

}


