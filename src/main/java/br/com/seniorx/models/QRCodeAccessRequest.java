
package br.com.seniorx.models;

import java.time.OffsetDateTime;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * QRCodeAccessRequest
 */

public class QRCodeAccessRequest {
	@SerializedName("readerId")
	private Long readerId = null;

	@SerializedName("qrcode")
	private String qrcode = null;

	@SerializedName("requestDateTime")
	private OffsetDateTime requestDateTime = null;

	public QRCodeAccessRequest readerId(Long readerId) {
		this.readerId = readerId;
		return this;
	}

	/**
	 * Get readerId
	 * 
	 * @return readerId
	 **/
	@Schema(description = "")
	public Long getReaderId() {
		return readerId;
	}

	public void setReaderId(Long readerId) {
		this.readerId = readerId;
	}

	public QRCodeAccessRequest qrcode(String qrcode) {
		this.qrcode = qrcode;
		return this;
	}

	/**
	 * Get qrcode
	 * 
	 * @return qrcode
	 **/
	@Schema(description = "")
	public String getQrcode() {
		return qrcode;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

	public QRCodeAccessRequest requestDateTime(OffsetDateTime requestDateTime) {
		this.requestDateTime = requestDateTime;
		return this;
	}

	/**
	 * Get requestDateTime
	 * 
	 * @return requestDateTime
	 **/
	@Schema(description = "")
	public OffsetDateTime getRequestDateTime() {
		return requestDateTime;
	}

	public void setRequestDateTime(OffsetDateTime requestDateTime) {
		this.requestDateTime = requestDateTime;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		QRCodeAccessRequest qrCodeAccessRequest = (QRCodeAccessRequest) o;
		return Objects.equals(this.readerId, qrCodeAccessRequest.readerId) && Objects.equals(this.qrcode, qrCodeAccessRequest.qrcode) && Objects.equals(this.requestDateTime, qrCodeAccessRequest.requestDateTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(readerId, qrcode, requestDateTime);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class QRCodeAccessRequest {\n");

		sb.append("    readerId: ").append(toIndentedString(readerId)).append("\n");
		sb.append("    qrcode: ").append(toIndentedString(qrcode)).append("\n");
		sb.append("    requestDateTime: ").append(toIndentedString(requestDateTime)).append("\n");
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
