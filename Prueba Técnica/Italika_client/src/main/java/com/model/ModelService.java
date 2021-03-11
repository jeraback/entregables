package com.model;

import com.service.Italika;

public interface ModelService {
	
public Italika read(Italika italika);
	
	public void insert(Italika italika);
	
	public boolean delete(Italika italika);
	
	
	public boolean update(Italika italika);

}
