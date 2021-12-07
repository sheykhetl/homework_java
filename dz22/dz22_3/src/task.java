import java.time.Duration;
import java.util.Date;

public class task {

    private String assignee;
    private Date completeDate;
    private Date startDate;

    public Date getCompleteDate() {
        return completeDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public task(String assignee, Date startDate, Date completeDate) {
        this.assignee = assignee;
        this.startDate = startDate;
        this.completeDate = completeDate;
//        this.startDate = new Date();
    }

    public String getAssignee() {
        return assignee;
    }


}