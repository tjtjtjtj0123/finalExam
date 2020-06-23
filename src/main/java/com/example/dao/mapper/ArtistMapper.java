package com.example.dao.mapper;

import java.util.List;
import java.util.Map;

import com.example.model.Artist;

public interface ArtistMapper {
	Artist selectArtistById(int artistId);

	List<Artist> selectArtistsByAgentId(int agentId);

	List<Artist> selectArtistsByAgentName(String agentName);

	List<Artist> selectArtistsByCondition(Map<String, Object> condition);
}
