
package com.diligesoft.utils.camel.stats;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for routeStatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="routeStatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processorStats" type="{}processorStatsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="exchangesInflight" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="selfProcessingTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="oldestInflightExchangeId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="oldestInflightDuration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="exchangesCompleted" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="exchangesFailed" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="failuresHandled" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="redeliveries" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="externalRedeliveries" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="minProcessingTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxProcessingTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="totalProcessingTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastProcessingTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="deltaProcessingTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="meanProcessingTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="startTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="resetTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="firstExchangeCompletedTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="firstExchangeCompletedExchangeId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="firstExchangeFailureTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="firstExchangeFailureExchangeId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastExchangeCompletedTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastExchangeCompletedExchangeId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastExchangeFailureTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastExchangeFailureExchangeId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routeStatType", propOrder = {
    "processorStats"
})
@XmlRootElement(name = "routeStat")
public class RouteStatType {

    @XmlElement(required = true)
    protected ProcessorStatsType processorStats;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "state")
    protected String state;
    @XmlAttribute(name = "exchangesInflight")
    protected String exchangesInflight;
    @XmlAttribute(name = "selfProcessingTime")
    protected String selfProcessingTime;
    @XmlAttribute(name = "oldestInflightExchangeId")
    protected String oldestInflightExchangeId;
    @XmlAttribute(name = "oldestInflightDuration")
    protected String oldestInflightDuration;
    @XmlAttribute(name = "exchangesCompleted")
    protected String exchangesCompleted;
    @XmlAttribute(name = "exchangesFailed")
    protected String exchangesFailed;
    @XmlAttribute(name = "failuresHandled")
    protected String failuresHandled;
    @XmlAttribute(name = "redeliveries")
    protected String redeliveries;
    @XmlAttribute(name = "externalRedeliveries")
    protected String externalRedeliveries;
    @XmlAttribute(name = "minProcessingTime")
    protected String minProcessingTime;
    @XmlAttribute(name = "maxProcessingTime")
    protected String maxProcessingTime;
    @XmlAttribute(name = "totalProcessingTime")
    protected String totalProcessingTime;
    @XmlAttribute(name = "lastProcessingTime")
    protected String lastProcessingTime;
    @XmlAttribute(name = "deltaProcessingTime")
    protected String deltaProcessingTime;
    @XmlAttribute(name = "meanProcessingTime")
    protected String meanProcessingTime;
    @XmlAttribute(name = "startTimestamp")
    protected String startTimestamp;
    @XmlAttribute(name = "resetTimestamp")
    protected String resetTimestamp;
    @XmlAttribute(name = "firstExchangeCompletedTimestamp")
    protected String firstExchangeCompletedTimestamp;
    @XmlAttribute(name = "firstExchangeCompletedExchangeId")
    protected String firstExchangeCompletedExchangeId;
    @XmlAttribute(name = "firstExchangeFailureTimestamp")
    protected String firstExchangeFailureTimestamp;
    @XmlAttribute(name = "firstExchangeFailureExchangeId")
    protected String firstExchangeFailureExchangeId;
    @XmlAttribute(name = "lastExchangeCompletedTimestamp")
    protected String lastExchangeCompletedTimestamp;
    @XmlAttribute(name = "lastExchangeCompletedExchangeId")
    protected String lastExchangeCompletedExchangeId;
    @XmlAttribute(name = "lastExchangeFailureTimestamp")
    protected String lastExchangeFailureTimestamp;
    @XmlAttribute(name = "lastExchangeFailureExchangeId")
    protected String lastExchangeFailureExchangeId;

    /**
     * Gets the value of the processorStats property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessorStatsType }
     *     
     */
    public ProcessorStatsType getProcessorStats() {
        return processorStats;
    }

    /**
     * Sets the value of the processorStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessorStatsType }
     *     
     */
    public void setProcessorStats(ProcessorStatsType value) {
        this.processorStats = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the exchangesInflight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangesInflight() {
        return exchangesInflight;
    }

    /**
     * Sets the value of the exchangesInflight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangesInflight(String value) {
        this.exchangesInflight = value;
    }

    /**
     * Gets the value of the selfProcessingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfProcessingTime() {
        return selfProcessingTime;
    }

    /**
     * Sets the value of the selfProcessingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfProcessingTime(String value) {
        this.selfProcessingTime = value;
    }

    /**
     * Gets the value of the oldestInflightExchangeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldestInflightExchangeId() {
        return oldestInflightExchangeId;
    }

    /**
     * Sets the value of the oldestInflightExchangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldestInflightExchangeId(String value) {
        this.oldestInflightExchangeId = value;
    }

    /**
     * Gets the value of the oldestInflightDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldestInflightDuration() {
        return oldestInflightDuration;
    }

    /**
     * Sets the value of the oldestInflightDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldestInflightDuration(String value) {
        this.oldestInflightDuration = value;
    }

    /**
     * Gets the value of the exchangesCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangesCompleted() {
        return exchangesCompleted;
    }

    /**
     * Sets the value of the exchangesCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangesCompleted(String value) {
        this.exchangesCompleted = value;
    }

    /**
     * Gets the value of the exchangesFailed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangesFailed() {
        return exchangesFailed;
    }

    /**
     * Sets the value of the exchangesFailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangesFailed(String value) {
        this.exchangesFailed = value;
    }

    /**
     * Gets the value of the failuresHandled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailuresHandled() {
        return failuresHandled;
    }

    /**
     * Sets the value of the failuresHandled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailuresHandled(String value) {
        this.failuresHandled = value;
    }

    /**
     * Gets the value of the redeliveries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedeliveries() {
        return redeliveries;
    }

    /**
     * Sets the value of the redeliveries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedeliveries(String value) {
        this.redeliveries = value;
    }

    /**
     * Gets the value of the externalRedeliveries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRedeliveries() {
        return externalRedeliveries;
    }

    /**
     * Sets the value of the externalRedeliveries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRedeliveries(String value) {
        this.externalRedeliveries = value;
    }

    /**
     * Gets the value of the minProcessingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinProcessingTime() {
        return minProcessingTime;
    }

    /**
     * Sets the value of the minProcessingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinProcessingTime(String value) {
        this.minProcessingTime = value;
    }

    /**
     * Gets the value of the maxProcessingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxProcessingTime() {
        return maxProcessingTime;
    }

    /**
     * Sets the value of the maxProcessingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxProcessingTime(String value) {
        this.maxProcessingTime = value;
    }

    /**
     * Gets the value of the totalProcessingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalProcessingTime() {
        return totalProcessingTime;
    }

    /**
     * Sets the value of the totalProcessingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalProcessingTime(String value) {
        this.totalProcessingTime = value;
    }

    /**
     * Gets the value of the lastProcessingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastProcessingTime() {
        return lastProcessingTime;
    }

    /**
     * Sets the value of the lastProcessingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastProcessingTime(String value) {
        this.lastProcessingTime = value;
    }

    /**
     * Gets the value of the deltaProcessingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeltaProcessingTime() {
        return deltaProcessingTime;
    }

    /**
     * Sets the value of the deltaProcessingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeltaProcessingTime(String value) {
        this.deltaProcessingTime = value;
    }

    /**
     * Gets the value of the meanProcessingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeanProcessingTime() {
        return meanProcessingTime;
    }

    /**
     * Sets the value of the meanProcessingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeanProcessingTime(String value) {
        this.meanProcessingTime = value;
    }

    /**
     * Gets the value of the startTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * Sets the value of the startTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTimestamp(String value) {
        this.startTimestamp = value;
    }

    /**
     * Gets the value of the resetTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResetTimestamp() {
        return resetTimestamp;
    }

    /**
     * Sets the value of the resetTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResetTimestamp(String value) {
        this.resetTimestamp = value;
    }

    /**
     * Gets the value of the firstExchangeCompletedTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstExchangeCompletedTimestamp() {
        return firstExchangeCompletedTimestamp;
    }

    /**
     * Sets the value of the firstExchangeCompletedTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstExchangeCompletedTimestamp(String value) {
        this.firstExchangeCompletedTimestamp = value;
    }

    /**
     * Gets the value of the firstExchangeCompletedExchangeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstExchangeCompletedExchangeId() {
        return firstExchangeCompletedExchangeId;
    }

    /**
     * Sets the value of the firstExchangeCompletedExchangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstExchangeCompletedExchangeId(String value) {
        this.firstExchangeCompletedExchangeId = value;
    }

    /**
     * Gets the value of the firstExchangeFailureTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstExchangeFailureTimestamp() {
        return firstExchangeFailureTimestamp;
    }

    /**
     * Sets the value of the firstExchangeFailureTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstExchangeFailureTimestamp(String value) {
        this.firstExchangeFailureTimestamp = value;
    }

    /**
     * Gets the value of the firstExchangeFailureExchangeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstExchangeFailureExchangeId() {
        return firstExchangeFailureExchangeId;
    }

    /**
     * Sets the value of the firstExchangeFailureExchangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstExchangeFailureExchangeId(String value) {
        this.firstExchangeFailureExchangeId = value;
    }

    /**
     * Gets the value of the lastExchangeCompletedTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastExchangeCompletedTimestamp() {
        return lastExchangeCompletedTimestamp;
    }

    /**
     * Sets the value of the lastExchangeCompletedTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastExchangeCompletedTimestamp(String value) {
        this.lastExchangeCompletedTimestamp = value;
    }

    /**
     * Gets the value of the lastExchangeCompletedExchangeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastExchangeCompletedExchangeId() {
        return lastExchangeCompletedExchangeId;
    }

    /**
     * Sets the value of the lastExchangeCompletedExchangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastExchangeCompletedExchangeId(String value) {
        this.lastExchangeCompletedExchangeId = value;
    }

    /**
     * Gets the value of the lastExchangeFailureTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastExchangeFailureTimestamp() {
        return lastExchangeFailureTimestamp;
    }

    /**
     * Sets the value of the lastExchangeFailureTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastExchangeFailureTimestamp(String value) {
        this.lastExchangeFailureTimestamp = value;
    }

    /**
     * Gets the value of the lastExchangeFailureExchangeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastExchangeFailureExchangeId() {
        return lastExchangeFailureExchangeId;
    }

    /**
     * Sets the value of the lastExchangeFailureExchangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastExchangeFailureExchangeId(String value) {
        this.lastExchangeFailureExchangeId = value;
    }

}
