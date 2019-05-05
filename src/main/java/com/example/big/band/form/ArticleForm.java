package com.example.big.band.form;

import java.io.Serializable;
import java.util.Date;

import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes
public class ArticleForm  implements Serializable{

	private static final long serialVersionUID = -157143280035400042L;
	
	private int articleId;
	private String title;   
	private String overview;  
	private String content1;  
	private String content2;  
	private String content3;  
	private String content4;  
	private String content5;  
	private String imgUrl1;  
	private String imgUrl2;  
	private String imgUrl3;  
	private String imgUrl4;  
	private String imgUrl5;  
	private Date instYmd;  
	private boolean delFlg;
	
	
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getContent1() {
		return content1;
	}
	public void setContent1(String content1) {
		this.content1 = content1;
	}
	public String getContent2() {
		return content2;
	}
	public void setContent2(String content2) {
		this.content2 = content2;
	}
	public String getContent3() {
		return content3;
	}
	public void setContent3(String content3) {
		this.content3 = content3;
	}
	public String getContent4() {
		return content4;
	}
	public void setContent4(String content4) {
		this.content4 = content4;
	}
	public String getContent5() {
		return content5;
	}
	public void setContent5(String content5) {
		this.content5 = content5;
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
	public Date getInstYmd() {
		return instYmd;
	}
	public void setInstYmd(Date instYmd) {
		this.instYmd = instYmd;
	}
	public boolean isDelFlg() {
		return delFlg;
	}
	public void setDelFlg(boolean delFlg) {
		this.delFlg = delFlg;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}   
	
	
	
}
