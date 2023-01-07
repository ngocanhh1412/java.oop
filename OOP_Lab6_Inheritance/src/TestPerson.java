public class TestPerson {
    public static void main(String[] args) {
        Staff staff1 = new Staff("Ngoc Anh", "Ha noi", "Khtn", 9000);
        System.out.println("Staff[: " + ", name = " + staff1.getName() + ", add = " + staff1.getAddress()
                + ", school = " + staff1.getSchool() + ", pay = " + staff1.getPay());
        Student student1 = new Student("Ngoc Anh", "Ha noi", "DH", 2, 1000.0);
        System.out.println("Student[: " + " name = " + student1.getName() + " add = " + student1.getAddress()
                + " program = " + student1.getProgram() + " year = " + student1.getYear() + " fee = " + student1.getFee());
    }
}
