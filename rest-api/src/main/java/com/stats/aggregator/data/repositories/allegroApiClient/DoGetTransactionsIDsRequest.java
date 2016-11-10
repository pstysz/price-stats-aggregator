/**
 * DoGetTransactionsIDsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.data.repositories.allegroApiClient;

public class DoGetTransactionsIDsRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private long[] itemsIdArray;

    private java.lang.String userRole;

    private long[] shipmentIdArray;

    public DoGetTransactionsIDsRequest() {
    }

    public DoGetTransactionsIDsRequest(
           java.lang.String sessionHandle,
           long[] itemsIdArray,
           java.lang.String userRole,
           long[] shipmentIdArray) {
           this.sessionHandle = sessionHandle;
           this.itemsIdArray = itemsIdArray;
           this.userRole = userRole;
           this.shipmentIdArray = shipmentIdArray;
    }


    /**
     * Gets the sessionHandle value for this DoGetTransactionsIDsRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoGetTransactionsIDsRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the itemsIdArray value for this DoGetTransactionsIDsRequest.
     * 
     * @return itemsIdArray
     */
    public long[] getItemsIdArray() {
        return itemsIdArray;
    }


    /**
     * Sets the itemsIdArray value for this DoGetTransactionsIDsRequest.
     * 
     * @param itemsIdArray
     */
    public void setItemsIdArray(long[] itemsIdArray) {
        this.itemsIdArray = itemsIdArray;
    }


    /**
     * Gets the userRole value for this DoGetTransactionsIDsRequest.
     * 
     * @return userRole
     */
    public java.lang.String getUserRole() {
        return userRole;
    }


    /**
     * Sets the userRole value for this DoGetTransactionsIDsRequest.
     * 
     * @param userRole
     */
    public void setUserRole(java.lang.String userRole) {
        this.userRole = userRole;
    }


    /**
     * Gets the shipmentIdArray value for this DoGetTransactionsIDsRequest.
     * 
     * @return shipmentIdArray
     */
    public long[] getShipmentIdArray() {
        return shipmentIdArray;
    }


    /**
     * Sets the shipmentIdArray value for this DoGetTransactionsIDsRequest.
     * 
     * @param shipmentIdArray
     */
    public void setShipmentIdArray(long[] shipmentIdArray) {
        this.shipmentIdArray = shipmentIdArray;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetTransactionsIDsRequest)) return false;
        DoGetTransactionsIDsRequest other = (DoGetTransactionsIDsRequest) obj;
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
            ((this.itemsIdArray==null && other.getItemsIdArray()==null) || 
             (this.itemsIdArray!=null &&
              java.util.Arrays.equals(this.itemsIdArray, other.getItemsIdArray()))) &&
            ((this.userRole==null && other.getUserRole()==null) || 
             (this.userRole!=null &&
              this.userRole.equals(other.getUserRole()))) &&
            ((this.shipmentIdArray==null && other.getShipmentIdArray()==null) || 
             (this.shipmentIdArray!=null &&
              java.util.Arrays.equals(this.shipmentIdArray, other.getShipmentIdArray())));
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
        if (getItemsIdArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemsIdArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemsIdArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserRole() != null) {
            _hashCode += getUserRole().hashCode();
        }
        if (getShipmentIdArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentIdArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipmentIdArray(), i);
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
        new org.apache.axis.description.TypeDesc(DoGetTransactionsIDsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetTransactionsIDsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsIdArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemsIdArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRole");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentIdArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "shipmentIdArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
