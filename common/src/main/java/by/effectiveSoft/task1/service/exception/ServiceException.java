package by.effectiveSoft.task1.service.exception;

public class ServiceException extends Exception {

	private static final long serialVersionUID = -8476272103511355412L;

	public ServiceException() {
	}

	public ServiceException(String msg) {
		super(msg);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}

	public ServiceException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
