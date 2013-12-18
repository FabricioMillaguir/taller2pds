/**
 * CuentaVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package domain.xsd;

public class CuentaVO  implements java.io.Serializable {
    private java.lang.Boolean habilitada;

    private java.lang.Integer id;

    private domain.xsd.ClienteVO oClienteVO;

    private domain.xsd.LoginVO oLoginVO;

    private domain.xsd.ServicioVO oServicioVO;

    public CuentaVO() {
    }

    public CuentaVO(
           java.lang.Boolean habilitada,
           java.lang.Integer id,
           domain.xsd.ClienteVO oClienteVO,
           domain.xsd.LoginVO oLoginVO,
           domain.xsd.ServicioVO oServicioVO) {
           this.habilitada = habilitada;
           this.id = id;
           this.oClienteVO = oClienteVO;
           this.oLoginVO = oLoginVO;
           this.oServicioVO = oServicioVO;
    }


    /**
     * Gets the habilitada value for this CuentaVO.
     * 
     * @return habilitada
     */
    public java.lang.Boolean getHabilitada() {
        return habilitada;
    }


    /**
     * Sets the habilitada value for this CuentaVO.
     * 
     * @param habilitada
     */
    public void setHabilitada(java.lang.Boolean habilitada) {
        this.habilitada = habilitada;
    }


    /**
     * Gets the id value for this CuentaVO.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this CuentaVO.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the oClienteVO value for this CuentaVO.
     * 
     * @return oClienteVO
     */
    public domain.xsd.ClienteVO getOClienteVO() {
        return oClienteVO;
    }


    /**
     * Sets the oClienteVO value for this CuentaVO.
     * 
     * @param oClienteVO
     */
    public void setOClienteVO(domain.xsd.ClienteVO oClienteVO) {
        this.oClienteVO = oClienteVO;
    }


    /**
     * Gets the oLoginVO value for this CuentaVO.
     * 
     * @return oLoginVO
     */
    public domain.xsd.LoginVO getOLoginVO() {
        return oLoginVO;
    }


    /**
     * Sets the oLoginVO value for this CuentaVO.
     * 
     * @param oLoginVO
     */
    public void setOLoginVO(domain.xsd.LoginVO oLoginVO) {
        this.oLoginVO = oLoginVO;
    }


    /**
     * Gets the oServicioVO value for this CuentaVO.
     * 
     * @return oServicioVO
     */
    public domain.xsd.ServicioVO getOServicioVO() {
        return oServicioVO;
    }


    /**
     * Sets the oServicioVO value for this CuentaVO.
     * 
     * @param oServicioVO
     */
    public void setOServicioVO(domain.xsd.ServicioVO oServicioVO) {
        this.oServicioVO = oServicioVO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CuentaVO)) return false;
        CuentaVO other = (CuentaVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.habilitada==null && other.getHabilitada()==null) || 
             (this.habilitada!=null &&
              this.habilitada.equals(other.getHabilitada()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.oClienteVO==null && other.getOClienteVO()==null) || 
             (this.oClienteVO!=null &&
              this.oClienteVO.equals(other.getOClienteVO()))) &&
            ((this.oLoginVO==null && other.getOLoginVO()==null) || 
             (this.oLoginVO!=null &&
              this.oLoginVO.equals(other.getOLoginVO()))) &&
            ((this.oServicioVO==null && other.getOServicioVO()==null) || 
             (this.oServicioVO!=null &&
              this.oServicioVO.equals(other.getOServicioVO())));
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
        if (getHabilitada() != null) {
            _hashCode += getHabilitada().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getOClienteVO() != null) {
            _hashCode += getOClienteVO().hashCode();
        }
        if (getOLoginVO() != null) {
            _hashCode += getOLoginVO().hashCode();
        }
        if (getOServicioVO() != null) {
            _hashCode += getOServicioVO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CuentaVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://domain/xsd", "CuentaVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("habilitada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain/xsd", "habilitada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain/xsd", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OClienteVO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain/xsd", "oClienteVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://domain/xsd", "ClienteVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OLoginVO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain/xsd", "oLoginVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://domain/xsd", "LoginVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OServicioVO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain/xsd", "oServicioVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://domain/xsd", "ServicioVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
