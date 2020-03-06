package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="language")
public class LanguageEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer language_id;
	
	@Column()
	private String language_name;

	public Integer getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(Integer language_id) {
		this.language_id = language_id;
	}

	public String getLanguage_name() {
		return language_name;
	}

	public void setLanguage_name(String language_name) {
		this.language_name = language_name;
	}

	public LanguageEntity(Integer language_id, String language_name) {
		super();
		this.language_id = language_id;
		this.language_name = language_name;
	}

	public LanguageEntity() {
		super();
	}

	@Override
	public String toString() {
		return "LanguageEntity [language_id=" + language_id + ", language_name=" + language_name + "]";
	}

	
	

}
