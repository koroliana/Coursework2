package tasks;

import java.time.LocalDate;

public class DailyTask extends Task{

    public DailyTask(String description, Type type, String title) {
        super(description, type, title);
    }

    @Override
    public boolean appearsIn(LocalDate localDate) {
        return(localDate.equals(super.getDateTime()));
     }

}
