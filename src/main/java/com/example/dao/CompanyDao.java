package com.example.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Company;

@Repository
public class CompanyDao {
	@Autowired
	private SqlSessionTemplate sqlSession;

	private final String namespace = "com.example.dao.mapper.CompanyMapper";

	public List<String> findAllCompanyNames() {
		return sqlSession.selectList(namespace + ".selectAllCompanyNames");
	}

	public Company findCompanyByName(String companyName) {
		return (Company)sqlSession.selectOne(namespace + ".selectCompanyByName", companyName);
	}
	
	public Company findCompanyWithArtists(String companyName) {
		return (Company)sqlSession.selectOne(namespace + ".selectCompanyWithArtists", companyName);
	}
}
