
package br.com.seniorx.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AccessLevelList
 */

public class AccessLevelList {
	@SerializedName("id")
	private Long id = null;

	@SerializedName("readerAndTimezoneList")
	private List<ReaderAndTimezone> readerAndTimezoneList = null;

	public AccessLevelList id(Long id) {
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

	public AccessLevelList readerAndTimezoneList(List<ReaderAndTimezone> readerAndTimezoneList) {
		this.readerAndTimezoneList = readerAndTimezoneList;
		return this;
	}

	public AccessLevelList addReaderAndTimezoneListItem(ReaderAndTimezone readerAndTimezoneListItem) {
		if (this.readerAndTimezoneList == null) {
			this.readerAndTimezoneList = new ArrayList<ReaderAndTimezone>();
		}
		this.readerAndTimezoneList.add(readerAndTimezoneListItem);
		return this;
	}

	/**
	 * Get readerAndTimezoneList
	 * 
	 * @return readerAndTimezoneList
	 **/
	@Schema(description = "")
	public List<ReaderAndTimezone> getReaderAndTimezoneList() {
		return readerAndTimezoneList;
	}

	public void setReaderAndTimezoneList(List<ReaderAndTimezone> readerAndTimezoneList) {
		this.readerAndTimezoneList = readerAndTimezoneList;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AccessLevelList accessLevelList = (AccessLevelList) o;
		return Objects.equals(this.id, accessLevelList.id) && Objects.equals(this.readerAndTimezoneList, accessLevelList.readerAndTimezoneList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, readerAndTimezoneList);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccessLevelList {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    readerAndTimezoneList: ").append(toIndentedString(readerAndTimezoneList)).append("\n");
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
