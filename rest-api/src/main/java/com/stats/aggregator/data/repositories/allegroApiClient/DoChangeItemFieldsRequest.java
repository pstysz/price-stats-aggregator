/**
 * DoChangeItemFieldsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.data.repositories.allegroApiClient;

public class DoChangeItemFieldsRequest  implements java.io.Serializable {
    private java.lang.String sessionId;

    private long itemId;

    private FieldsValue[] fieldsToModify;

    private int[] fieldsToRemove;

    private java.lang.Integer previewOnly;

    private VariantStruct[] variants;

    private TagNameStruct[] tags;

    public DoChangeItemFieldsRequest() {
    }

    public DoChangeItemFieldsRequest(
           java.lang.String sessionId,
           long itemId,
           FieldsValue[] fieldsToModify,
           int[] fieldsToRemove,
           java.lang.Integer previewOnly,
           VariantStruct[] variants,
           TagNameStruct[] tags) {
           this.sessionId = sessionId;
           this.itemId = itemId;
           this.fieldsToModify = fieldsToModify;
           this.fieldsToRemove = fieldsToRemove;
           this.previewOnly = previewOnly;
           this.variants = variants;
           this.tags = tags;
    }


    /**
     * Gets the sessionId value for this DoChangeItemFieldsRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this DoChangeItemFieldsRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the itemId value for this DoChangeItemFieldsRequest.
     * 
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this DoChangeItemFieldsRequest.
     * 
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the fieldsToModify value for this DoChangeItemFieldsRequest.
     * 
     * @return fieldsToModify
     */
    public FieldsValue[] getFieldsToModify() {
        return fieldsToModify;
    }


    /**
     * Sets the fieldsToModify value for this DoChangeItemFieldsRequest.
     * 
     * @param fieldsToModify
     */
    public void setFieldsToModify(FieldsValue[] fieldsToModify) {
        this.fieldsToModify = fieldsToModify;
    }


    /**
     * Gets the fieldsToRemove value for this DoChangeItemFieldsRequest.
     * 
     * @return fieldsToRemove
     */
    public int[] getFieldsToRemove() {
        return fieldsToRemove;
    }


    /**
     * Sets the fieldsToRemove value for this DoChangeItemFieldsRequest.
     * 
     * @param fieldsToRemove
     */
    public void setFieldsToRemove(int[] fieldsToRemove) {
        this.fieldsToRemove = fieldsToRemove;
    }


    /**
     * Gets the previewOnly value for this DoChangeItemFieldsRequest.
     * 
     * @return previewOnly
     */
    public java.lang.Integer getPreviewOnly() {
        return previewOnly;
    }


    /**
     * Sets the previewOnly value for this DoChangeItemFieldsRequest.
     * 
     * @param previewOnly
     */
    public void setPreviewOnly(java.lang.Integer previewOnly) {
        this.previewOnly = previewOnly;
    }


    /**
     * Gets the variants value for this DoChangeItemFieldsRequest.
     * 
     * @return variants
     */
    public VariantStruct[] getVariants() {
        return variants;
    }


    /**
     * Sets the variants value for this DoChangeItemFieldsRequest.
     * 
     * @param variants
     */
    public void setVariants(VariantStruct[] variants) {
        this.variants = variants;
    }


    /**
     * Gets the tags value for this DoChangeItemFieldsRequest.
     * 
     * @return tags
     */
    public TagNameStruct[] getTags() {
        return tags;
    }


    /**
     * Sets the tags value for this DoChangeItemFieldsRequest.
     * 
     * @param tags
     */
    public void setTags(TagNameStruct[] tags) {
        this.tags = tags;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoChangeItemFieldsRequest)) return false;
        DoChangeItemFieldsRequest other = (DoChangeItemFieldsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            this.itemId == other.getItemId() &&
            ((this.fieldsToModify==null && other.getFieldsToModify()==null) || 
             (this.fieldsToModify!=null &&
              java.util.Arrays.equals(this.fieldsToModify, other.getFieldsToModify()))) &&
            ((this.fieldsToRemove==null && other.getFieldsToRemove()==null) || 
             (this.fieldsToRemove!=null &&
              java.util.Arrays.equals(this.fieldsToRemove, other.getFieldsToRemove()))) &&
            ((this.previewOnly==null && other.getPreviewOnly()==null) || 
             (this.previewOnly!=null &&
              this.previewOnly.equals(other.getPreviewOnly()))) &&
            ((this.variants==null && other.getVariants()==null) || 
             (this.variants!=null &&
              java.util.Arrays.equals(this.variants, other.getVariants()))) &&
            ((this.tags==null && other.getTags()==null) || 
             (this.tags!=null &&
              java.util.Arrays.equals(this.tags, other.getTags())));
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
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        _hashCode += new Long(getItemId()).hashCode();
        if (getFieldsToModify() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldsToModify());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldsToModify(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFieldsToRemove() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldsToRemove());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldsToRemove(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreviewOnly() != null) {
            _hashCode += getPreviewOnly().hashCode();
        }
        if (getVariants() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVariants());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVariants(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTags(), i);
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
        new org.apache.axis.description.TypeDesc(DoChangeItemFieldsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangeItemFieldsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldsToModify");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "fieldsToModify"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FieldsValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldsToRemove");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "fieldsToRemove"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previewOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "previewOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variants");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "variants"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "VariantStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tags");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "tags"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "TagNameStruct"));
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
