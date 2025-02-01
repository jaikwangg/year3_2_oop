// Product
public class Student {
    public final String name,university;
    public int age;

    public Student(String name, String university) {
        this.name = name;
        this.university = university;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + name + "\n");
        sb.append("University: " + university + "\n");
        if (age != 0) {
            sb.append("Age: ").append(age).append("\n");
        }
        return sb.toString();
    }
}
