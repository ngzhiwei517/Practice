package Lab10.Q1;

abstract class Employee {
    private String name;
    private String type;

    public Employee(String name, String type) {
        this.name = name;
        this.type = type;
    }

    abstract double totalSalary();

    public void displayInfo() {
        System.out.println("Name:" + name);
        System.out.println("Employee type:" + type);
        System.out.println("Salary:" + totalSalary());
    }
}

class PermanentEmployee extends Employee {
    private char category;

    public PermanentEmployee(String name, char category) {
        super(name, "Permanent");
        this.category = category;
    }

    public double totalSalary() {
        switch (category) {
            case 'A':
                return 4000;

            case 'B':
                return 3000;

            case 'C':
                return 2000;

            default:
                return 0;
        }
    }
}

class ContractStaff extends Employee{
    private double totalSales;

    public ContractStaff(String name,double totalSales){
        super(name,"Contract");
        this.totalSales=totalSales;
    }

    public double totalSalary(){
        return 500+(0.5*totalSales);
    }
}

class TemporaryStaff extends Employee{
    private int hourWork;

    public TemporaryStaff(String name,int hourWork){
        super(name,"Temporary");
        this.hourWork=hourWork;
    }

    public double totalSalary(){
        return 15*hourWork;
    }
}

class Tester{
    public static void main(String[] args) {
        Employee employee1=new PermanentEmployee("Alice",'A');
        Employee employee2=new ContractStaff("Bob",1000);
        Employee employee3=new TemporaryStaff("Charlie",120);

        System.out.println("Employee details");
        employee1.displayInfo();
        System.out.println();
        employee2.displayInfo();
        System.out.println();
        employee3.displayInfo();
        System.out.println();
    }
}
