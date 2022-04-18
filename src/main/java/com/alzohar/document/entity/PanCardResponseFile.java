package com.alzohar.document.entity;

import lombok.Data;

@Data
public class PanCardResponseFile {

	private String name;
	private String url;
	private String type;
	private long size;

	public PanCardResponseFile(String name, String url, String type) {
		this.name = name;
		this.url = url;
		this.type = type;
		this.size = size;
	}
}
