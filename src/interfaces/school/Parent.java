package interfaces.school;

public final class Parent extends BasePerson {

    private long phoneNumber;
    private Student student;

    Parent(String firstName, String lastName, char gender, int age, String status, long phoneNumber, Student student) {
        super(firstName, lastName, gender, age, status);
        this.phoneNumber = phoneNumber;
        this.student = student;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public Student getStudent() {
        return student;
    }

    public void printParent() {
        System.out.println();
        System.out.println(
               getFirstName() + " " + getLastName() + ", is parent of Student " +
                       student.getFirstName() + " " + student.getLastName() + ", grade " + student.getGrade() + "."
        );
        System.out.println( "Parent's phone number: " + getPhoneNumber());
    }
}
