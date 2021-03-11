package com.model;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.service.CrudDB;
import com.service.CrudDBService;
import com.service.CrudDBServiceLocator;
import com.service.Italika;

//aqui mandamos a llamar al web service en base al método requerido

public class ModelServiceImpl implements ModelService {

	@Override
	public Italika read(Italika moto) {
		//obtenemos el acceso al puerto en el que se encuentra el servicio
		CrudDBService metodos = new CrudDBServiceLocator();
		try {
			//definimos el objeto del tipo de la clase que contiene el crud
			CrudDB crud = metodos.getCrudDBPort();
			System.out.println();
			moto = crud.read(moto);
			return moto;
		}catch(ServiceException e) {
			
			e.printStackTrace();
		}catch (RemoteException e) {
			
			e.printStackTrace();
		
		}
		
		
		return null;
	}

	@Override
	public void insert(Italika moto) {
		CrudDBService metodos = new CrudDBServiceLocator();
		
		try {
			//definimos el objeto del tipo de la clase que contiene el crud
			CrudDB crud = metodos.getCrudDBPort();

			crud.insert(moto);
		}catch(ServiceException e) {
			
			e.printStackTrace();
		}catch (RemoteException e) {
			
			e.printStackTrace();
		
		}

	}

	@Override
	public boolean delete(Italika moto) {
		CrudDBService metodos = new CrudDBServiceLocator();
		
		try {
			
			
			//definimos el objeto del tipo de la clase que contiene el crud
			CrudDB crud = metodos.getCrudDBPort();
			
			
			return crud.delete(moto);
		}catch(ServiceException e) {
			
			e.printStackTrace();
		}catch (RemoteException e) {
			
			e.printStackTrace();
		
		}
		return false;
	}

	@Override
	public boolean update(Italika moto) {
	
CrudDBService metodos = new CrudDBServiceLocator();
		
		try {
			
			
			//definimos el objeto del tipo de la clase que contiene el crud
			CrudDB crud = metodos.getCrudDBPort();
			
			
			return crud.update(moto);
		}catch(ServiceException e) {
			
			e.printStackTrace();
		}catch (RemoteException e) {
			
			e.printStackTrace();
		
		}
		
		return true;
	}
}
