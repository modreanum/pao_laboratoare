package task1;

public class Student {
    private String name;
    private Double labGrade;
    private Double partialGrade;
    private Double examGrade;
    public Student(String name, Double labGrade,Double partialGrade,Double examGrade){
        this.name=name;
        this.labGrade=labGrade;
        this.partialGrade=partialGrade;
        this.examGrade=examGrade;
    }
    @Override
    public String toString(){
        return String.format("%s %.2f %.2f %.2f",this.name,this.labGrade,this.partialGrade,this.examGrade);
    }

    public String getName() {
        return name;
    }

    public Double getExamGrade() {
        return examGrade;
    }

    public Double getLabGrade() {
        return labGrade;
    }

    public Double getPartialGrade() {
        return partialGrade;
    }

}
