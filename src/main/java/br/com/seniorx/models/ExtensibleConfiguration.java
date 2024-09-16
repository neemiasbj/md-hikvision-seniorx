package br.com.seniorx.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Propriedade extensíveis
 */
@ApiModel(description = "Propriedade extensíveis")

public class ExtensibleConfiguration {
	@SerializedName("id")
	private Long id = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("extensiblePropertyList")
	private List<ExtensibleProperty> extensiblePropertyList = null;

	public ExtensibleConfiguration id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ExtensibleConfiguration name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ExtensibleConfiguration extensiblePropertyList(List<ExtensibleProperty> extensiblePropertyList) {
		this.extensiblePropertyList = extensiblePropertyList;
		return this;
	}

	public ExtensibleConfiguration addExtensiblePropertyListItem(ExtensibleProperty extensiblePropertyListItem) {
		if (this.extensiblePropertyList == null) {
			this.extensiblePropertyList = new ArrayList<ExtensibleProperty>();
		}
		this.extensiblePropertyList.add(extensiblePropertyListItem);
		return this;
	}

	/**
	 * Get extensiblePropertyList
	 * 
	 * @return extensiblePropertyList
	 **/
	@ApiModelProperty(value = "")
	public List<ExtensibleProperty> getExtensiblePropertyList() {
		return extensiblePropertyList;
	}

	public void setExtensiblePropertyList(List<ExtensibleProperty> extensiblePropertyList) {
		this.extensiblePropertyList = extensiblePropertyList;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ExtensibleConfiguration extensibleConfiguration = (ExtensibleConfiguration) o;
		return Objects.equals(this.id, extensibleConfiguration.id) && Objects.equals(this.name, extensibleConfiguration.name) && Objects.equals(this.extensiblePropertyList, extensibleConfiguration.extensiblePropertyList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, extensiblePropertyList);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExtensibleConfiguration {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    extensiblePropertyList: ").append(toIndentedString(extensiblePropertyList)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public String findExtensiblePropertyByKey(String key) {
		for (ExtensibleProperty item : extensiblePropertyList) {
			if (item.getKey().equals(key)) {
				return item.getValue();
			}
		}
		return null;
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
