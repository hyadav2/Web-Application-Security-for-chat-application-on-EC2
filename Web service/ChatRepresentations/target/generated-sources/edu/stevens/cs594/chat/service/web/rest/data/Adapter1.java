//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.06 at 05:37:59 PM EDT 
//


package edu.stevens.cs594.chat.service.web.rest.data;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (edu.stevens.cs594.chat.service.representations.DateAdapter.parseDate(value));
    }

    public String marshal(Date value) {
        return (edu.stevens.cs594.chat.service.representations.DateAdapter.printDate(value));
    }

}
