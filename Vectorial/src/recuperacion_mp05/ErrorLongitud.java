package recuperacion_mp05;

public class ErrorLongitud extends Exception {
	private Error code;

	public ErrorLongitud(String message, Throwable cause, Error code) {
        super(message, cause);
            this.code = code;
    }
}
