package br.com.seniorx.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * IncludePhotoPendency
 */

public class IncludePhotoPendency extends AbstractPendency {
	

	@SerializedName("personId")
	private Long personId = null;

	@SerializedName("personName")
	private String personName = null;

	@SerializedName("photoUrl")
	private String photoUrl = null;

	@SerializedName("cardList")
	private List<CardInformation> cardList = null;

	public IncludePhotoPendency personId(Long personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * Identificador da pessoa
	 * 
	 * @return personId
	 **/
	@Schema(description  = "Identificador da pessoa")
	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public IncludePhotoPendency personName(String personName) {
		this.personName = personName;
		return this;
	}

	/**
	 * Nome da pessoa
	 * 
	 * @return personName
	 **/
	@Schema(description  = "Nome da pessoa")
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public IncludePhotoPendency photoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
		return this;
	}

	/**
	 * URL da foto
	 * 
	 * @return photoUrl
	 **/
	@Schema(description  = "URL da foto")
	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public IncludePhotoPendency cardList(List<CardInformation> cardList) {
		this.cardList = cardList;
		return this;
	}

	public IncludePhotoPendency addCardListItem(CardInformation cardListItem) {
		if (this.cardList == null) {
			this.cardList = new ArrayList<CardInformation>();
		}
		this.cardList.add(cardListItem);
		return this;
	}

	/**
	 * Get cardList
	 * 
	 * @return cardList
	 **/
	@Schema(description  = "")
	public List<CardInformation> getCardList() {
		return cardList;
	}

	public void setCardList(List<CardInformation> cardList) {
		this.cardList = cardList;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		IncludePhotoPendency includePhotoPendency = (IncludePhotoPendency) o;
		return Objects.equals(this.getPendencyId(), includePhotoPendency
				.getPendencyId()) && Objects.equals(this.getManagerDeviceId(), includePhotoPendency.getManagerDeviceId()) && Objects.equals(this.personId, includePhotoPendency.personId)
				&& Objects.equals(this.personName, includePhotoPendency.personName) && Objects.equals(this.photoUrl, includePhotoPendency.photoUrl) && Objects.equals(this.cardList, includePhotoPendency.cardList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(getPendencyId(), getManagerDeviceId(), personId, personName, photoUrl, cardList);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class IncludePhotoPendency {\n");

		sb.append("    pendencyId: ").append(toIndentedString(getPendencyId())).append("\n");
		sb.append("    managerDeviceId: ").append(toIndentedString(getManagerDeviceId())).append("\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
		sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
		sb.append("    cardList: ").append(toIndentedString(cardList)).append("\n");
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
