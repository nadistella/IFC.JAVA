// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("1313c1ee-f455-43d1-99a2-89dea63a0fca")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcPlacement extends IfcGeometricRepresentationItem
{
	@JacksonXmlProperty(isAttribute=false, localName = "Location")
	@Description("The geometric position of a reference point, such as the center of a circle, of the item to be located.")
	@Required()
	@Guid("23629b11-592b-4e99-bb5e-62ab0cfc52c2")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint location;


	public IfcPlacement()
	{
	}

	public IfcPlacement(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint location)
	{
		this.location = location;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint getLocation() {
		return this.location;
	}

	public void setLocation(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint location) {
		this.location = location;
	}

	public int getDim() {
		return 0;
	}


}
