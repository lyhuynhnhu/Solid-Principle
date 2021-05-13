package SingleResponsibility;

import java.util.Calendar;

public class Single_Responsibility {
  public static void main(String[] args) {
    Student s = new Student();
    s.setId(1);
    s.setName("Huynh Nhu");
    s.setYearBorn(1999);
    s.setScoreMath(9);
    s.setScoreEng(8);
    
    Calculation cal = new Calculation();
    int age = cal.calAge(s.getYearBorn());
    System.out.println("Age: " + age);
    float score = cal.calAverageScore(s.getScoreMath(), s.getScoreEng());
    System.out.println("Score: " + score);
  }
}
class Student {
  public int id;
  public String name;
  public int yearBorn;
  public int scoreMath;
  public int scoreEng;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getYearBorn() {
    return yearBorn;
  }

  public void setYearBorn(int yearBorn) {
    this.yearBorn = yearBorn;
  }

  public int getScoreMath() {
    return scoreMath;
  }

  public void setScoreMath(int scoreMath) {
    this.scoreMath = scoreMath;
  }

  public int getScoreEng() {
    return scoreEng;
  }

  public void setScoreEng(int scoreEng) {
    this.scoreEng = scoreEng;
  }
  
  public Student(){
  }
  
  public Student(int id, String name, int year, int score1, int score2) {
    this.id = id;
    this.name = name;
    this.yearBorn = year;
    this.scoreMath = score1;
    this.scoreEng = score2;
  }
}

class Calculation {
  public int calAge(int yearBorn) {
    int age = 0;
    int curentYear = Calendar.getInstance().get(Calendar.YEAR);
    age = curentYear - yearBorn;
    return age;
  }
  
  public float calAverageScore(int scoreMath, int scoreEng) {
    return (scoreMath + scoreEng) / 2;
  }
}
