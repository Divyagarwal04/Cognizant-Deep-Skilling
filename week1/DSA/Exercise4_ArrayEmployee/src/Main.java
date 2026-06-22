public class Main {

    public static void main(String[] args) {

        EmployeeManagement emp = new EmployeeManagement();

        emp.add(new Employee(101, "Divya", "Developer", 50000));
        emp.add(new Employee(102, "Rahul", "Tester", 40000));
        emp.add(new Employee(103, "Aman", "Manager", 70000));

        emp.display();

        System.out.println("\nSearch");

        System.out.println(emp.search(102));

        emp.delete(101);

        System.out.println("\nAfter Delete");

        emp.display();

    }

}