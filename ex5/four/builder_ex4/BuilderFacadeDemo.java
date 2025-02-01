public class BuilderFacadeDemo {
    public static void main(String[] args) {
        StudentBuilder sb = new StudentBuilder("worakij", "KMITL");

        Student student = sb
                .hasAge()
                .of(20)
                .build();

        System.out.println(student);

        Student studentWithoutAge = sb.hasAge().of(0).build();

        System.out.println(studentWithoutAge);

    }
}
