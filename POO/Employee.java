public class Employee {
  private String firstName, secondName;
  private double salary;


  public Employee(String firstName, String secondName, double salary) {
    this.firstName = firstName; this.secondName = secondName;
    this.salary = salary;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public String getFirstName() {
    return this.firstName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }
  public String getSecondName() {
    return this.secondName;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
  public double getSalary() {
    return this.salary;
  }


  public String toString() {
    return String.format("+-----------------------------------+\r\n"+
                         "| First Name......: %s\r\n"               +
                         "| Second Name.....: %s\r\n"               +
                         "| Salary..........: %.3f\r\n"             +
                         "+-----------------------------------+\r\n", this.firstName, this.secondName, this.salary);
  }
}