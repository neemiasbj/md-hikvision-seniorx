package br.com.seniorx.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

public class ExcludeCardPendency {
	@SerializedName("pendencyId")
	private Long pendencyId = null;

	@SerializedName("managerDeviceId")
	private Long managerDeviceId = null;

	@SerializedName("card")
	private Long card = null;

	public ExcludeCardPendency pendencyId(Long pendencyId) {
		this.pendencyId = pendencyId;
		return this;
	}

	@Schema(description = "Identificador da pendência")
	public Long getPendencyId() {
		return this.pendencyId;
	}

	public void setPendencyId(Long pendencyId) {
		this.pendencyId = pendencyId;
	}

	public ExcludeCardPendency managerDeviceId(Long managerDeviceId) {
		this.managerDeviceId = managerDeviceId;
		return this;
	}

	@Schema(description = "Identificador do dispositivo gerenciador")
	public Long getManagerDeviceId() {
		return this.managerDeviceId;
	}

	public void setManagerDeviceId(Long managerDeviceId) {
		this.managerDeviceId = managerDeviceId;
	}

	public ExcludeCardPendency card(Long card) {
		this.card = card;
		return this;
	}

	@Schema(description = "Número do cartão")
	public Long getCard() {
		return this.card;
	}

	public void setCard(Long card) {
		this.card = card;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ExcludeCardPendency excludeCardPendency = (ExcludeCardPendency) o;
		return (Objects.equals(this.pendencyId, excludeCardPendency.pendencyId)
				&& Objects.equals(this.managerDeviceId, excludeCardPendency.managerDeviceId)
				&& Objects.equals(this.card, excludeCardPendency.card));
	}

	public int hashCode() {
		return Objects.hash(new Object[] { this.pendencyId, this.managerDeviceId, this.card });
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExcludeCardPendency {\n");

		sb.append("    pendencyId: ").append(toIndentedString(this.pendencyId)).append("\n");
		sb.append("    managerDeviceId: ").append(toIndentedString(this.managerDeviceId)).append("\n");
		sb.append("    card: ").append(toIndentedString(this.card)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
