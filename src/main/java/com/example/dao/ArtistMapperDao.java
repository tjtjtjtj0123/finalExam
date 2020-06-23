package com.example.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.dao.mapper.ArtistMapper;
import com.example.model.Artist;

@Repository
public class ArtistMapperDao {
	@Autowired
	private ArtistMapper mapper;
	/*
	void setMapper(ArtistMapper mapper) {
		this.mapper = mapper;
	}
	*/
	public Artist findArtistById(int artistId) {
		return mapper.selectArtistById(artistId);
	}

	public List<Artist> findArtistsByAgentId(int agentId) {
		return mapper.selectArtistsByAgentId(agentId);
	}
	
	public List<Artist> findArtistsByAgentName(String agentName) {
		return mapper.selectArtistsByAgentName(agentName);
	}

	public List<Artist> findArtistsByCondition(Map<String, Object> condition) {
		return mapper.selectArtistsByCondition(condition);
	}
}