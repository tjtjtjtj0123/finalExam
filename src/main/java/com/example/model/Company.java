package com.example.model;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class Company implements Serializable {
	private int id;			
	private String name;		
	private String ceo;		// 대표
	private String address;	// 주소
	private String estDate;	// 설립일
	private String website;	// 웹사이트 주소
	private List<Artist> artists; 	// 소속 아티스트
	
	public Company() { }
	
	public Company(int id, String name, String ceo, String address, String estDate, String website) {
		super();
		this.id = id;
		this.name = name;
		this.ceo = ceo;
		this.address = address;
		this.estDate = estDate;
		this.website = website;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEstDate() {
		return estDate;
	}
	public void setEstDate(String estDate) {
		this.estDate = estDate;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public List<Artist> getArtists() {
		return artists;
	}
	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}	
}
