public class EmployeeManagement {

    Employee[] employees = new Employee[100];
    int count = 0;

    public void add(Employee e) {
        employees[count++] = e;
    }

    public Employee search(int id) {

        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id)
                return employees[i];
        }

        return null;
    }

    public void delete(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[count - 1] = null;
                count--;
                break;
            }
        }
    }

    public void display() {

        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }

    }

}