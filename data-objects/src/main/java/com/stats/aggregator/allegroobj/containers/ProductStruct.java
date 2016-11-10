/**
 * ProductStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.allegroobj.containers;

public class ProductStruct  implements java.io.Serializable {
    private long productId;

    private java.lang.String productName;

    private java.lang.String productDescription;

    private java.lang.String[] productImagesList;

    private ProductParametersGroupStruct[] productParametersGroupList;

    public ProductStruct() {
    }

    public ProductStruct(
           long productId,
           java.lang.String productName,
           java.lang.String productDescription,
           java.lang.String[] productImagesList,
           ProductParametersGroupStruct[] productParametersGroupList) {
           this.productId = productId;
           this.productName = productName;
           this.productDescription = productDescription;
           this.productImagesList = productImagesList;
           this.productParametersGroupList = productParametersGroupList;
    }


    /**
     * Gets the productId value for this ProductStruct.
     * 
     * @return productId
     */
    public long getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this ProductStruct.
     * 
     * @param productId
     */
    public void setProductId(long productId) {
        this.productId = productId;
    }


    /**
     * Gets the productName value for this ProductStruct.
     * 
     * @return productName
     */
    public java.lang.String getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this ProductStruct.
     * 
     * @param productName
     */
    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }


    /**
     * Gets the productDescription value for this ProductStruct.
     * 
     * @return productDescription
     */
    public java.lang.String getProductDescription() {
        return productDescription;
    }


    /**
     * Sets the productDescription value for this ProductStruct.
     * 
     * @param productDescription
     */
    public void setProductDescription(java.lang.String productDescription) {
        this.productDescription = productDescription;
    }


    /**
     * Gets the productImagesList value for this ProductStruct.
     * 
     * @return productImagesList
     */
    public java.lang.String[] getProductImagesList() {
        return productImagesList;
    }


    /**
     * Sets the productImagesList value for this ProductStruct.
     * 
     * @param productImagesList
     */
    public void setProductImagesList(java.lang.String[] productImagesList) {
        this.productImagesList = productImagesList;
    }


    /**
     * Gets the productParametersGroupList value for this ProductStruct.
     * 
     * @return productParametersGroupList
     */
    public ProductParametersGroupStruct[] getProductParametersGroupList() {
        return productParametersGroupList;
    }


    /**
     * Sets the productParametersGroupList value for this ProductStruct.
     * 
     * @param productParametersGroupList
     */
    public void setProductParametersGroupList(ProductParametersGroupStruct[] productParametersGroupList) {
        this.productParametersGroupList = productParametersGroupList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductStruct)) return false;
        ProductStruct other = (ProductStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.productId == other.getProductId() &&
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName()))) &&
            ((this.productDescription==null && other.getProductDescription()==null) || 
             (this.productDescription!=null &&
              this.productDescription.equals(other.getProductDescription()))) &&
            ((this.productImagesList==null && other.getProductImagesList()==null) || 
             (this.productImagesList!=null &&
              java.util.Arrays.equals(this.productImagesList, other.getProductImagesList()))) &&
            ((this.productParametersGroupList==null && other.getProductParametersGroupList()==null) || 
             (this.productParametersGroupList!=null &&
              java.util.Arrays.equals(this.productParametersGroupList, other.getProductParametersGroupList())));
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
        _hashCode += new Long(getProductId()).hashCode();
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        if (getProductDescription() != null) {
            _hashCode += getProductDescription().hashCode();
        }
        if (getProductImagesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductImagesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductImagesList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductParametersGroupList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductParametersGroupList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductParametersGroupList(), i);
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
        new org.apache.axis.description.TypeDesc(ProductStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "productId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "productName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "productDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productImagesList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "productImagesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productParametersGroupList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "productParametersGroupList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductParametersGroupStruct"));
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
