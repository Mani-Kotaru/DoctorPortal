package com.exception_handling;

public class InsufficientBalanceException extends Exception {
	InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}
