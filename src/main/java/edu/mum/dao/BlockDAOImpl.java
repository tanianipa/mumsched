package edu.mum.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.mum.entity.Block;

@Repository
public class BlockDAOImpl extends AbstractDAO<Integer,Block> implements BlockDAO{
	@Override
	public List<Block> getBlocks() {
		return findAll();
	}

}
