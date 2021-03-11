package com.service;

public class CrudDBProxy implements com.service.CrudDB {
  private String _endpoint = null;
  private com.service.CrudDB crudDB = null;
  
  public CrudDBProxy() {
    _initCrudDBProxy();
  }
  
  public CrudDBProxy(String endpoint) {
    _endpoint = endpoint;
    _initCrudDBProxy();
  }
  
  private void _initCrudDBProxy() {
    try {
      crudDB = (new com.service.CrudDBServiceLocator()).getCrudDBPort();
      if (crudDB != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)crudDB)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)crudDB)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (crudDB != null)
      ((javax.xml.rpc.Stub)crudDB)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.service.CrudDB getCrudDB() {
    if (crudDB == null)
      _initCrudDBProxy();
    return crudDB;
  }
  
  public boolean update(com.service.Italika arg0) throws java.rmi.RemoteException{
    if (crudDB == null)
      _initCrudDBProxy();
    return crudDB.update(arg0);
  }
  
  public boolean delete(com.service.Italika arg0) throws java.rmi.RemoteException{
    if (crudDB == null)
      _initCrudDBProxy();
    return crudDB.delete(arg0);
  }
  
  public com.service.Italika read(com.service.Italika arg0) throws java.rmi.RemoteException{
    if (crudDB == null)
      _initCrudDBProxy();
    return crudDB.read(arg0);
  }
  
  public void insert(com.service.Italika arg0) throws java.rmi.RemoteException{
    if (crudDB == null)
      _initCrudDBProxy();
    crudDB.insert(arg0);
  }
  
  
}