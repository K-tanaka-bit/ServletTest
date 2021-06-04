package model;

import java.io.Serializable;

public class ContactBean implements Serializable {

	private String name;
	private String campany;
	private String mail;
	private String contents;
	private String[] magazine;
	private String document;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCampany() {
		return campany;
	}
	public void setCampany(String campany) {
		this.campany = campany;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String[] getMagazine() {
		return magazine;
	}
	public void setMagazine(String[] magazine) {
		this.magazine = magazine;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}

}

