/**
 * PostBuyFormStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.data.repositories.allegroApiClient;

public class PostBuyFormStruct  implements java.io.Serializable {
    private long transactionId;

    private long[] transactionPackageIds;

    private TransactionPayByLinkStruct transactionPayByLink;

    public PostBuyFormStruct() {
    }

    public PostBuyFormStruct(
           long transactionId,
           long[] transactionPackageIds,
           TransactionPayByLinkStruct transactionPayByLink) {
           this.transactionId = transactionId;
           this.transactionPackageIds = transactionPackageIds;
           this.transactionPayByLink = transactionPayByLink;
    }


    /**
     * Gets the transactionId value for this PostBuyFormStruct.
     * 
     * @return transactionId
     */
    public long getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this PostBuyFormStruct.
     * 
     * @param transactionId
     */
    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the transactionPackageIds value for this PostBuyFormStruct.
     * 
     * @return transactionPackageIds
     */
    public long[] getTransactionPackageIds() {
        return transactionPackageIds;
    }


    /**
     * Sets the transactionPackageIds value for this PostBuyFormStruct.
     * 
     * @param transactionPackageIds
     */
    public void setTransactionPackageIds(long[] transactionPackageIds) {
        this.transactionPackageIds = transactionPackageIds;
    }


    /**
     * Gets the transactionPayByLink value for this PostBuyFormStruct.
     * 
     * @return transactionPayByLink
     */
    public TransactionPayByLinkStruct getTransactionPayByLink() {
        return transactionPayByLink;
    }


    /**
     * Sets the transactionPayByLink value for this PostBuyFormStruct.
     * 
     * @param transactionPayByLink
     */
    public void setTransactionPayByLink(TransactionPayByLinkStruct transactionPayByLink) {
        this.transactionPayByLink = transactionPayByLink;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostBuyFormStruct)) return false;
        PostBuyFormStruct other = (PostBuyFormStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.transactionId == other.getTransactionId() &&
            ((this.transactionPackageIds==null && other.getTransactionPackageIds()==null) || 
             (this.transactionPackageIds!=null &&
              java.util.Arrays.equals(this.transactionPackageIds, other.getTransactionPackageIds()))) &&
            ((this.transactionPayByLink==null && other.getTransactionPayByLink()==null) || 
             (this.transactionPayByLink!=null &&
              this.transactionPayByLink.equals(other.getTransactionPayByLink())));
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
        _hashCode += new Long(getTransactionId()).hashCode();
        if (getTransactionPackageIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactionPackageIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransactionPackageIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionPayByLink() != null) {
            _hashCode += getTransactionPayByLink().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostBuyFormStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionPackageIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "transactionPackageIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionPayByLink");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "transactionPayByLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "TransactionPayByLinkStruct"));
        elemField.setNillable(false);
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
