// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("4140e5e6-6e10-487d-80b0-738ba2b7bedb")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSweptDiskSolid extends IfcSolidModel
{
	@JacksonXmlProperty(isAttribute=false, localName = "Directrix")
	@Description("The curve used to define the sweeping operation. The solid is generated by sweeping a circular disk along the <em>Directrix</em>.")
	@Required()
	@Guid("3e93ea11-2d9f-4011-8826-4222ac737696")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve directrix;

	@JacksonXmlProperty(isAttribute=true, localName = "Radius")
	@Description("The <em>Radius</em> of the circular disk to be swept along the <em>directrix</em>. Denotes the outer radius, if an <em>InnerRadius</em> is applied.")
	@Required()
	@Guid("b6637ef9-cdaa-47f9-820d-37b6666212c5")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure radius;

	@JacksonXmlProperty(isAttribute=true, localName = "InnerRadius")
	@Description("This attribute is optional, if present it defines the radius of a circular hole in the centre of the disk.")
	@Guid("1c03cb39-4ce4-40cb-8e6d-61b748f473f6")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure innerRadius;

	@JacksonXmlProperty(isAttribute=true, localName = "StartParam")
	@Description("The parameter value on the <em>Directrix</em> at which the sweeping operation commences. <font color=\"#0000ff\">If no value is provided the start of the sweeping operation is at the start of the <em>Directrix</em>.</font>.   <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been changed to OPTIONAL with upward compatibility for file-based exchange.</blockquote>")
	@Guid("1e37f4af-9aa9-4fd7-9f75-1fa5b3af2a7b")
	private double startParam;

	@JacksonXmlProperty(isAttribute=true, localName = "EndParam")
	@Description("The parameter value on the <em>Directrix</em> at which the sweeping operation ends. <font color=\"#0000ff\">If no value is provided the end of the sweeping operation is at the end of the <em>Directrix</em>.</font>.   <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been changed to OPTIONAL with upward compatibility for file-based exchange.</blockquote>")
	@Guid("c33ba8e5-28f6-4a8b-a2a1-7020ac0ff4f1")
	private double endParam;


	public IfcSweptDiskSolid()
	{
	}

	public IfcSweptDiskSolid(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve directrix, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure radius)
	{
		this.directrix = directrix;
		this.radius = radius;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve getDirectrix() {
		return this.directrix;
	}

	public void setDirectrix(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve directrix) {
		this.directrix = directrix;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getRadius() {
		return this.radius;
	}

	public void setRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure radius) {
		this.radius = radius;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getInnerRadius() {
		return this.innerRadius;
	}

	public void setInnerRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure innerRadius) {
		this.innerRadius = innerRadius;
	}

	public double getStartParam() {
		return this.startParam;
	}

	public void setStartParam(double startParam) {
		this.startParam = startParam;
	}

	public double getEndParam() {
		return this.endParam;
	}

	public void setEndParam(double endParam) {
		this.endParam = endParam;
	}


}
