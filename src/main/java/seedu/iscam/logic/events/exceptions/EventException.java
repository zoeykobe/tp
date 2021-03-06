package seedu.iscam.logic.events.exceptions;

/**
 * Represents an error which occurs during creation of a {@link Event}.
 */
public class EventException extends Exception {
    public EventException(String message) {
        super(message);
    }

    /**
     * Constructs a new {@code CommandException} with the specified detail {@code message} and {@code cause}.
     */
    public EventException(String message, Throwable cause) {
        super(message, cause);
    }
}
