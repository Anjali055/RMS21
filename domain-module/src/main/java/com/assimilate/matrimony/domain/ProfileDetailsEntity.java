package com.assimilate.matrimony.domain;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name="profile_details ")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createAt"},allowGetters = true)

public class ProfileDetailsEntity {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer profile_details_id;
	
	@Column()
	private String create_profile_by;
	
	@Column()
	private String brides_name;
	
	@Column()
	private String birthdate;
	
	@Column()
	private String height;

	
	@Column(nullable = false,updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date created_At;
	
	@Column()
	private String created_By;
	
	@Column(nullable = false,updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date Updated_At;
	

	@Column()
	private String Updated_By;
	
	@OneToOne()
	@JoinColumn(name = "mothertongue_id")
	 private MothertongueEntity mothertongue;
	
	
	@OneToOne()
	@JoinColumn(name = "religion_id")
	private ReligionEntity religion;
	
	@OneToOne()
	@JoinColumn(name = "caste_id")
	private CasteEntity caste;
	
	@OneToOne()
	@JoinColumn(name = "subcaste_id")
	private SubcasteEntity subCaste;
	
	@OneToOne()
	@JoinColumn(name = "manglik_id")
	private ManglikEntity manglik;
	
	
	@OneToOne()
	@JoinColumn(name = "horoscope_id")
	private HoroscopeEntity horoscope;
	
	
	@OneToOne()
	@JoinColumn(name = "marital_status_id")
	private Marital_statusEntity marital_status;
	
	@OneToOne()
    @JoinColumn(name="user_id")
    private UserEntity user;

	public Integer getProfile_details_id() {
		return profile_details_id;
	}

	public void setProfile_details_id(Integer profile_details_id) {
		this.profile_details_id = profile_details_id;
	}

	public String getCreate_profile_by() {
		return create_profile_by;
	}

	public void setCreate_profile_by(String create_profile_by) {
		this.create_profile_by = create_profile_by;
	}

	public String getBrides_name() {
		return brides_name;
	}

	public void setBrides_name(String brides_name) {
		this.brides_name = brides_name;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public Date getCreated_At() {
		return created_At;
	}

	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}

	public String getCreated_By() {
		return created_By;
	}

	public void setCreated_By(String created_By) {
		this.created_By = created_By;
	}

	public Date getUpdated_At() {
		return Updated_At;
	}

	public void setUpdated_At(Date updated_At) {
		Updated_At = updated_At;
	}

	public String getUpdated_By() {
		return Updated_By;
	}

	public void setUpdated_By(String updated_By) {
		Updated_By = updated_By;
	}

	public MothertongueEntity getMothertongue() {
		return mothertongue;
	}

	public void setMothertongue(MothertongueEntity mothertongue) {
		this.mothertongue = mothertongue;
	}

	public ReligionEntity getReligion() {
		return religion;
	}

	public void setReligion(ReligionEntity religion) {
		this.religion = religion;
	}

	public CasteEntity getCaste() {
		return caste;
	}

	public void setCaste(CasteEntity caste) {
		this.caste = caste;
	}

	public SubcasteEntity getSubCaste() {
		return subCaste;
	}

	public void setSubCaste(SubcasteEntity subCaste) {
		this.subCaste = subCaste;
	}

	public ManglikEntity getManglik() {
		return manglik;
	}

	public void setManglik(ManglikEntity manglik) {
		this.manglik = manglik;
	}

	public HoroscopeEntity getHoroscope() {
		return horoscope;
	}

	public void setHoroscope(HoroscopeEntity horoscope) {
		this.horoscope = horoscope;
	}

	public Marital_statusEntity getMarital_status() {
		return marital_status;
	}

	public void setMarital_status(Marital_statusEntity marital_status) {
		this.marital_status = marital_status;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public ProfileDetailsEntity(Integer profile_details_id, String create_profile_by, String brides_name,
			String birthdate, String height, Date created_At, String created_By, Date updated_At, String updated_By,
			MothertongueEntity mothertongue, ReligionEntity religion, CasteEntity caste, SubcasteEntity subCaste,
			ManglikEntity manglik, HoroscopeEntity horoscope, Marital_statusEntity marital_status, UserEntity user) {
		super();
		this.profile_details_id = profile_details_id;
		this.create_profile_by = create_profile_by;
		this.brides_name = brides_name;
		this.birthdate = birthdate;
		this.height = height;
		this.created_At = created_At;
		this.created_By = created_By;
		Updated_At = updated_At;
		Updated_By = updated_By;
		this.mothertongue = mothertongue;
		this.religion = religion;
		this.caste = caste;
		this.subCaste = subCaste;
		this.manglik = manglik;
		this.horoscope = horoscope;
		this.marital_status = marital_status;
		this.user = user;
	}

	public ProfileDetailsEntity() {
		super();
	}

	@Override
	public String toString() {
		return "ProfileDetailsEntity [profile_details_id=" + profile_details_id + ", create_profile_by="
				+ create_profile_by + ", brides_name=" + brides_name + ", birthdate=" + birthdate + ", height=" + height
				+ ", created_At=" + created_At + ", created_By=" + created_By + ", Updated_At=" + Updated_At
				+ ", Updated_By=" + Updated_By + ", mothertongue=" + mothertongue + ", religion=" + religion
				+ ", caste=" + caste + ", subCaste=" + subCaste + ", manglik=" + manglik + ", horoscope=" + horoscope
				+ ", marital_status=" + marital_status + ", user=" + user + "]";
	}
	
	

	
	
			}
