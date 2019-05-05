package com.example.big.band.form;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.web.bind.annotation.SessionAttributes;


public class BackOfficeForm  implements Serializable{

	private static final long serialVersionUID = -157143280035400042L;

	private String password;
	
	private String loginId;
	
	private String[] fchecks;
	
	private String text;
	
	private String code[];
	
	private String authKey;
	
	private boolean isNewRegist;

	
	@NotNull
	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	
	@NotNull
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String[] getFchecks() {
		return fchecks;
	}

	public void setFchecks(String[] fchecks) {
		this.fchecks = fchecks;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String[] getCode() {
		return code;
	}

	public void setCode(String[] code) {
		this.code = code;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getAuthKey() {
		return authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}

	public boolean isNewRegist() {
		return isNewRegist;
	}

	public void setNewRegist(boolean isNewRegist) {
		this.isNewRegist = isNewRegist;
	}

}
