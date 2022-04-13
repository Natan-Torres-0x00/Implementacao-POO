public class Main {
  public static void main(String args[]) {
    ComissionedEmployee comissionedEmployee = new ComissionedEmployee("Rodrigo", "Valente", 15000.0, 1000.0, 10);
    Employee employee = new Employee("Joao", "Neves", 10000.0);


    System.out.println(comissionedEmployee.toString());
    System.out.println(employee.toString());
  }
}
