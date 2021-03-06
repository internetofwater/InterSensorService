package org.tum.gis.interSensorService.dataSourceConnection.openSensors;

import org.tum.gis.interSensorService.dataSourceConnection.DataSourceConnection;

public class OpenSensorsConnection extends DataSourceConnection {

	private String serviceName;
	private String serviceType;
	private String baseUrl;
	private String topicName;
	private String authKey;
	public OpenSensorsConnection() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OpenSensorsConnection(int id, 
								 String name, 
								 String description, 
								 String connectionType,
								 String observationProperty, 
								 String observationType, 
								 String unitOfMeasure,
								 String serviceName,
								 String serviceType,
								 String baseUrl,
								 String topicName,
								 String authKey) {
		super(id, 
			  name, 
			  description, 
			  connectionType, 
			  observationProperty, 
			  observationType, 
			  unitOfMeasure
			  );
		// TODO Auto-generated constructor stub
		this.serviceName = serviceName;
		this.serviceType = serviceType;
		this.baseUrl = baseUrl;
		this.topicName = topicName;
		this.authKey = authKey;
	}
	
	
	
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getBaseUrl() {
		return baseUrl;
	}
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getAuthKey() {
		return authKey;
	}
	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}
	
	
	
}
