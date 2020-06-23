package com.example.model;

public class SearchCommand {
	private String name;		
	private String genre;		// 장르
	private String debutYear;	// 데뷔한 해
	
	public SearchCommand() { }

	public SearchCommand(String name, String debutYear, String genre) {
		super();
		this.name = name;
		this.debutYear = debutYear;
		this.genre = genre;
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

	@Override
	public String toString() {
		return "SearchCommand [name=" + name + ", genre=" + genre + ", debutYear=" + debutYear + "]";
	}	
}
