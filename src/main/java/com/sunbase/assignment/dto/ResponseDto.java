package com.sunbase.assignment.dto;

public class ResponseDto {

	private Object result;
	private String status;
	
	public ResponseDto() {
		super();
	}
	public ResponseDto(Object result, String status) {
		super();
		this.result = result;
		this.status = status;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
