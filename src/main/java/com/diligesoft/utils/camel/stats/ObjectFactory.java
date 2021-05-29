
package com.diligesoft.utils.camel.stats;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.kaltire.mix.fsa.model.stats package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RouteStat_QNAME = new QName("", "routeStat");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.kaltire.mix.fsa.model.stats
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RouteStatType }
     * 
     */
    public RouteStatType createRouteStatType() {
        return new RouteStatType();
    }

    /**
     * Create an instance of {@link ProcessorStatsType }
     * 
     */
    public ProcessorStatsType createProcessorStatsType() {
        return new ProcessorStatsType();
    }

    /**
     * Create an instance of {@link ProcessorStatType }
     * 
     */
    public ProcessorStatType createProcessorStatType() {
        return new ProcessorStatType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "routeStat")
    public JAXBElement<RouteStatType> createRouteStat(RouteStatType value) {
        return new JAXBElement<RouteStatType>(_RouteStat_QNAME, RouteStatType.class, null, value);
    }

}
