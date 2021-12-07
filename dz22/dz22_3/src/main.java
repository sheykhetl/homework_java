import java.util.Date;

public class main {

    public static void main(String[] args) {
        task task = new task(
                "Conan O'Brien",
                new Date(3600*1000*24*7),
                new Date(3600*1000*24*15)
        );
        System.out.println("Developer : " + task.getAssignee());
        System.out.println("Start date : " + task.getStartDate());
        System.out.println("Complete date : " + task.getCompleteDate());
    }

}