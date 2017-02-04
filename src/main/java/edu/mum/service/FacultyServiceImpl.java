package edu.mum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.FacultyDAO;
import edu.mum.entity.Faculty;

@Service
public class FacultyServiceImpl implements FacultyService {
	
	@Autowired
	private FacultyDAO facultyDAO;
	
	public void setFacultyDAO(FacultyDAO facultyDAO){
		this.facultyDAO = facultyDAO;
	}

	@Override
	@Transactional
	public Boolean updateFaculty(Faculty faculty) {
		this.facultyDAO.updateFaculty(faculty);
		return null;
	}

	@Override
	@Transactional
	public Faculty getFacultyById(String id) {
		return this.facultyDAO.getFacultyById(id);
	}

	@Override
	public List<Faculty> findFaculty() {
		// TODO Auto-generated method stub
		return null;
	}

}
