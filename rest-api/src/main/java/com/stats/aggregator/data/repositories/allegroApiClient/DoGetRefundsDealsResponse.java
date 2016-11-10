/**
 * DoGetRefundsDealsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.data.repositories.allegroApiClient;

public class DoGetRefundsDealsResponse  implements java.io.Serializable {
    private int dealsCount;

    private RefundsDealsListType[] dealsList;

    private FiltersListType[] filtersList;

    public DoGetRefundsDealsResponse() {
    }

    public DoGetRefundsDealsResponse(
           int dealsCount,
           RefundsDealsListType[] dealsList,
           FiltersListType[] filtersList) {
           this.dealsCount = dealsCount;
           this.dealsList = dealsList;
           this.filtersList = filtersList;
    }


    /**
     * Gets the dealsCount value for this DoGetRefundsDealsResponse.
     * 
     * @return dealsCount
     */
    public int getDealsCount() {
        return dealsCount;
    }


    /**
     * Sets the dealsCount value for this DoGetRefundsDealsResponse.
     * 
     * @param dealsCount
     */
    public void setDealsCount(int dealsCount) {
        this.dealsCount = dealsCount;
    }


    /**
     * Gets the dealsList value for this DoGetRefundsDealsResponse.
     * 
     * @return dealsList
     */
    public RefundsDealsListType[] getDealsList() {
        return dealsList;
    }


    /**
     * Sets the dealsList value for this DoGetRefundsDealsResponse.
     * 
     * @param dealsList
     */
    public void setDealsList(RefundsDealsListType[] dealsList) {
        this.dealsList = dealsList;
    }


    /**
     * Gets the filtersList value for this DoGetRefundsDealsResponse.
     * 
     * @return filtersList
     */
    public FiltersListType[] getFiltersList() {
        return filtersList;
    }


    /**
     * Sets the filtersList value for this DoGetRefundsDealsResponse.
     * 
     * @param filtersList
     */
    public void setFiltersList(FiltersListType[] filtersList) {
        this.filtersList = filtersList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetRefundsDealsResponse)) return false;
        DoGetRefundsDealsResponse other = (DoGetRefundsDealsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.dealsCount == other.getDealsCount() &&
            ((this.dealsList==null && other.getDealsList()==null) || 
             (this.dealsList!=null &&
              java.util.Arrays.equals(this.dealsList, other.getDealsList()))) &&
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
        _hashCode += getDealsCount();
        if (getDealsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDealsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDealsList(), i);
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
        new org.apache.axis.description.TypeDesc(DoGetRefundsDealsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsDealsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "dealsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealsList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "dealsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundsDealsListType"));
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
