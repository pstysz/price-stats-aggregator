/**
 * DoGetMyIncomingPaymentsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.allegroobj.contracts;

import com.stats.aggregator.allegroobj.containers.UserIncomingPaymentStruct;

public class DoGetMyIncomingPaymentsResponse  implements java.io.Serializable {
    private UserIncomingPaymentStruct[] payTransIncome;

    public DoGetMyIncomingPaymentsResponse() {
    }

    public DoGetMyIncomingPaymentsResponse(
           UserIncomingPaymentStruct[] payTransIncome) {
           this.payTransIncome = payTransIncome;
    }


    /**
     * Gets the payTransIncome value for this DoGetMyIncomingPaymentsResponse.
     * 
     * @return payTransIncome
     */
    public UserIncomingPaymentStruct[] getPayTransIncome() {
        return payTransIncome;
    }


    /**
     * Sets the payTransIncome value for this DoGetMyIncomingPaymentsResponse.
     * 
     * @param payTransIncome
     */
    public void setPayTransIncome(UserIncomingPaymentStruct[] payTransIncome) {
        this.payTransIncome = payTransIncome;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetMyIncomingPaymentsResponse)) return false;
        DoGetMyIncomingPaymentsResponse other = (DoGetMyIncomingPaymentsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.payTransIncome==null && other.getPayTransIncome()==null) || 
             (this.payTransIncome!=null &&
              java.util.Arrays.equals(this.payTransIncome, other.getPayTransIncome())));
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
        if (getPayTransIncome() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayTransIncome());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayTransIncome(), i);
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
        new org.apache.axis.description.TypeDesc(DoGetMyIncomingPaymentsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyIncomingPaymentsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransIncome");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "payTransIncome"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserIncomingPaymentStruct"));
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
