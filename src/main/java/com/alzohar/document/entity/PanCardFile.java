package com.alzohar.document.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pancard_service")
public class PanCardFile {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;
	@Column(name = "pan_name")
	private String panName;

	@Column(name = "date_of_birth")
	private String dateOfBirth;

	@Column(name = "pan_card_no")
	private String panCardNo;

	@Column(name = "address")
	private String address;

	@Column(name = "city")
	@Lob
	private String city;

	@Lob
	private byte[] photo;

}
