package com.example.big.band.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "band")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Band {

    @Id
	private int bandId;
    @Column
    private String bandName;
    @Column
    private int bandClsf;
    @Column
    private String bandMemo;
    @Column
    private String imgUrl;
    
    
	public int getBandId() {
		return bandId;
	}
	public void setBandId(int bandId) {
		this.bandId = bandId;
	}
	public String getBandName() {
		return bandName;
	}
	public void setBandName(String bandName) {
		this.bandName = bandName;
	}
	public int getBandClsf() {
		return bandClsf;
	}
	public void setBandClsf(int bandClsf) {
		this.bandClsf = bandClsf;
	}
	public String getBandMemo() {
		return bandMemo;
	}
	public void setBandMemo(String bandMemo) {
		this.bandMemo = bandMemo;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
}
