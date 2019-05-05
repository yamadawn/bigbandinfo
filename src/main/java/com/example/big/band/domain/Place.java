package com.example.big.band.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "place")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Place implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	
	@Id
    @GeneratedValue(strategy=GenerationType.TABLE, generator="seqTable")
    @TableGenerator(name="seqTable", table="seq_table", pkColumnName="seq_name", pkColumnValue="word_seq", valueColumnName="seq_value")
	@Column(name="place_id")
	private int placeId;
	
	
//	@Id
//	@Column(name="place_id")
//	private int placeId;
	
    @Column(name="place_name")
    private String placeName;
    
    @Column(name="address")
    private String address;
    
    @Column(name="place_clsf")
    private int placeClsf;
    
    @Column(name="memo")
    private String memo;
    
    @Column(name="wifi_flg")
    private boolean wifiFlg;
    
    @Column(name="station_code1")
    private String stationCode1;
    @Column(name="station_code2")
    private String stationCode2;
    @Column(name="station_code3")
    private String stationCode3;
    @Column(name="station_code4")
    private String stationCode4;
    @Column(name="station_code5")
    private String stationCode5;
    
    @Column(name="evaluation_item1")
    private int evaluationItem1;
    @Column(name="evaluation_item2")
    private int evaluationItem2;
    @Column(name="evaluation_item3")
    private int evaluationItem3;
    @Column(name="evaluation_item4")
    private int evaluationItem4;
    @Column(name="evaluation_item5")
    private int evaluationItem5;
    @Column(name="evaluation_item6")
    private int evaluationItem6;
    
    @Column(name="img_url1")
    private String imgUrl1;    
    @Column(name="img_url2")
    private String imgUrl2;        
    @Column(name="img_url3")
    private String imgUrl3;       
    @Column(name="img_url4")
    private String imgUrl4;       
    @Column(name="img_url5")
    private String imgUrl5;
    
    @Column(name="hour_fee1")
    private int hourFee1;
    @Column(name="hour_fee2")
    private int hourFee2;
    @Column(name="hour_fee3")
    private int hourFee3;
    @Column(name="hour_fee4")
    private int hourFee4;
    @Column(name="hour_fee5")
    private int hourFee5;
    
    
	public int getPlaceId() {
		return placeId;
	}
	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPlaceClsf() {
		return placeClsf;
	}
	public void setPlaceClsf(int placeClsf) {
		this.placeClsf = placeClsf;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public boolean isWifiFlg() {
		return wifiFlg;
	}
	public void setWifiFlg(boolean wifiFlg) {
		this.wifiFlg = wifiFlg;
	}
	public String getStationCode1() {
		return stationCode1;
	}
	public void setStationCode1(String stationCode1) {
		this.stationCode1 = stationCode1;
	}
	public String getStationCode2() {
		return stationCode2;
	}
	public void setStationCode2(String stationCode2) {
		this.stationCode2 = stationCode2;
	}
	public String getStationCode3() {
		return stationCode3;
	}
	public void setStationCode3(String stationCode3) {
		this.stationCode3 = stationCode3;
	}
	public String getStationCode4() {
		return stationCode4;
	}
	public void setStationCode4(String stationCode4) {
		this.stationCode4 = stationCode4;
	}
	public String getStationCode5() {
		return stationCode5;
	}
	public void setStationCode5(String stationCode5) {
		this.stationCode5 = stationCode5;
	}
	public int getEvaluationItem1() {
		return evaluationItem1;
	}
	public void setEvaluationItem1(int evaluationItem1) {
		this.evaluationItem1 = evaluationItem1;
	}
	public int getEvaluationItem2() {
		return evaluationItem2;
	}
	public void setEvaluationItem2(int evaluationItem2) {
		this.evaluationItem2 = evaluationItem2;
	}
	public int getEvaluationItem3() {
		return evaluationItem3;
	}
	public void setEvaluationItem3(int evaluationItem3) {
		this.evaluationItem3 = evaluationItem3;
	}
	public int getEvaluationItem4() {
		return evaluationItem4;
	}
	public void setEvaluationItem4(int evaluationItem4) {
		this.evaluationItem4 = evaluationItem4;
	}
	public int getEvaluationItem5() {
		return evaluationItem5;
	}
	public void setEvaluationItem5(int evaluationItem5) {
		this.evaluationItem5 = evaluationItem5;
	}
	public int getEvaluationItem6() {
		return evaluationItem6;
	}
	public void setEvaluationItem6(int evaluationItem6) {
		this.evaluationItem6 = evaluationItem6;
	}
	public String getImgUrl1() {
		return imgUrl1;
	}
	public void setImgUrl1(String imgUrl1) {
		this.imgUrl1 = imgUrl1;
	}
	public String getImgUrl2() {
		return imgUrl2;
	}
	public void setImgUrl2(String imgUrl2) {
		this.imgUrl2 = imgUrl2;
	}
	public String getImgUrl3() {
		return imgUrl3;
	}
	public void setImgUrl3(String imgUrl3) {
		this.imgUrl3 = imgUrl3;
	}
	public String getImgUrl4() {
		return imgUrl4;
	}
	public void setImgUrl4(String imgUrl4) {
		this.imgUrl4 = imgUrl4;
	}
	public String getImgUrl5() {
		return imgUrl5;
	}
	public void setImgUrl5(String imgUrl5) {
		this.imgUrl5 = imgUrl5;
	}
	public int getHourFee1() {
		return hourFee1;
	}
	public void setHourFee1(int hourFee1) {
		this.hourFee1 = hourFee1;
	}
	public int getHourFee2() {
		return hourFee2;
	}
	public void setHourFee2(int hourFee2) {
		this.hourFee2 = hourFee2;
	}
	public int getHourFee3() {
		return hourFee3;
	}
	public void setHourFee3(int hourFee3) {
		this.hourFee3 = hourFee3;
	}
	public int getHourFee4() {
		return hourFee4;
	}
	public void setHourFee4(int hourFee4) {
		this.hourFee4 = hourFee4;
	}
	public int getHourFee5() {
		return hourFee5;
	}
	public void setHourFee5(int hourFee5) {
		this.hourFee5 = hourFee5;
	}
    
    
    
        	
}
