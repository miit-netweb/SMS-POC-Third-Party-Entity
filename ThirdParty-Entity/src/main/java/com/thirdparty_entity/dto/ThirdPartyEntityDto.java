package com.thirdparty_entity.dto;

public class ThirdPartyEntityDto {

	private Long partnerNumber;
	private String subscriberNumber;
	private Long subtypeNumber;

	public ThirdPartyEntityDto(Long partnerNumber, String subscriberNumber, Long subtypeNumber) {
		super();
		this.partnerNumber = partnerNumber;
		this.subscriberNumber = subscriberNumber;
		this.subtypeNumber = subtypeNumber;
	}

	public ThirdPartyEntityDto() {
	}

	public Long getPartnerNumber() {
		return partnerNumber;
	}

	public void setPartnerNumber(Long partnerNumber) {
		this.partnerNumber = partnerNumber;
	}

	public String getSubscriberNumber() {
		return subscriberNumber;
	}

	public void setSubscriberNumber(String subscriberNumber) {
		this.subscriberNumber = subscriberNumber;
	}

	public Long getSubtypeNumber() {
		return subtypeNumber;
	}

	public void setSubtypeNumber(Long subtypeNumber) {
		this.subtypeNumber = subtypeNumber;
	}

	@Override
	public String toString() {
		return "ThirdPartyEntityDto [partnerNumber=" + partnerNumber + ", subscriberNumber=" + subscriberNumber
				+ ", subtypeNumber=" + subtypeNumber + "]";
	}

}
