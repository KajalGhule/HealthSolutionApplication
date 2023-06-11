package com.example.demo.response;

public class MentalHealthResponse {
	private String link;
	private String linkType;
	public MentalHealthResponse() {
		// TODO Auto-generated constructor stub
	}
	public MentalHealthResponse(String link, String linkType) {
		super();
		this.link = link;
		this.linkType = linkType;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getLinkType() {
		return linkType;
	}
	public void setLinkType(String linkType) {
		this.linkType = linkType;
	}
	@Override
	public String toString() {
		return "MentalHealthResponse [link=" + link + ", linkType=" + linkType + "]";
	}
	
}

