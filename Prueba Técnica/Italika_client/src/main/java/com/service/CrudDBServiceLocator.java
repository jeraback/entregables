/**
 * CrudDBServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.service;

public class CrudDBServiceLocator extends org.apache.axis.client.Service implements com.service.CrudDBService {

    public CrudDBServiceLocator() {
    }


    public CrudDBServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CrudDBServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CrudDBPort
    private java.lang.String CrudDBPort_address = "http://localhost:8081/Italika_ServiceJax/crud";

    public java.lang.String getCrudDBPortAddress() {
        return CrudDBPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CrudDBPortWSDDServiceName = "CrudDBPort";

    public java.lang.String getCrudDBPortWSDDServiceName() {
        return CrudDBPortWSDDServiceName;
    }

    public void setCrudDBPortWSDDServiceName(java.lang.String name) {
        CrudDBPortWSDDServiceName = name;
    }

    public com.service.CrudDB getCrudDBPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CrudDBPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCrudDBPort(endpoint);
    }

    public com.service.CrudDB getCrudDBPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.service.CrudDBPortBindingStub _stub = new com.service.CrudDBPortBindingStub(portAddress, this);
            _stub.setPortName(getCrudDBPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCrudDBPortEndpointAddress(java.lang.String address) {
        CrudDBPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.service.CrudDB.class.isAssignableFrom(serviceEndpointInterface)) {
                com.service.CrudDBPortBindingStub _stub = new com.service.CrudDBPortBindingStub(new java.net.URL(CrudDBPort_address), this);
                _stub.setPortName(getCrudDBPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CrudDBPort".equals(inputPortName)) {
            return getCrudDBPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.com/", "CrudDBService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.com/", "CrudDBPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CrudDBPort".equals(portName)) {
            setCrudDBPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
