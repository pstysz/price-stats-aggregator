/**
 * WebApiService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.repositories.allegroApiClient;

public interface WebApiService extends javax.xml.rpc.Service {
    public java.lang.String getservicePortAddress();

    public WebApiServicePort getservicePort() throws javax.xml.rpc.ServiceException;

    public WebApiServicePort getservicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
