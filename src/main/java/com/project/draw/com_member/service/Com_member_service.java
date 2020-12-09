package com.project.draw.com_member.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.draw.com_member.Com_memberVO;
import com.project.draw.com_member.domain.Com_memberDAO;

@Repository
public class Com_member_service implements Com_memberDAO{

	@Autowired
	SqlSessionTemplate sql;
	
	@Override
	public void insert_com_member(Com_memberVO vo) {
		sql.insert("com_memberDAO.insert_com_member", vo);
	}

	@Override
	public void update_com_member(Com_memberVO vo) {
		sql.update("com_memberDAO.insert_com_member", vo);
		
	}

	@Override
	public void delete_com_member(Com_memberVO vo) {
		sql.delete("com_memberDAO.delete_com_member", vo);
		
	}

	@Override
	public Com_memberVO select_com_member(Com_memberVO vo) {
		return sql.selectOne("com_memberDAO.select_com_member", vo);
		
	}

	@Override
	public List<Com_memberVO> select_com_member_list(Com_memberVO vo) {
		return sql.selectList("com_memberDAO.select_com_member",vo);
		
	}

}