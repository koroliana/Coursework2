package tasks;

import java.time.LocalDate;

public class WeeklyTask extends Task{
    public WeeklyTask(String description, Type type, String title) {
        super(description, type, title);
    }

    @Override
    public boolean appearsIn(LocalDate localDate) {
        return(localDate.equals(super.getDateTime()));
    }
}
