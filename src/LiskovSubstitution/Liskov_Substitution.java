package LiskovSubstitution;

public class Liskov_Substitution {
  public static void main(String[] args) {
    Crawling_Animal crawling = new Snake();
    crawling.print();

    Jumping_Animal jumping = new Frog();
    jumping.print();
  }
}

class Crawling_Animal {
  public void print() {
    System.out.println("This is a crawling animal");
  }
}

class Jumping_Animal {
  public void print() {
    System.out.println("This is a jumping animal");
  }
}

class Snake extends Crawling_Animal {
  //do another func
}
 class Frog extends Jumping_Animal {
   //do another func
 }