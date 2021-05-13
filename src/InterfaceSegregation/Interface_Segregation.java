package InterfaceSegregation;

public class Interface_Segregation {
  public static void main(String[] args) {
    
  }
}

interface Human_Study {
  public void study();
}

interface Human_Work {
  public void work();
}

class Children implements Human_Study {
  @Override
  public void study(){
    System.out.println("Studying");
  }
}

class Employee implements Human_Work {
  @Override
  public void work(){
    System.out.println("Working");
  }
}

class Student implements Human_Study, Human_Work {
  @Override
  public void study(){
    System.out.println("Studying");
  }
  
  @Override
  public void work(){
    System.out.println("Working");
  }
}