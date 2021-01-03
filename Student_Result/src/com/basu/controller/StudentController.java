package com.basu.controller;

import com.basu.dto.StudentDTO;
import com.basu.service.StudentService;
import com.basu.vo.StudentVO;

public class StudentController {
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}
	
	public String process(String sno, String sname, String m1, String m2, String m3) {
		StudentVO vo=new StudentVO();
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		vo.setSname(sname);
		vo.setSno(sno);
		
		StudentDTO dto = new StudentDTO();
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setSname(vo.getSname());
		
		String result=service.generateResult(dto);
		
		return result;
	}
}
