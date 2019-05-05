package com.example.big.band.form;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class ResearchForm  implements Serializable{

	private static final long serialVersionUID = -157143280035400042L;

	private String[] fchecks;
	
	private String text;
	
	private String code[];

	
	@NotNull
	public String[] getCode() {
		return code;
	}

	public void setCode(String[] code) {
		this.code = code;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String[] getFchecks() {
		return fchecks;
	}

	public void setFchecks(String[] fchecks) {
		this.fchecks = fchecks;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
