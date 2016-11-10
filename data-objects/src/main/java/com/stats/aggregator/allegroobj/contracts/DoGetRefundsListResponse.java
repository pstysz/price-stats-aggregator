/**
 * DoGetRefundsListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.allegroobj.contracts;

import com.stats.aggregator.allegroobj.containers.FiltersListType;
import com.stats.aggregator.allegroobj.containers.RefundListType;

public class DoGetRefundsListResponse  implements java.io.Serializable {
    private int refundsCount;

    private RefundListType[] refundsList;

    private FiltersListType[] filtersList;

    public DoGetRefundsListResponse() {
    }

    public DoGetRefundsListResponse(
           int refundsCount,
           RefundListType[] refundsList,
           FiltersListType[] filtersList) {
           this.refundsCount = refundsCount;
           this.refundsList = refundsList;
           this.filtersList = filtersList;
    }


    /**
     * Gets the refundsCount value for this DoGetRefundsListResponse.
     * 
     * @return refundsCount
     */
    public int getRefundsCount() {
        return refundsCount;
    }


    /**
     * Sets the refundsCount value for this DoGetRefundsListResponse.
     * 
     * @param refundsCount
     */
    public void setRefundsCount(int refundsCount) {
        this.refundsCount = refundsCount;
    }


    /**
     * Gets the refundsList value for this DoGetRefundsListResponse.
     * 
     * @return refundsList
     */
    public RefundListType[] getRefundsList() {
        return refundsList;
    }


    /**
     * Sets the refundsList value for this DoGetRefundsListResponse.
     * 
     * @param refundsList
     */
    public void setRefundsList(RefundListType[] refundsList) {
        this.refundsList = refundsList;
    }


    /**
     * Gets the filtersList value for this DoGetRefundsListResponse.
     * 
     * @return filtersList
     */
    public FiltersListType[] getFiltersList() {
        return filtersList;
    }


    /**
     * Sets the filtersList value for this DoGetRefundsListResponse.
     * 
     * @param filtersList
     */
    public void setFiltersList(FiltersListType[] filtersList) {
        this.filtersList = filtersList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetRefundsListResponse)) return false;
        DoGetRefundsListResponse other = (DoGetRefundsListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.refundsCount == other.getRefundsCount() &&
            ((this.refundsList==null && other.getRefundsList()==null) || 
             (this.refundsList!=null &&
              java.util.Arrays.equals(this.refundsList, other.getRefundsList()))) &&
            ((this.filtersList==null && other.getFiltersList()==null) || 
             (this.filtersList!=null &&
              java.util.Arrays.equals(this.filtersList, other.getFiltersList())));
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
        _hashCode += getRefundsCount();
        if (getRefundsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRefundsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRefundsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFiltersList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFiltersList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFiltersList(), i);
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
        new org.apache.axis.description.TypeDesc(DoGetRefundsListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "refundsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundsList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "refundsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filtersList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "filtersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FiltersListType"));
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
