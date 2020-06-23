package com.example.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ArtistDao;
// import com.example.dao.ArtistMapperDao;
import com.example.dao.CompanyDao;
import com.example.model.Artist;
import com.example.model.Company;

@Service
public class ArtistService {
	@Autowired
	private ArtistDao artistDao;
	
	@Autowired
	private CompanyDao companyDao;

	public Artist getArtist(int id) {
		return artistDao.findArtistById(id);
	}
	
	public List<String> getCompanyList() {
		return companyDao.findAllCompanyNames();
	}
	
	public List<Artist> getArtistsByAgent(String agentName) {
		Company company = companyDao.findCompanyByName(agentName);
		if (company == null) return null;
		List<Artist> list = artistDao.findArtistsByAgentId(company.getId());
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setAgent(company);
		}
		return list;
	}
	
	public Company getAgentWithArtists(String agentName) {
		Company company = companyDao.findCompanyByName(agentName);
		if (company == null) return null;
		List<Artist> list = artistDao.findArtistsByAgentId(company.getId());
		company.setArtists(list); 
		return company;
	}

	public List<Artist> getArtistsByCondition(Map<String, String> condition) {
		List<Artist> list = artistDao.findArtistsByCondition(condition);
		return list;
	}
}