package DependencyInversion;

public class Dependency_Inversion {
  
}

interface QC {
  public void test();
}

class ManualQC implements QC {
  public void test() {
    this.doManualTest();
  }
  
  public void doManualTest() {
    System.out.println("Manual Testing");
  }
}

class AutomationQC implements QC {
  public void test() {
    this.doAutoTest();
  }
  
  public void doAutoTest() {
    System.out.println("Automation Testing");
  }
}