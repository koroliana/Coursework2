package exceptions;

public class IncorrectArgumentException {
    private String argument;

    public IncorrectArgumentException(String argument) {
        this.argument = argument;
    }
    public String getArgument(){
        return argument;
    }

    @Override
    public String toString() {
        return "Недопустимый аргумент: " + argument;
    }
}
