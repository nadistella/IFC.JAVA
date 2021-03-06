package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class IfcContextDependentMeasure implements IfcMeasureValue {
    @DataMember(Order = 1)
    @JacksonXmlProperty(isAttribute = true, localName = "value")
    private Double value = null;

    public IfcContextDependentMeasure()
    {
    }

    public IfcContextDependentMeasure(Double value)
    {
        this.value = value;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
