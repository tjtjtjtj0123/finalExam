package com.example.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Artist implements Serializable {
	private int id;			
	private String name;		
	private String debutYear;	// 데뷔한 해
	private String genre;		// 장르
	private String members;		// 구성원
	private int agentId;		// 소속사 ID
	private Company agent;		// 소속사
	
	public Artist() { }

	public Artist(int id, String name, String debutYear, String genre, String members, int agentId) {
		super();
		this.id = id;
		this.name = name;
		this.debutYear = debutYear;
		this.genre = genre;
		this.members = members;
		this.agentId = agentId;
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
	public String getDebutYear() {
		return debutYear;
	}
	public void setDebutYear(String debutYear) {
		this.debutYear = debutYear;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getMembers() {
		return members;
	}
	public void setMembers(String members) {
		this.members = members;
	}
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public Company getAgent() {
		return agent;
	}
	public void setAgent(Company agent) {
		this.agent = agent;
	}
	
}
