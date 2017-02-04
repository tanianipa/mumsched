package edu.mum.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "facultyinfo")
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int facultyId;
	private String name;
	private String designation;
	private String email;
	private String phone;
	private String description;
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "BLOCK_PREFERENCE", joinColumns = {
			@JoinColumn(name = "FACULTYID", nullable = false, updatable = false) }, inverseJoinColumns = {
			@JoinColumn(name = "BLOCKID", nullable = false, updatable = false) })
	private List<Block> prefferedBlocks = new ArrayList<Block>();

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int id) {
		this.facultyId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Block> getPrefferedBlocks() {
		return prefferedBlocks;
	}

	public void setPrefferedBlocks(List<Block> prefferedBlocks) {
		this.prefferedBlocks = prefferedBlocks;
	}

}
