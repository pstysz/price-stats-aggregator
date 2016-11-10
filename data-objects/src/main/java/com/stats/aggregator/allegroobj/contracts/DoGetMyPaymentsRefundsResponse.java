/**
 * DoGetMyPaymentsRefundsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.allegroobj.contracts;

import com.stats.aggregator.allegroobj.containers.UserPaymentRefundsStruct;

public class DoGetMyPaymentsRefundsResponse  implements java.io.Serializable {
    private UserPaymentRefundsStruct[] payTransPaymentRefunds;

    public DoGetMyPaymentsRefundsResponse() {
    }

    public DoGetMyPaymentsRefundsResponse(
           UserPaymentRefundsStruct[] payTransPaymentRefunds) {
           this.payTransPaymentRefunds = payTransPaymentRefunds;
    }


    /**
     * Gets the payTransPaymentRefunds value for this DoGetMyPaymentsRefundsResponse.
     * 
     * @return payTransPaymentRefunds
     */
    public UserPaymentRefundsStruct[] getPayTransPaymentRefunds() {
        return payTransPaymentRefunds;
    }


    /**
     * Sets the payTransPaymentRefunds value for this DoGetMyPaymentsRefundsResponse.
     * 
     * @param payTransPaymentRefunds
     */
    public void setPayTransPaymentRefunds(UserPaymentRefundsStruct[] payTransPaymentRefunds) {
        this.payTransPaymentRefunds = payTransPaymentRefunds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetMyPaymentsRefundsResponse)) return false;
        DoGetMyPaymentsRefundsResponse other = (DoGetMyPaymentsRefundsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.payTransPaymentRefunds==null && other.getPayTransPaymentRefunds()==null) || 
             (this.payTransPaymentRefunds!=null &&
              java.util.Arrays.equals(this.payTransPaymentRefunds, other.getPayTransPaymentRefunds())));
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
        if (getPayTransPaymentRefunds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayTransPaymentRefunds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayTransPaymentRefunds(), i);
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
        new org.apache.axis.description.TypeDesc(DoGetMyPaymentsRefundsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsRefundsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransPaymentRefunds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "payTransPaymentRefunds"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPaymentRefundsStruct"));
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
