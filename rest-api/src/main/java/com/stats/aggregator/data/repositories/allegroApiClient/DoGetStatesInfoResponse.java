/**
 * DoGetStatesInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.data.repositories.allegroApiClient;

public class DoGetStatesInfoResponse  implements java.io.Serializable {
    private StateInfoStruct[] statesInfoArray;

    public DoGetStatesInfoResponse() {
    }

    public DoGetStatesInfoResponse(
           StateInfoStruct[] statesInfoArray) {
           this.statesInfoArray = statesInfoArray;
    }


    /**
     * Gets the statesInfoArray value for this DoGetStatesInfoResponse.
     * 
     * @return statesInfoArray
     */
    public StateInfoStruct[] getStatesInfoArray() {
        return statesInfoArray;
    }


    /**
     * Sets the statesInfoArray value for this DoGetStatesInfoResponse.
     * 
     * @param statesInfoArray
     */
    public void setStatesInfoArray(StateInfoStruct[] statesInfoArray) {
        this.statesInfoArray = statesInfoArray;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetStatesInfoResponse)) return false;
        DoGetStatesInfoResponse other = (DoGetStatesInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statesInfoArray==null && other.getStatesInfoArray()==null) || 
             (this.statesInfoArray!=null &&
              java.util.Arrays.equals(this.statesInfoArray, other.getStatesInfoArray())));
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
        if (getStatesInfoArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatesInfoArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatesInfoArray(), i);
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
        new org.apache.axis.description.TypeDesc(DoGetStatesInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetStatesInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statesInfoArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "statesInfoArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StateInfoStruct"));
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
