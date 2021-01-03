package com.basu.service;

import com.basu.bo.StudentBO;
import com.basu.dao.StudentDAO;
import com.basu.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private StudentDAO dao;

	public StudentServiceImpl(StudentDAO dao) {
		this.dao = dao;
	}

	@Override
	public String generateResult(StudentDTO dto) {
		int total=dto.getM1()+dto.getM2()+dto.getM3();
		float avg=(float)total/3.0f;
		String result=null;
		if(avg<35)
			result="fail";
		else
			result="pass";
		StudentBO bo= new StudentBO();
		bo.setSname(dto.getSname());
		bo.setSno(dto.getSno());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		
		int cnt=dao.insert(bo);
		if(cnt==0)
			return "Result"+ bo.getResult()+" "+bo.getSno()+" registration failed..";
		else
			return "Result"+ bo.getResult()+" "+bo.getSno()+" registration suceed..";
	}
	
	
}
