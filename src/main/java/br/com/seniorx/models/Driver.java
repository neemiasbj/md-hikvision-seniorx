
package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Driver
 */

public class Driver {
	@SerializedName("id")
	private Long id = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("requestIntervalTime")
	private Integer requestIntervalTime = null;

	@SerializedName("waitInterval")
	private Integer waitInterval = null;

	@SerializedName("sendCardholders")
	private Boolean sendCardholders = false;

	@SerializedName("packetSize")
	private Integer packetSize = null;

	@SerializedName("extensibleConfiguration")
	private ExtensibleConfiguration extensibleConfiguration = null;

	public Driver id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@Schema(description = "")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Driver name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Descrição
	 * 
	 * @return name
	 **/
	@Schema(description = "Descrição")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Driver requestIntervalTime(Integer requestIntervalTime) {
		this.requestIntervalTime = requestIntervalTime;
		return this;
	}

	/**
	 * Intervalo de tempo entre consultas (milissegundos)
	 * 
	 * @return requestIntervalTime
	 **/
	@Schema(description = "Intervalo de tempo entre consultas (milissegundos)")
	public Integer getRequestIntervalTime() {
		return requestIntervalTime;
	}

	public void setRequestIntervalTime(Integer requestIntervalTime) {
		this.requestIntervalTime = requestIntervalTime;
	}

	public Driver waitInterval(Integer waitInterval) {
		this.waitInterval = waitInterval;
		return this;
	}

	/**
	 * Intervalo de espera (milissegundos)
	 * 
	 * @return waitInterval
	 **/
	@Schema(description = "Intervalo de espera (milissegundos)")
	public Integer getWaitInterval() {
		return waitInterval;
	}

	public void setWaitInterval(Integer waitInterval) {
		this.waitInterval = waitInterval;
	}

	public Driver sendCardholders(Boolean sendCardholders) {
		this.sendCardholders = sendCardholders;
		return this;
	}

	/**
	 * Informa se deverá enviar as credenciais para o driver. (Apenas driver Apollo)
	 * 
	 * @return sendCardholders
	 **/
	@Schema(description = "Informa se deverá enviar as credenciais para o driver. (Apenas driver Apollo)")
	public Boolean isSendCardholders() {
		return sendCardholders;
	}

	public void setSendCardholders(Boolean sendCardholders) {
		this.sendCardholders = sendCardholders;
	}

	public Driver packetSize(Integer packetSize) {
		this.packetSize = packetSize;
		return this;
	}

	/**
	 * Tamanho do pacote
	 * 
	 * @return packetSize
	 **/
	@Schema(description = "Tamanho do pacote")
	public Integer getPacketSize() {
		return packetSize;
	}

	public void setPacketSize(Integer packetSize) {
		this.packetSize = packetSize;
	}

	public Driver extensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
		this.extensibleConfiguration = extensibleConfiguration;
		return this;
	}

	/**
	 * Get extensibleConfiguration
	 * 
	 * @return extensibleConfiguration
	 **/
	@Schema(description = "")
	public ExtensibleConfiguration getExtensibleConfiguration() {
		return extensibleConfiguration;
	}

	public void setExtensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
		this.extensibleConfiguration = extensibleConfiguration;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Driver driver = (Driver) o;
		return Objects.equals(this.id, driver.id) && Objects.equals(this.name, driver.name) && Objects.equals(this.requestIntervalTime, driver.requestIntervalTime) && Objects.equals(this.waitInterval, driver.waitInterval) && Objects.equals(this.sendCardholders, driver.sendCardholders)
				&& Objects.equals(this.packetSize, driver.packetSize) && Objects.equals(this.extensibleConfiguration, driver.extensibleConfiguration);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, requestIntervalTime, waitInterval, sendCardholders, packetSize, extensibleConfiguration);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Driver {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    requestIntervalTime: ").append(toIndentedString(requestIntervalTime)).append("\n");
		sb.append("    waitInterval: ").append(toIndentedString(waitInterval)).append("\n");
		sb.append("    sendCardholders: ").append(toIndentedString(sendCardholders)).append("\n");
		sb.append("    packetSize: ").append(toIndentedString(packetSize)).append("\n");
		sb.append("    extensibleConfiguration: ").append(toIndentedString(extensibleConfiguration)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
