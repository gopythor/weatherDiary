package zerobase.weather.error;

public class InvalidDate extends RuntimeException{
    private static final String MESSAGE = "Too Past or so future ";

    public InvalidDate(){
        super(MESSAGE);
    }
}
