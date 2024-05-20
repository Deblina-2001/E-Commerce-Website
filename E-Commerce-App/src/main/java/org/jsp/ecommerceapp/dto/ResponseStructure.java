package org.jsp.ecommerceapp.dto;


import lombok.Data;

@Data
public class ResponseStructure<T>
{
	private String massage;
	private T body;
	private int statusCode;
	public String getMassage() {
		return massage;
	}
	public void setMassage(String massage) {
		this.massage = massage;
	}
	public T getBody() {
		return body;
	}
	public void setBody(T body) {
		this.body = body;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	
}
