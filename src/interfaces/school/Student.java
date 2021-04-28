package interfaces.school;

public final class Student extends BasePerson {

    private int grade;

    Student(String firstName, String lastName,
            char gender, int age, String status, int grade) {
        super(firstName, lastName, gender, age, status);
        this.grade = grade;
    }

    public final int getGrade() {
        return grade;
    }

    public void printParent(Parent[] parents) {
        for(Parent parent: parents) {
            if (parent.getStudent().equals(this)) {
                System.out.println();
                System.out.println(
                        "Student: " + getFirstName() + " " + getLastName() + ", grade " + getGrade()
                );
                System.out.println(
                        "Parent: " + parent.getFirstName() + " " + parent.getLastName() +
                        " phone number: " + parent.getPhoneNumber()
                );
            }
        }
    }
}

