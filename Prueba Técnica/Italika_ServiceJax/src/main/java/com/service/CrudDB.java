package com.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.domain.Italika;


@WebService
public class CrudDB {

	@WebMethod
	public void insert(Italika moto) {
		Connection conn = null;
		CallableStatement cs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			
			cs = conn.prepareCall("call read_proc(?, ?, ?, ?, ?, ?, ?, ?)");
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setString(2, moto.getSKU());
			cs.setString(3, moto.getFERT());
			cs.setString(4, moto.getModelo());
			cs.setString(5, moto.getTipo());
			cs.setString(6, moto.getNumSerie());
			cs.setDate(7, Date.valueOf(moto.getFecha()));
			cs.setInt(8, 2);
			cs.execute();
			
			
			
		}catch(ClassNotFoundException e) {
			System.out.println("Error de clase : " + e);
			}catch(SQLException e) {
				System.out.println("Error de sql : " + e);
			}
			finally {
				try {
					cs.close();
					conn.close();
					
				}catch(SQLException e) {
					System.out.println("Error de sql : " + e);
				}
			}
		
	}
	@WebMethod
	public boolean delete(Italika moto) {
		
		Connection conn = null;
		CallableStatement cs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			
			cs = conn.prepareCall("call read_proc(?, ?, ?, ?, ?, ?, ?, ?)");
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setString(2, moto.getSKU());
			cs.setString(3, moto.getFERT());
			cs.setString(4, moto.getModelo());
			cs.setString(5, moto.getTipo());
			cs.setString(6, moto.getNumSerie());
			cs.registerOutParameter(7, java.sql.Types.DATE);
			cs.setInt(8, 3);
			cs.execute();
			
			
			return true;
		}catch(ClassNotFoundException e) {
			System.out.println("Error de clase : " + e);
			}catch(SQLException e) {
				System.out.println("Error de sql : " + e);
			}
			finally {
				try {
					cs.close();
					conn.close();
					
				}catch(SQLException e) {
					System.out.println("Error de sql : " + e);
				}
			}
		
		return false;
	}
	@WebMethod
	public Italika read(Italika moto) {
		Connection conn = null;
		CallableStatement cs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			
			cs = conn.prepareCall("call read_proc(?, ?, ?, ?, ?, ?, ?, ?)");
			
			if (moto.getSKU() != null) {
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setString(2, moto.getSKU());
			cs.registerOutParameter(3, java.sql.Types.VARCHAR);
			cs.registerOutParameter(4, java.sql.Types.VARCHAR);
			cs.registerOutParameter(5, java.sql.Types.VARCHAR);
			cs.registerOutParameter(6, java.sql.Types.VARCHAR);
			cs.registerOutParameter(7, java.sql.Types.DATE);
			cs.setInt(8, 1);
			cs.execute();
			
			moto.setID(cs.getInt(1));

			moto.setFERT(cs.getString(3));
			moto.setModelo(cs.getString(4));
			moto.setTipo(cs.getString(5));
			moto.setNumSerie(cs.getString(6));
			moto.setFecha(String.valueOf(cs.getDate(7)));
			}
			else {
				cs.registerOutParameter(1,java.sql.Types.VARCHAR);
				cs.registerOutParameter(2, java.sql.Types.VARCHAR);
				cs.setString(4, moto.getModelo());
				cs.registerOutParameter(3, java.sql.Types.VARCHAR);
				cs.registerOutParameter(5, java.sql.Types.VARCHAR);
				cs.registerOutParameter(6, java.sql.Types.VARCHAR);
				cs.registerOutParameter(7, java.sql.Types.DATE);
				cs.setInt(8, 4);	
				cs.execute();
				moto.setID(cs.getInt(1));
				moto.setSKU(cs.getString(2));
				moto.setFERT(cs.getString(3));
				moto.setTipo(cs.getString(5));
				moto.setNumSerie(cs.getString(6));
				moto.setFecha(String.valueOf(cs.getDate(7)));
			}
			
			
			
			return moto;
		}catch(ClassNotFoundException e) {
			System.out.println("Error de clase : " + e);
			}catch(SQLException e) {
				System.out.println("Error de sql : " + e);
			}
			finally {
				try {
					cs.close();
					conn.close();
					
				}catch(SQLException e) {
					System.out.println("Error de sql : " + e);
				}
			}
		return null;
		
	}
	@WebMethod
	public boolean update(Italika moto) {
		Connection conn = null;
		CallableStatement cs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			
			cs = conn.prepareCall("call read_proc(?, ?, ?, ?, ?, ?, ?, ?)");
			cs.setInt(1,moto.getID());
			cs.setString(2, moto.getSKU());
			cs.setString(3, moto.getFERT());
			cs.setString(4, moto.getModelo());
			cs.setString(5, moto.getTipo());
			cs.setString(6, moto.getNumSerie());
			cs.setDate(7, Date.valueOf(moto.getFecha()));
			cs.setInt(8, 5);
			cs.execute();
			
			cs.close();
			conn.close();
			return true;
			
		}catch(ClassNotFoundException e) {
			System.out.println("Error de clase : " + e);
			}catch(SQLException e) {
				System.out.println("Error de sql : " + e);
			}
			finally {
				try {
					cs.close();
					conn.close();
					
				}catch(SQLException e) {
					System.out.println("Error de sql : " + e);
				}
			}
		return false;
	}
	
	
}
