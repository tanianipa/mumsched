package edu.mum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.AbstractDAO;
import edu.mum.dao.BlockDAO;

import edu.mum.entity.Block;

@Service
public class BlockServiceImpl extends AbstractDAO<Integer, Block> implements BlockService{
	@Autowired
	private BlockDAO blockDAO;
	
	@Override
	@Transactional
	public List<Block> getBlocks(){
		System.out.println("1111111111111111111&&&&&&&&&&&&&&&& in getBlocks");
		return this.blockDAO.getBlocks();
	}
}
