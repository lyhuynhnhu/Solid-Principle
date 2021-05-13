package OpenClosed;

public int defaultSalary = 2000000;

public class Open_Closed {
  public static void main(String[] args) {
    
  }
}

abstract class Employee {
  public String name;
  public int age;

  public Employee(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public abstract int getSalary();
}

class NewEmployee extends Employee {
  public NewEmployee(String name, int age) {
    super(name, age);
  }

  public int getSalary() {
    return defaultSalary + (this.age * 100);
  }
}

class VeteranEmployee extends Employee {
  public VeteranEmployee(String name, int age) {
    super(name, age);
  }

  public int getSalary() {
    return defaultSalary + (this.age * 500);
  }
}