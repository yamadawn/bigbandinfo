package com.example.big.band.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "station")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Station {

	@Id
	private String stationCode;
	@Column
	private String staionName;
	@Column
	private boolean delFlg;
	public String getStationCode() {
		return stationCode;
	}
	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}
	public String getStaionName() {
		return staionName;
	}
	public void setStaionName(String staionName) {
		this.staionName = staionName;
	}
	public boolean isDelFlg() {
		return delFlg;
	}
	public void setDelFlg(boolean delFlg) {
		this.delFlg = delFlg;
	}

}
