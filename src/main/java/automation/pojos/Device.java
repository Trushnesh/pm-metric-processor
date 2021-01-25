package automation.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Device {

    private String DeviceName;

	private String SwitchStatus;
    
    private String powerConsumption;
    
    private String Timestamp;

    public String getDeviceName() {
		return DeviceName;
	}

	public void setDeviceName(String deviceName) {
		DeviceName = deviceName;
	}

	public String getSwitchStatus() {
		return SwitchStatus;
	}

	public void setSwitchStatus(String switchStatus) {
		SwitchStatus = switchStatus;
	}

	public String getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(String powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public String getTimestamp() {
		return Timestamp;
	}

	public void setTimestamp(String timestamp) {
		Timestamp = timestamp;
	}

	 @Override
		public String toString() {
			return "Device [DeviceName=" + DeviceName + ", SwitchStatus=" + SwitchStatus + ", powerConsumption="
					+ powerConsumption + ", Timestamp=" + Timestamp + "]";
		}

    
}
