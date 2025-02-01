public class StudentBuilder {
    protected Student student;

    public StudentBuilder() {
    }

    public StudentBuilder(String name, String university) {
        student = new Student(name, university);
    }

    public StudentAgeBuilder hasAge() {
        return new StudentAgeBuilder(student);
    }

    public Student build() {
        return student;
    }
}

