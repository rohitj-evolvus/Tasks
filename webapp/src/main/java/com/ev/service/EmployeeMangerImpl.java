package com.ev.service;

import java.util.List;
import com.ev.model.EmployeeVO;
import com.ev.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeMangerImpl implements EmployeeManager {

	@Autowired
    EmployeeDAO dao;
	public List<EmployeeVO> getAllEmployees() {
		return dao.getAllEmployees();
	}

}
