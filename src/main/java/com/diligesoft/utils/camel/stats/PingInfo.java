package com.diligesoft.utils.camel.stats;


public class PingInfo {

    private String serviceId;
    private String version;
    private String environment;
    private String hostName;

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PingInfo{");
        sb.append("serviceId='").append(serviceId).append('\'');
        sb.append(", version='").append(version).append('\'');
        sb.append(", environment='").append(environment).append('\'');
        sb.append(", hostName='").append(hostName).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
