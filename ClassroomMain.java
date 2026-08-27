public class ClassroomMain {
    public static void main(String[] args) {
        Classroom c1 = new Classroom("Mr. Morris");
        Classroom c2 = new Classroom("Mr. Davidson", 25, 22);

        c1.setDesks(30);
        System.out.println(c2.teacher(), c2.desks(), c2.students());
    }
}
