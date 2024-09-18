
package br.com.seniorx.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PersonTemplates
 */

public class PersonTemplates {
	@SerializedName("personId")
	private Long personId = null;

	@SerializedName("cardList")
	private List<CardAndTechnology> cardList = null;

	@SerializedName("technologies")
	private List<BiometricTechnologyTemplatesList> technologies = null;

	public PersonTemplates personId(Long personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * Identificador da pessoa
	 * 
	 * @return personId
	 **/
	@Schema(description = "Identificador da pessoa")
	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public PersonTemplates cardList(List<CardAndTechnology> cardList) {
		this.cardList = cardList;
		return this;
	}

	public PersonTemplates addCardListItem(CardAndTechnology cardListItem) {
		if (this.cardList == null) {
			this.cardList = new ArrayList<CardAndTechnology>();
		}
		this.cardList.add(cardListItem);
		return this;
	}

	/**
	 * Lista de cartões
	 * 
	 * @return cardList
	 **/
	@Schema(description = "Lista de cartões")
	public List<CardAndTechnology> getCardList() {
		return cardList;
	}

	public void setCardList(List<CardAndTechnology> cardList) {
		this.cardList = cardList;
	}

	public PersonTemplates technologies(List<BiometricTechnologyTemplatesList> technologies) {
		this.technologies = technologies;
		return this;
	}

	public PersonTemplates addTechnologiesItem(BiometricTechnologyTemplatesList technologiesItem) {
		if (this.technologies == null) {
			this.technologies = new ArrayList<BiometricTechnologyTemplatesList>();
		}
		this.technologies.add(technologiesItem);
		return this;
	}

	/**
	 * Get technologies
	 * 
	 * @return technologies
	 **/
	@Schema(description = "")
	public List<BiometricTechnologyTemplatesList> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<BiometricTechnologyTemplatesList> technologies) {
		this.technologies = technologies;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonTemplates personTemplates = (PersonTemplates) o;
		return Objects.equals(this.personId, personTemplates.personId) && Objects.equals(this.cardList, personTemplates.cardList) && Objects.equals(this.technologies, personTemplates.technologies);
	}

	@Override
	public int hashCode() {
		return Objects.hash(personId, cardList, technologies);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonTemplates {\n");

		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    cardList: ").append(toIndentedString(cardList)).append("\n");
		sb.append("    technologies: ").append(toIndentedString(technologies)).append("\n");
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
