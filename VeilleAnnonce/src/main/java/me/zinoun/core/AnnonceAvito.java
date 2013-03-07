package me.zinoun.core;

public class AnnonceAvito { 
	
	private String img ; 
	private String desc;
	private String prix;
	private String date ; 
	private String lien ;
	

	
	

	public String getLien() {
		return lien;
	}





	public void setLien(String lien) {
		this.lien = lien;
	}





	public AnnonceAvito(String img, String desc, String prix, String date,
			String lien) {
		super();
		this.img = img;
		this.desc = desc;
		this.prix = prix;
		this.date = date;
		this.lien = lien;
	}





	public AnnonceAvito(String img, String desc, String prix, String date) {
		super();
		this.img = img;
		this.desc = desc;
		this.prix = prix;
		this.date = date;
	}





	public String getDate() {
		return date;
	}





	public void setDate(String date) {
		this.date = date;
	}

	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}
	
	
	
	

}
