package br.com.thidi.middleware.models;

import br.com.seniorx.models.AccessBiometry;
import br.com.seniorx.models.CardList;
import br.com.seniorx.models.PersonInfo;
import br.com.seniorx.models.PersonPhotoTemplates;

public class SeniorUserData {

	private PersonInfo personInfo;
	private CardList cardList;
	private AccessBiometry accesBiometry;
	private PersonPhotoTemplates personPhoto;

	public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

	public CardList getCardList() {
		return cardList;
	}

	public void setCardList(CardList cardList) {
		this.cardList = cardList;
	}

	public AccessBiometry getAccesBiometry() {
		return accesBiometry;
	}

	public void setAccesBiometry(AccessBiometry accesBiometry) {
		this.accesBiometry = accesBiometry;
	}

	public PersonPhotoTemplates getPersonPhoto() {
		return personPhoto;
	}

	public void setPersonPhoto(PersonPhotoTemplates personPhoto) {
		this.personPhoto = personPhoto;
	}

}
