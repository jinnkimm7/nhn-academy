
/**
  Student 객체를 생성하면, 메모리에 객체가 3개 생성됩니다.
  생성자는 메모리에 있는 객체를 초기화합니다.
 */

public class Member {
  private int no;

  public Member(int no) {
    this.no = no;
  }

  public int getNo() {
    return this.no;
  }
}

class Student extends Member implements Comparable<Student>{
  private String name;

  public Student(int no, String name) {
    super(no);
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public int compareTo(Student s) {
    return this.getNo() - s.getNo();
  }
}