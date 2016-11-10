/**
 * ChangedItemStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.data.repositories.allegroApiClient;

public class ChangedItemStruct  implements java.io.Serializable {
    private long itemId;

    private FieldsValue[] itemFields;

    private ItemSurchargeStruct[] itemSurcharge;

    public ChangedItemStruct() {
    }

    public ChangedItemStruct(
           long itemId,
           FieldsValue[] itemFields,
           ItemSurchargeStruct[] itemSurcharge) {
           this.itemId = itemId;
           this.itemFields = itemFields;
           this.itemSurcharge = itemSurcharge;
    }


    /**
     * Gets the itemId value for this ChangedItemStruct.
     * 
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this ChangedItemStruct.
     * 
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the itemFields value for this ChangedItemStruct.
     * 
     * @return itemFields
     */
    public FieldsValue[] getItemFields() {
        return itemFields;
    }


    /**
     * Sets the itemFields value for this ChangedItemStruct.
     * 
     * @param itemFields
     */
    public void setItemFields(FieldsValue[] itemFields) {
        this.itemFields = itemFields;
    }


    /**
     * Gets the itemSurcharge value for this ChangedItemStruct.
     * 
     * @return itemSurcharge
     */
    public ItemSurchargeStruct[] getItemSurcharge() {
        return itemSurcharge;
    }


    /**
     * Sets the itemSurcharge value for this ChangedItemStruct.
     * 
     * @param itemSurcharge
     */
    public void setItemSurcharge(ItemSurchargeStruct[] itemSurcharge) {
        this.itemSurcharge = itemSurcharge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangedItemStruct)) return false;
        ChangedItemStruct other = (ChangedItemStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.itemId == other.getItemId() &&
            ((this.itemFields==null && other.getItemFields()==null) || 
             (this.itemFields!=null &&
              java.util.Arrays.equals(this.itemFields, other.getItemFields()))) &&
            ((this.itemSurcharge==null && other.getItemSurcharge()==null) || 
             (this.itemSurcharge!=null &&
              java.util.Arrays.equals(this.itemSurcharge, other.getItemSurcharge())));
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
        _hashCode += new Long(getItemId()).hashCode();
        if (getItemFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemSurcharge() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemSurcharge());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemSurcharge(), i);
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
        new org.apache.axis.description.TypeDesc(ChangedItemStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ChangedItemStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemFields");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FieldsValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSurcharge");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemSurcharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemSurchargeStruct"));
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
