import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class main {

    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        student student = new student(0, "Dave Chappelle",
                dateFormat.parse("01-01-1990"));
        System.out.println(student.getBirthDate("full"));
        System.out.println(student.getBirthDate("medium"));
        System.out.println(student.getBirthDate("small"));
    }

}