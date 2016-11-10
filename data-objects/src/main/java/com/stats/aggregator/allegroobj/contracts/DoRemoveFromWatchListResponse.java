/**
 * DoRemoveFromWatchListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.allegroobj.contracts;

import com.stats.aggregator.allegroobj.containers.ItemRemoveWatchStruct;

public class DoRemoveFromWatchListResponse  implements java.io.Serializable {
    private ItemRemoveWatchStruct[] watchListResult;

    public DoRemoveFromWatchListResponse() {
    }

    public DoRemoveFromWatchListResponse(
           ItemRemoveWatchStruct[] watchListResult) {
           this.watchListResult = watchListResult;
    }


    /**
     * Gets the watchListResult value for this DoRemoveFromWatchListResponse.
     * 
     * @return watchListResult
     */
    public ItemRemoveWatchStruct[] getWatchListResult() {
        return watchListResult;
    }


    /**
     * Sets the watchListResult value for this DoRemoveFromWatchListResponse.
     * 
     * @param watchListResult
     */
    public void setWatchListResult(ItemRemoveWatchStruct[] watchListResult) {
        this.watchListResult = watchListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoRemoveFromWatchListResponse)) return false;
        DoRemoveFromWatchListResponse other = (DoRemoveFromWatchListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.watchListResult==null && other.getWatchListResult()==null) || 
             (this.watchListResult!=null &&
              java.util.Arrays.equals(this.watchListResult, other.getWatchListResult())));
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
        if (getWatchListResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWatchListResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWatchListResult(), i);
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
        new org.apache.axis.description.TypeDesc(DoRemoveFromWatchListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveFromWatchListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("watchListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "watchListResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemRemoveWatchStruct"));
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
