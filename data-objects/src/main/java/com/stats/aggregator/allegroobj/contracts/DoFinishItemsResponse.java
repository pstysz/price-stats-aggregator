/**
 * DoFinishItemsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.allegroobj.contracts;

import com.stats.aggregator.allegroobj.containers.FinishFailureStruct;

public class DoFinishItemsResponse  implements java.io.Serializable {
    private long[] finishItemsSucceed;

    private FinishFailureStruct[] finishItemsFailed;

    public DoFinishItemsResponse() {
    }

    public DoFinishItemsResponse(
           long[] finishItemsSucceed,
           FinishFailureStruct[] finishItemsFailed) {
           this.finishItemsSucceed = finishItemsSucceed;
           this.finishItemsFailed = finishItemsFailed;
    }


    /**
     * Gets the finishItemsSucceed value for this DoFinishItemsResponse.
     * 
     * @return finishItemsSucceed
     */
    public long[] getFinishItemsSucceed() {
        return finishItemsSucceed;
    }


    /**
     * Sets the finishItemsSucceed value for this DoFinishItemsResponse.
     * 
     * @param finishItemsSucceed
     */
    public void setFinishItemsSucceed(long[] finishItemsSucceed) {
        this.finishItemsSucceed = finishItemsSucceed;
    }


    /**
     * Gets the finishItemsFailed value for this DoFinishItemsResponse.
     * 
     * @return finishItemsFailed
     */
    public FinishFailureStruct[] getFinishItemsFailed() {
        return finishItemsFailed;
    }


    /**
     * Sets the finishItemsFailed value for this DoFinishItemsResponse.
     * 
     * @param finishItemsFailed
     */
    public void setFinishItemsFailed(FinishFailureStruct[] finishItemsFailed) {
        this.finishItemsFailed = finishItemsFailed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoFinishItemsResponse)) return false;
        DoFinishItemsResponse other = (DoFinishItemsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.finishItemsSucceed==null && other.getFinishItemsSucceed()==null) || 
             (this.finishItemsSucceed!=null &&
              java.util.Arrays.equals(this.finishItemsSucceed, other.getFinishItemsSucceed()))) &&
            ((this.finishItemsFailed==null && other.getFinishItemsFailed()==null) || 
             (this.finishItemsFailed!=null &&
              java.util.Arrays.equals(this.finishItemsFailed, other.getFinishItemsFailed())));
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
        if (getFinishItemsSucceed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFinishItemsSucceed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinishItemsSucceed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFinishItemsFailed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFinishItemsFailed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinishItemsFailed(), i);
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
        new org.apache.axis.description.TypeDesc(DoFinishItemsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFinishItemsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finishItemsSucceed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "finishItemsSucceed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finishItemsFailed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "finishItemsFailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FinishFailureStruct"));
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
