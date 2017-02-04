package edu.mum.entity;

import java.beans.Transient;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "block")
public class Block {
	
	@Id
	private int blockId;
	private String blockName;
//	@Transient
//	private boolean isSelected;

	public int getBlockId() {
		return blockId;
	}

	public void setBlockId(int blockId) {
		this.blockId = blockId;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}
}
