/**
 * DoAddPackageInfoToPostBuyFormRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.allegroobj.contracts;

import com.stats.aggregator.allegroobj.containers.PackageInfoStruct;

public class DoAddPackageInfoToPostBuyFormRequest  implements java.io.Serializable {
    private java.lang.String sessionId;

    private long transactionId;

    private PackageInfoStruct[] packageInfo;

    public DoAddPackageInfoToPostBuyFormRequest() {
    }

    public DoAddPackageInfoToPostBuyFormRequest(
           java.lang.String sessionId,
           long transactionId,
           PackageInfoStruct[] packageInfo) {
           this.sessionId = sessionId;
           this.transactionId = transactionId;
           this.packageInfo = packageInfo;
    }


    /**
     * Gets the sessionId value for this DoAddPackageInfoToPostBuyFormRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this DoAddPackageInfoToPostBuyFormRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the transactionId value for this DoAddPackageInfoToPostBuyFormRequest.
     * 
     * @return transactionId
     */
    public long getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this DoAddPackageInfoToPostBuyFormRequest.
     * 
     * @param transactionId
     */
    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the packageInfo value for this DoAddPackageInfoToPostBuyFormRequest.
     * 
     * @return packageInfo
     */
    public PackageInfoStruct[] getPackageInfo() {
        return packageInfo;
    }


    /**
     * Sets the packageInfo value for this DoAddPackageInfoToPostBuyFormRequest.
     * 
     * @param packageInfo
     */
    public void setPackageInfo(PackageInfoStruct[] packageInfo) {
        this.packageInfo = packageInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoAddPackageInfoToPostBuyFormRequest)) return false;
        DoAddPackageInfoToPostBuyFormRequest other = (DoAddPackageInfoToPostBuyFormRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            this.transactionId == other.getTransactionId() &&
            ((this.packageInfo==null && other.getPackageInfo()==null) || 
             (this.packageInfo!=null &&
              java.util.Arrays.equals(this.packageInfo, other.getPackageInfo())));
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
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        _hashCode += new Long(getTransactionId()).hashCode();
        if (getPackageInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackageInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackageInfo(), i);
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
        new org.apache.axis.description.TypeDesc(DoAddPackageInfoToPostBuyFormRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddPackageInfoToPostBuyFormRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "packageInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PackageInfoStruct"));
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
