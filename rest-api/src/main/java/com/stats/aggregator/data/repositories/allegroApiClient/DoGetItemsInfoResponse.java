/**
 * DoGetItemsInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.data.repositories.allegroApiClient;

public class DoGetItemsInfoResponse  implements java.io.Serializable {
    private ItemInfoStruct[] arrayItemListInfo;

    private long[] arrayItemsNotFound;

    private long[] arrayItemsAdminKilled;

    public DoGetItemsInfoResponse() {
    }

    public DoGetItemsInfoResponse(
           ItemInfoStruct[] arrayItemListInfo,
           long[] arrayItemsNotFound,
           long[] arrayItemsAdminKilled) {
           this.arrayItemListInfo = arrayItemListInfo;
           this.arrayItemsNotFound = arrayItemsNotFound;
           this.arrayItemsAdminKilled = arrayItemsAdminKilled;
    }


    /**
     * Gets the arrayItemListInfo value for this DoGetItemsInfoResponse.
     * 
     * @return arrayItemListInfo
     */
    public ItemInfoStruct[] getArrayItemListInfo() {
        return arrayItemListInfo;
    }


    /**
     * Sets the arrayItemListInfo value for this DoGetItemsInfoResponse.
     * 
     * @param arrayItemListInfo
     */
    public void setArrayItemListInfo(ItemInfoStruct[] arrayItemListInfo) {
        this.arrayItemListInfo = arrayItemListInfo;
    }


    /**
     * Gets the arrayItemsNotFound value for this DoGetItemsInfoResponse.
     * 
     * @return arrayItemsNotFound
     */
    public long[] getArrayItemsNotFound() {
        return arrayItemsNotFound;
    }


    /**
     * Sets the arrayItemsNotFound value for this DoGetItemsInfoResponse.
     * 
     * @param arrayItemsNotFound
     */
    public void setArrayItemsNotFound(long[] arrayItemsNotFound) {
        this.arrayItemsNotFound = arrayItemsNotFound;
    }


    /**
     * Gets the arrayItemsAdminKilled value for this DoGetItemsInfoResponse.
     * 
     * @return arrayItemsAdminKilled
     */
    public long[] getArrayItemsAdminKilled() {
        return arrayItemsAdminKilled;
    }


    /**
     * Sets the arrayItemsAdminKilled value for this DoGetItemsInfoResponse.
     * 
     * @param arrayItemsAdminKilled
     */
    public void setArrayItemsAdminKilled(long[] arrayItemsAdminKilled) {
        this.arrayItemsAdminKilled = arrayItemsAdminKilled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetItemsInfoResponse)) return false;
        DoGetItemsInfoResponse other = (DoGetItemsInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arrayItemListInfo==null && other.getArrayItemListInfo()==null) || 
             (this.arrayItemListInfo!=null &&
              java.util.Arrays.equals(this.arrayItemListInfo, other.getArrayItemListInfo()))) &&
            ((this.arrayItemsNotFound==null && other.getArrayItemsNotFound()==null) || 
             (this.arrayItemsNotFound!=null &&
              java.util.Arrays.equals(this.arrayItemsNotFound, other.getArrayItemsNotFound()))) &&
            ((this.arrayItemsAdminKilled==null && other.getArrayItemsAdminKilled()==null) || 
             (this.arrayItemsAdminKilled!=null &&
              java.util.Arrays.equals(this.arrayItemsAdminKilled, other.getArrayItemsAdminKilled())));
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
        if (getArrayItemListInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrayItemListInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrayItemListInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArrayItemsNotFound() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrayItemsNotFound());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrayItemsNotFound(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArrayItemsAdminKilled() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrayItemsAdminKilled());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrayItemsAdminKilled(), i);
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
        new org.apache.axis.description.TypeDesc(DoGetItemsInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayItemListInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "arrayItemListInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfoStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayItemsNotFound");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "arrayItemsNotFound"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayItemsAdminKilled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "arrayItemsAdminKilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
