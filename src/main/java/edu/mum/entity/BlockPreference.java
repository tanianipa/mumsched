package edu.mum.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "block_preference")
public class BlockPreference {
	@Id
	private int blockPreferenceId;
	private int facultyId;
	private int blockId;

	public int getBlockPreferenceId() {
		return blockPreferenceId;
	}

	public void setBlockPreferenceId(int blockPreferenceId) {
		this.blockPreferenceId = blockPreferenceId;
	}

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public int getBlockId() {
		return blockId;
	}

	public void setBlockId(int blockId) {
		this.blockId = blockId;
	}
}
