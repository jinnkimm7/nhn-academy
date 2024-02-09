import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentList implements Iterable<Student>{
  private List<Student> list = new ArrayList<>();

  public void add(Student student) {
    this.list.add(student);
  }

  public void sort() {
    Collections.sort(list);
  }


  @Override
  public Iterator<Student> iterator() {
    return this.list.iterator();
  }
}

class Test {
  public static void main(String[] args) {
    StudentList studentList = new StudentList();
    studentList.add(new Student(1, "Kim"));
    studentList.add(new Student(3, "Lee"));
    studentList.add(new Student(2, "Park"));

    for (Student s : studentList) {
      System.out.println(s.getNo() + ", " + s.getName());
    }

    list.sort();

    System.out.println();

    for (Student s : studentList) {
      System.out.println(s.getNo() + ", " + s.getName());
    }
  }
}

