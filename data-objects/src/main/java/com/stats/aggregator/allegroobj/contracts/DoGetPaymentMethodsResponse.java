/**
 * DoGetPaymentMethodsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.allegroobj.contracts;

import com.stats.aggregator.allegroobj.containers.PaymentMethodStruct;

public class DoGetPaymentMethodsResponse  implements java.io.Serializable {
    private PaymentMethodStruct[] paymentMethods;

    public DoGetPaymentMethodsResponse() {
    }

    public DoGetPaymentMethodsResponse(
           PaymentMethodStruct[] paymentMethods) {
           this.paymentMethods = paymentMethods;
    }


    /**
     * Gets the paymentMethods value for this DoGetPaymentMethodsResponse.
     * 
     * @return paymentMethods
     */
    public PaymentMethodStruct[] getPaymentMethods() {
        return paymentMethods;
    }


    /**
     * Sets the paymentMethods value for this DoGetPaymentMethodsResponse.
     * 
     * @param paymentMethods
     */
    public void setPaymentMethods(PaymentMethodStruct[] paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetPaymentMethodsResponse)) return false;
        DoGetPaymentMethodsResponse other = (DoGetPaymentMethodsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentMethods==null && other.getPaymentMethods()==null) || 
             (this.paymentMethods!=null &&
              java.util.Arrays.equals(this.paymentMethods, other.getPaymentMethods())));
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
        if (getPaymentMethods() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentMethods());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentMethods(), i);
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
        new org.apache.axis.description.TypeDesc(DoGetPaymentMethodsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPaymentMethodsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethods");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "paymentMethods"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentMethodStruct"));
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
