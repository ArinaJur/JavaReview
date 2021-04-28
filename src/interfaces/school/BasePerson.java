package interfaces.school;

public abstract class BasePerson {

    private String firstName;
    private String lastName;
    private char gender;
    private int age;
    private String status;
    private static String SchoolName;

    BasePerson(String firstName, String lastName, char gender, int age, String status) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.gender = gender;
        this.age = age;
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getStatus() {
        return status;
    }

    public static String getSchoolName() {
        return SchoolName;
    }

}
