package com.jaxb.conecpts.main;

import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.jaxb.conecpts.InterestedPartyDetails;

public class JaxbObjectToXmlString {
	public static void main(String[] args) {
		// Java object. We will convert it to XML.
		InterestedPartyDetails interestedPartyDetails = new InterestedPartyDetails();

		// Method which uses JAXB to convert object to XML
		jaxbObjectToXML(interestedPartyDetails);
	}

	private static void jaxbObjectToXML(InterestedPartyDetails interestedPartyDetails) {
		try {
			// Create JAXB Context ( provides methods to unmarshal, marshal and validate
			// operations)
			JAXBContext jaxbContext = JAXBContext.newInstance(InterestedPartyDetails.class);

			// Create Marshaller ( provides marshal() method marshals Java object into XML)
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// For Formating
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			// For Printing XML String to Console
			StringWriter sw = new StringWriter();

			// Write XML data to StringWriter
			jaxbMarshaller.marshal(interestedPartyDetails, sw);

			// Verify the XML Content
			String xmlData = sw.toString();
			System.out.println(xmlData);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}