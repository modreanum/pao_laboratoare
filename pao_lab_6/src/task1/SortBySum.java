package task1;

import java.util.List;

public class SortBySum implements Sorter {
    @Override
    public void sort(List<Student> students){
        students.sort((student1,student2)->{
            Double s1=student1.getExamGrade() + student1.getLabGrade() + student1.getPartialGrade();
Double s2=student2.getExamGrade() + student2.getLabGrade() + student2.getPartialGrade();
 return s2.compareTo(s1);
        });
    }
}
