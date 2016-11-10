/**
 * DoGetMySellRatingResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.stats.aggregator.data.repositories.allegroApiClient;

public class DoGetMySellRatingResponse  implements java.io.Serializable {
    private int sellRatingTotalCount;

    private SellRatingAverageStruct[] sellRatingAverage;

    private SellRatingDetailStruct[] sellRatingDetails;

    private SellRatingAveragePerMonthStruct[] sellRatingStatsPerMonth;

    public DoGetMySellRatingResponse() {
    }

    public DoGetMySellRatingResponse(
           int sellRatingTotalCount,
           SellRatingAverageStruct[] sellRatingAverage,
           SellRatingDetailStruct[] sellRatingDetails,
           SellRatingAveragePerMonthStruct[] sellRatingStatsPerMonth) {
           this.sellRatingTotalCount = sellRatingTotalCount;
           this.sellRatingAverage = sellRatingAverage;
           this.sellRatingDetails = sellRatingDetails;
           this.sellRatingStatsPerMonth = sellRatingStatsPerMonth;
    }


    /**
     * Gets the sellRatingTotalCount value for this DoGetMySellRatingResponse.
     * 
     * @return sellRatingTotalCount
     */
    public int getSellRatingTotalCount() {
        return sellRatingTotalCount;
    }


    /**
     * Sets the sellRatingTotalCount value for this DoGetMySellRatingResponse.
     * 
     * @param sellRatingTotalCount
     */
    public void setSellRatingTotalCount(int sellRatingTotalCount) {
        this.sellRatingTotalCount = sellRatingTotalCount;
    }


    /**
     * Gets the sellRatingAverage value for this DoGetMySellRatingResponse.
     * 
     * @return sellRatingAverage
     */
    public SellRatingAverageStruct[] getSellRatingAverage() {
        return sellRatingAverage;
    }


    /**
     * Sets the sellRatingAverage value for this DoGetMySellRatingResponse.
     * 
     * @param sellRatingAverage
     */
    public void setSellRatingAverage(SellRatingAverageStruct[] sellRatingAverage) {
        this.sellRatingAverage = sellRatingAverage;
    }


    /**
     * Gets the sellRatingDetails value for this DoGetMySellRatingResponse.
     * 
     * @return sellRatingDetails
     */
    public SellRatingDetailStruct[] getSellRatingDetails() {
        return sellRatingDetails;
    }


    /**
     * Sets the sellRatingDetails value for this DoGetMySellRatingResponse.
     * 
     * @param sellRatingDetails
     */
    public void setSellRatingDetails(SellRatingDetailStruct[] sellRatingDetails) {
        this.sellRatingDetails = sellRatingDetails;
    }


    /**
     * Gets the sellRatingStatsPerMonth value for this DoGetMySellRatingResponse.
     * 
     * @return sellRatingStatsPerMonth
     */
    public SellRatingAveragePerMonthStruct[] getSellRatingStatsPerMonth() {
        return sellRatingStatsPerMonth;
    }


    /**
     * Sets the sellRatingStatsPerMonth value for this DoGetMySellRatingResponse.
     * 
     * @param sellRatingStatsPerMonth
     */
    public void setSellRatingStatsPerMonth(SellRatingAveragePerMonthStruct[] sellRatingStatsPerMonth) {
        this.sellRatingStatsPerMonth = sellRatingStatsPerMonth;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetMySellRatingResponse)) return false;
        DoGetMySellRatingResponse other = (DoGetMySellRatingResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.sellRatingTotalCount == other.getSellRatingTotalCount() &&
            ((this.sellRatingAverage==null && other.getSellRatingAverage()==null) || 
             (this.sellRatingAverage!=null &&
              java.util.Arrays.equals(this.sellRatingAverage, other.getSellRatingAverage()))) &&
            ((this.sellRatingDetails==null && other.getSellRatingDetails()==null) || 
             (this.sellRatingDetails!=null &&
              java.util.Arrays.equals(this.sellRatingDetails, other.getSellRatingDetails()))) &&
            ((this.sellRatingStatsPerMonth==null && other.getSellRatingStatsPerMonth()==null) || 
             (this.sellRatingStatsPerMonth!=null &&
              java.util.Arrays.equals(this.sellRatingStatsPerMonth, other.getSellRatingStatsPerMonth())));
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
        _hashCode += getSellRatingTotalCount();
        if (getSellRatingAverage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSellRatingAverage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSellRatingAverage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSellRatingDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSellRatingDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSellRatingDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSellRatingStatsPerMonth() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSellRatingStatsPerMonth());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSellRatingStatsPerMonth(), i);
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
        new org.apache.axis.description.TypeDesc(DoGetMySellRatingResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySellRatingResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingTotalCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellRatingTotalCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingAverage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellRatingAverage"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingAverageStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellRatingDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingDetailStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingStatsPerMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellRatingStatsPerMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingAveragePerMonthStruct"));
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
