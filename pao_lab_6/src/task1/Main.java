package task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students= new ArrayList<>();
        students.add(new Student("student1",6.0,9.0,8.3));
        students.add(new Student("student2",4.0,7.5,5.3));
        students.add(new Student("student3",9.0,3.0,8.6));
Sorter sorter=new SortBySum();
sorter.sort(students);
        System.out.println("Sortare dupa cea mai mare nota totala");
        printStudents(students);

        sorter=new SortByPartial();
        sorter.sort(students);
        System.out.println("Sortare dupa partial");
        printStudents(students);


        sorter=new SortBySum();
        sorter.sort(students);
        System.out.println("Sortare dupa medie");
        printStudents(students);

    }
    private static void printStudents(List<Student> students){
        for(int i=0; i<students.size();i++){

            System.out.println(i+1+". "+students.get(i));
        }
        }


}
