/**
 * DoMyBillingItemResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.data.repositories.allegroApiClient;

public class DoMyBillingItemResponse  implements java.io.Serializable {
    private ItemBilling[] entryFees;

    private ItemBilling[] endingFees;

    public DoMyBillingItemResponse() {
    }

    public DoMyBillingItemResponse(
           ItemBilling[] entryFees,
           ItemBilling[] endingFees) {
           this.entryFees = entryFees;
           this.endingFees = endingFees;
    }


    /**
     * Gets the entryFees value for this DoMyBillingItemResponse.
     * 
     * @return entryFees
     */
    public ItemBilling[] getEntryFees() {
        return entryFees;
    }


    /**
     * Sets the entryFees value for this DoMyBillingItemResponse.
     * 
     * @param entryFees
     */
    public void setEntryFees(ItemBilling[] entryFees) {
        this.entryFees = entryFees;
    }


    /**
     * Gets the endingFees value for this DoMyBillingItemResponse.
     * 
     * @return endingFees
     */
    public ItemBilling[] getEndingFees() {
        return endingFees;
    }


    /**
     * Sets the endingFees value for this DoMyBillingItemResponse.
     * 
     * @param endingFees
     */
    public void setEndingFees(ItemBilling[] endingFees) {
        this.endingFees = endingFees;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoMyBillingItemResponse)) return false;
        DoMyBillingItemResponse other = (DoMyBillingItemResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entryFees==null && other.getEntryFees()==null) || 
             (this.entryFees!=null &&
              java.util.Arrays.equals(this.entryFees, other.getEntryFees()))) &&
            ((this.endingFees==null && other.getEndingFees()==null) || 
             (this.endingFees!=null &&
              java.util.Arrays.equals(this.endingFees, other.getEndingFees())));
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
        if (getEntryFees() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntryFees());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntryFees(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEndingFees() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEndingFees());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEndingFees(), i);
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
        new org.apache.axis.description.TypeDesc(DoMyBillingItemResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyBillingItemResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryFees");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "entryFees"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemBilling"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endingFees");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "endingFees"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemBilling"));
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
