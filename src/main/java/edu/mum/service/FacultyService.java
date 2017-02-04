package edu.mum.service;

import java.util.List;

import edu.mum.entity.Block;
import edu.mum.entity.Faculty;

public interface FacultyService {
	public Boolean updateFaculty(Faculty faculty);

	public Faculty getFacultyById(String id);

	List<Faculty> findFaculty();

}
