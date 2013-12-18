/**
 * ServicioVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package domain.xsd;

public class ServicioVO  implements java.io.Serializable {
    private java.lang.Integer cargo_fijo;

    private java.lang.Integer id;

    private java.lang.String tipo_servicio;

    private java.lang.String unidadDeMedida;

    private java.lang.Integer valor_servicio;

    public ServicioVO() {
    }

    public ServicioVO(
           java.lang.Integer cargo_fijo,
           java.lang.Integer id,
           java.lang.String tipo_servicio,
           java.lang.String unidadDeMedida,
           java.lang.Integer valor_servicio) {
           this.cargo_fijo = cargo_fijo;
           this.id = id;
           this.tipo_servicio = tipo_servicio;
           this.unidadDeMedida = unidadDeMedida;
           this.valor_servicio = valor_servicio;
    }


    /**
     * Gets the cargo_fijo value for this ServicioVO.
     * 
     * @return cargo_fijo
     */
    public java.lang.Integer getCargo_fijo() {
        return cargo_fijo;
    }


    /**
     * Sets the cargo_fijo value for this ServicioVO.
     * 
     * @param cargo_fijo
     */
    public void setCargo_fijo(java.lang.Integer cargo_fijo) {
        this.cargo_fijo = cargo_fijo;
    }


    /**
     * Gets the id value for this ServicioVO.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this ServicioVO.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the tipo_servicio value for this ServicioVO.
     * 
     * @return tipo_servicio
     */
    public java.lang.String getTipo_servicio() {
        return tipo_servicio;
    }


    /**
     * Sets the tipo_servicio value for this ServicioVO.
     * 
     * @param tipo_servicio
     */
    public void setTipo_servicio(java.lang.String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }


    /**
     * Gets the unidadDeMedida value for this ServicioVO.
     * 
     * @return unidadDeMedida
     */
    public java.lang.String getUnidadDeMedida() {
        return unidadDeMedida;
    }


    /**
     * Sets the unidadDeMedida value for this ServicioVO.
     * 
     * @param unidadDeMedida
     */
    public void setUnidadDeMedida(java.lang.String unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }


    /**
     * Gets the valor_servicio value for this ServicioVO.
     * 
     * @return valor_servicio
     */
    public java.lang.Integer getValor_servicio() {
        return valor_servicio;
    }


    /**
     * Sets the valor_servicio value for this ServicioVO.
     * 
     * @param valor_servicio
     */
    public void setValor_servicio(java.lang.Integer valor_servicio) {
        this.valor_servicio = valor_servicio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServicioVO)) return false;
        ServicioVO other = (ServicioVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cargo_fijo==null && other.getCargo_fijo()==null) || 
             (this.cargo_fijo!=null &&
              this.cargo_fijo.equals(other.getCargo_fijo()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.tipo_servicio==null && other.getTipo_servicio()==null) || 
             (this.tipo_servicio!=null &&
              this.tipo_servicio.equals(other.getTipo_servicio()))) &&
            ((this.unidadDeMedida==null && other.getUnidadDeMedida()==null) || 
             (this.unidadDeMedida!=null &&
              this.unidadDeMedida.equals(other.getUnidadDeMedida()))) &&
            ((this.valor_servicio==null && other.getValor_servicio()==null) || 
             (this.valor_servicio!=null &&
              this.valor_servicio.equals(other.getValor_servicio())));
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
        if (getCargo_fijo() != null) {
            _hashCode += getCargo_fijo().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getTipo_servicio() != null) {
            _hashCode += getTipo_servicio().hashCode();
        }
        if (getUnidadDeMedida() != null) {
            _hashCode += getUnidadDeMedida().hashCode();
        }
        if (getValor_servicio() != null) {
            _hashCode += getValor_servicio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServicioVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://domain/xsd", "ServicioVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargo_fijo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain/xsd", "cargo_fijo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("tipo_servicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain/xsd", "tipo_servicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadDeMedida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain/xsd", "unidadDeMedida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor_servicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain/xsd", "valor_servicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
