/**
 * CrudDB.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.service;

public interface CrudDB extends java.rmi.Remote {
    public boolean update(com.service.Italika arg0) throws java.rmi.RemoteException;
    public boolean delete(com.service.Italika arg0) throws java.rmi.RemoteException;
    public com.service.Italika read(com.service.Italika arg0) throws java.rmi.RemoteException;
    public void insert(com.service.Italika arg0) throws java.rmi.RemoteException;
}
