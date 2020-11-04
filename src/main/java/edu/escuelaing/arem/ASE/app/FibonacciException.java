package edu.escuelaing.arem.ASE.app;

public class FibonacciException extends Exception {
	
	public FibonacciException(String message) {
		super(message);
	}

	public FibonacciException(String message, Throwable cause) {
		super(message, cause);
	}

	private static final long serialVersionUID = 1L;
}
