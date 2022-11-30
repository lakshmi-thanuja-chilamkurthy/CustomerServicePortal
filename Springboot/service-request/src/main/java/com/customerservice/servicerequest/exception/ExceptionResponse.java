package com.customerservice.servicerequest.exception;

public class ExceptionResponse {
	private Object reqData;
	private String exception;
	private String message;
	public Object getReqData() {
		return reqData;
	}
	public void setReqData(Object reqData) {
		this.reqData = reqData;
	}
	public String getException() {
		return exception;
	}
	public void setException(String exception) {
		this.exception = exception;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ExceptionResponse [reqData=" + reqData + ", exception=" + exception + ", message=" + message + "]";
	}
	public ExceptionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExceptionResponse(Object reqData, String exception, String message) {
		super();
		this.reqData = reqData;
		this.exception = exception;
		this.message = message;
	}
	
	

}
