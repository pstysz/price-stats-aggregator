/**
 * DoAddToBlackListRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.allegroobj.contracts;

import com.stats.aggregator.allegroobj.containers.UserBlackListStruct;

public class DoAddToBlackListRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private UserBlackListStruct[] usersBlackListArray;

    public DoAddToBlackListRequest() {
    }

    public DoAddToBlackListRequest(
           java.lang.String sessionHandle,
           UserBlackListStruct[] usersBlackListArray) {
           this.sessionHandle = sessionHandle;
           this.usersBlackListArray = usersBlackListArray;
    }


    /**
     * Gets the sessionHandle value for this DoAddToBlackListRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoAddToBlackListRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the usersBlackListArray value for this DoAddToBlackListRequest.
     * 
     * @return usersBlackListArray
     */
    public UserBlackListStruct[] getUsersBlackListArray() {
        return usersBlackListArray;
    }


    /**
     * Sets the usersBlackListArray value for this DoAddToBlackListRequest.
     * 
     * @param usersBlackListArray
     */
    public void setUsersBlackListArray(UserBlackListStruct[] usersBlackListArray) {
        this.usersBlackListArray = usersBlackListArray;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoAddToBlackListRequest)) return false;
        DoAddToBlackListRequest other = (DoAddToBlackListRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionHandle==null && other.getSessionHandle()==null) || 
             (this.sessionHandle!=null &&
              this.sessionHandle.equals(other.getSessionHandle()))) &&
            ((this.usersBlackListArray==null && other.getUsersBlackListArray()==null) || 
             (this.usersBlackListArray!=null &&
              java.util.Arrays.equals(this.usersBlackListArray, other.getUsersBlackListArray())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSessionHandle() != null) {
            _hashCode += getSessionHandle().hashCode();
        }
        if (getUsersBlackListArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsersBlackListArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsersBlackListArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoAddToBlackListRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddToBlackListRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usersBlackListArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "usersBlackListArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserBlackListStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
