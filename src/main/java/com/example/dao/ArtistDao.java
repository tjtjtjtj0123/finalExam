package com.example.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Artist;

@Repository
public class ArtistDao {
	@Autowired
	private SqlSessionTemplate sqlSession;

	private final String namespace = "com.example.dao.mapper.ArtistMapper";

	public Artist findArtistById(int artistId) {
		return (Artist)sqlSession.selectOne(namespace + ".selectArtistById", artistId);
	}

	public List<Artist> findArtistsByAgentId(int agentId) {
		return sqlSession.selectList(namespace + ".selectArtistsByAgentId", agentId);
	}
	
	public List<Artist> findArtistsByAgentName(String agentName) {
		return sqlSession.selectList(namespace + ".selectArtistsByAgentName", agentName);
	}

	public List<Artist> findArtistsByCondition(Map<String, String> condition) {
		return sqlSession.selectList(namespace + ".selectArtistsByCondition", condition);
	}

	/*
	public Integer insertArtist(Artist artist) {
		int result = sqlSession.insert(namespace + ".insertArtist", artist);
		return result;
	}
	*/
}
