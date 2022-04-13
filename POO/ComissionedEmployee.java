public class ComissionedEmployee extends Employee {
  private double comission;
  private int sales;


  public ComissionedEmployee(String firstName, String secondsName, double salary, double comission, int sales) {
    super(firstName, secondsName, salary);

    this.comission = comission;
    this.sales = sales;
  }

  public void setComission(double comission) {
    this.comission = comission;
  }
  public double getComission() {
    return this.comission;
  }

  public void setSales(int sales) {
    this.sales = sales;
  }
  public double getSales() {
    return this.sales;
  }

  public String toString() {
    return String.format("+-----------------------------------+\r\n"+
                         "| First Name......: %s\r\n"               +
                         "| Second Name.....: %s\r\n"               + 
                         "| Salary..........: %.3f\r\n"             +
                         "| Comission.......: %.3f\r\n"             +
                         "| Sales...........: %d\r\n"               +
                         "+-----------------------------------+\r\n", this.getFirstName(), this.getSecondName(), this.getSalary(), this.comission, this.sales);
  }
}