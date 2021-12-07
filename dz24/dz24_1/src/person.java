import java.util.Optional;

public class person {

    private String lastName;
    private String firstName;
    private String middleName;


    public person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return String.join(" ",
                lastName,
                Optional.ofNullable(firstName).map(s -> s.charAt(0) + ".").orElse(""),
                Optional.ofNullable(middleName).map(s -> s.charAt(0) + ".").orElse(""));
    }
}