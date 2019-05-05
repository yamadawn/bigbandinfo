package com.example.big.band.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "railway")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Railway {

	@Id
	private String railwayCode;
	@Column
	private String railwayName;
	@Column
	private boolean delFlg;

	public String getRailwayCode() {
		return railwayCode;
	}

	public void setRailwayCode(String railwayCode) {
		this.railwayCode = railwayCode;
	}

	public String getRailwayName() {
		return railwayName;
	}

	public void setRailwayName(String railwayName) {
		this.railwayName = railwayName;
	}

	public boolean isDelFlg() {
		return delFlg;
	}

	public void setDelFlg(boolean delFlg) {
		this.delFlg = delFlg;
	}

}
