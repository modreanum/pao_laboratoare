package task1;

import java.util.List;

public class SortByPartial implements Sorter{
    @Override
    public void sort(List<Student> students){
        students.sort((student1,student2)->{
            return student2.getPartialGrade().compareTo(student1.getPartialGrade());
        });
    }
}
