public class StudentAgeBuilder extends StudentBuilder {
    public StudentAgeBuilder(Student student) {
        this.student = student;
    }

    public StudentAgeBuilder of(int age) {

        student.age = age;
        return this;
    }

}
