public class App {
    public static void main(String[] args) {
        //CEO
        Employee ceo = new Employee("Settha", "CEO", 500000);
        
        //Sales
        Employee headSales = new Employee("Kamphaka", "Head Sales", 300000);
        Employee sales1   = new Employee("Wiroj", "Sales", 150000);
        Employee sales2   = new Employee("Weeranan", "Sales", 100000);
        headSales.addSubordinate(sales1);
        headSales.addSubordinate(sales2);

        //Marketing
        Employee headMarketing = new Employee("UngInk", "Head Marketing", 300000);
        Employee marketing1    = new Employee("Oak", "Marketing", 200000);
        Employee marketing2    = new Employee("Aem", "Marketing", 250000);
        headMarketing.addSubordinate(marketing1);
        headMarketing.addSubordinate(marketing2);

        //Head Sales ,Head Marketing ไปอยู่ใต้ CEO
        ceo.addSubordinate(headSales);
        ceo.addSubordinate(headMarketing);

        printAllEmployee(ceo, 0);
    }
    public static void printAllEmployee(Employee employee, int level) {
        // System.out.println(ceo);
        String indent = "    ".repeat(level);
        System.out.println(indent + employee.toString());

        for (Employee e : employee.getSubordinates()) {
            printAllEmployee(e, level + 1);
        }
    }
}
//hierarchy