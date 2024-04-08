package task1;

import java.util.List;

public class SortByAverage implements Sorter{
    @Override
    public void sort(List<Student> students){

        students.sort((student1,student2)->{
            Double avg1=(student1.getExamGrade() + student1.getLabGrade() + student1.getPartialGrade())/3;

            Double avg2=(student2.getExamGrade() + student2.getLabGrade() + student2.getPartialGrade())/3;
            return avg2.compareTo(avg1);
        });
    }
}
