package edu.mum.dao;

import java.util.List;


import edu.mum.entity.Faculty;

public interface FacultyDAO {

	public Boolean updateFaculty(Faculty faculty);

	public Faculty getFacultyById(String id);

	List<Faculty> findFaculty();

}
