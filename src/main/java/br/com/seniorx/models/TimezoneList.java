
package br.com.seniorx.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * TimezoneList
 */

public class TimezoneList {
	@SerializedName("id")
	private Long id = null;

	@SerializedName("timezone")
	private List<Timezone> timezone = null;

	public TimezoneList id(Long id) {
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

	public TimezoneList timezone(List<Timezone> timezone) {
		this.timezone = timezone;
		return this;
	}

	public TimezoneList addTimezoneItem(Timezone timezoneItem) {
		if (this.timezone == null) {
			this.timezone = new ArrayList<Timezone>();
		}
		this.timezone.add(timezoneItem);
		return this;
	}

	/**
	 * Get timezone
	 * 
	 * @return timezone
	 **/
	@Schema(description = "")
	public List<Timezone> getTimezone() {
		return timezone;
	}

	public void setTimezone(List<Timezone> timezone) {
		this.timezone = timezone;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TimezoneList timezoneList = (TimezoneList) o;
		return Objects.equals(this.id, timezoneList.id) && Objects.equals(this.timezone, timezoneList.timezone);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, timezone);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TimezoneList {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
