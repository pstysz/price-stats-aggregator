/**
 * ItemTemplatesStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.allegroobj.containers;

public class ItemTemplatesStruct  implements java.io.Serializable {
    private ItemTemplateListStruct[] itemTemplateList;

    private int[] itemTemplateIncorrectIds;

    public ItemTemplatesStruct() {
    }

    public ItemTemplatesStruct(
           ItemTemplateListStruct[] itemTemplateList,
           int[] itemTemplateIncorrectIds) {
           this.itemTemplateList = itemTemplateList;
           this.itemTemplateIncorrectIds = itemTemplateIncorrectIds;
    }


    /**
     * Gets the itemTemplateList value for this ItemTemplatesStruct.
     * 
     * @return itemTemplateList
     */
    public ItemTemplateListStruct[] getItemTemplateList() {
        return itemTemplateList;
    }


    /**
     * Sets the itemTemplateList value for this ItemTemplatesStruct.
     * 
     * @param itemTemplateList
     */
    public void setItemTemplateList(ItemTemplateListStruct[] itemTemplateList) {
        this.itemTemplateList = itemTemplateList;
    }


    /**
     * Gets the itemTemplateIncorrectIds value for this ItemTemplatesStruct.
     * 
     * @return itemTemplateIncorrectIds
     */
    public int[] getItemTemplateIncorrectIds() {
        return itemTemplateIncorrectIds;
    }


    /**
     * Sets the itemTemplateIncorrectIds value for this ItemTemplatesStruct.
     * 
     * @param itemTemplateIncorrectIds
     */
    public void setItemTemplateIncorrectIds(int[] itemTemplateIncorrectIds) {
        this.itemTemplateIncorrectIds = itemTemplateIncorrectIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemTemplatesStruct)) return false;
        ItemTemplatesStruct other = (ItemTemplatesStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemTemplateList==null && other.getItemTemplateList()==null) || 
             (this.itemTemplateList!=null &&
              java.util.Arrays.equals(this.itemTemplateList, other.getItemTemplateList()))) &&
            ((this.itemTemplateIncorrectIds==null && other.getItemTemplateIncorrectIds()==null) || 
             (this.itemTemplateIncorrectIds!=null &&
              java.util.Arrays.equals(this.itemTemplateIncorrectIds, other.getItemTemplateIncorrectIds())));
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
        if (getItemTemplateList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemTemplateList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemTemplateList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemTemplateIncorrectIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemTemplateIncorrectIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemTemplateIncorrectIds(), i);
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
        new org.apache.axis.description.TypeDesc(ItemTemplatesStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemTemplatesStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTemplateList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemTemplateList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemTemplateListStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTemplateIncorrectIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemTemplateIncorrectIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
