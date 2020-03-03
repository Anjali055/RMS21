package com.assimilate.matrimony.domain;

import static javax.persistence.TemporalType.TIMESTAMP;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

@Entity
@Table(name = "career_detail")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "created_At", "Updated_At" }, allowGetters = true)
@JsonIgnoreType
public class CareerDetail  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "careerdetail_id")
	private int careerdetail_id;

	@OneToOne()
	@JoinColumn(name = "country_id")
	private Country country;

	@OneToOne()
	@JoinColumn(name = "state_id")
	private State state;

	@OneToOne()
	@JoinColumn(name = "city_id")
	private City city;

	@OneToOne()
	@JoinColumn(name = "master_degree_id")
	private MasterDegree masterdegree;

	@OneToOne()
	@JoinColumn(name = "bacholer_Degree_id")
	private BacholerDegree bacholerDegree;

	@OneToOne()
	@JoinColumn(name = "employeement_id")
	private Employeement employeement;

	@OneToOne()
	@JoinColumn(name = "occupation_id")
	private Occupation occupation;

	@Column(name = "annual_income")
	private String annual_income;

	@Column(name = "express_yourself")
	private String express_yourself;

	@Column(name = "created_At")
	@Temporal(TIMESTAMP)
	@CreatedDate
	private Date created_At;

	@Column(name = "created_By")
	private String created_By;

	@Temporal(TIMESTAMP)
	@LastModifiedDate
	@Column(name = "Updated_At")
	private Date Updated_At;

	@Column(name = "Updated_By")
	private String Updated_By;

	@OneToOne()
	@JoinColumn(name = "user_id")
	private User user;

	public CareerDetail() {
		super();
	}

	public CareerDetail(int careerdetail_id, Country country, State state, City city, MasterDegree masterdegree,
			BacholerDegree bacholerDegree, Employeement employeement, Occupation occupation, String annual_income,
			String express_yourself, Date created_At, String created_By, Date updated_At, String updated_By,
			User user) {
		super();
		this.careerdetail_id = careerdetail_id;
		this.country = country;
		this.state = state;
		this.city = city;
		this.masterdegree = masterdegree;
		this.bacholerDegree = bacholerDegree;
		this.employeement = employeement;
		this.occupation = occupation;
		this.annual_income = annual_income;
		this.express_yourself = express_yourself;
		this.created_At = created_At;
		this.created_By = created_By;
		Updated_At = updated_At;
		Updated_By = updated_By;
		this.user = user;
	}

	public int getCareerdetail_id() {
		return careerdetail_id;
	}

	public void setCareerdetail_id(int careerdetail_id) {
		this.careerdetail_id = careerdetail_id;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public MasterDegree getMasterdegree() {
		return masterdegree;
	}

	public void setMasterdegree(MasterDegree masterdegree) {
		this.masterdegree = masterdegree;
	}

	public BacholerDegree getBacholerDegree() {
		return bacholerDegree;
	}

	public void setBacholerDegree(BacholerDegree bacholerDegree) {
		this.bacholerDegree = bacholerDegree;
	}

	public Employeement getEmployeement() {
		return employeement;
	}

	public void setEmployeement(Employeement employeement) {
		this.employeement = employeement;
	}

	public Occupation getOccupation() {
		return occupation;
	}

	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}

	public String getAnnual_income() {
		return annual_income;
	}

	public void setAnnual_income(String annual_income) {
		this.annual_income = annual_income;
	}

	public String getExpress_yourself() {
		return express_yourself;
	}

	public void setExpress_yourself(String express_yourself) {
		this.express_yourself = express_yourself;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "CareerDetail [careerdetail_id=" + careerdetail_id + ", country=" + country + ", state=" + state
				+ ", city=" + city + ", masterdegree=" + masterdegree + ", bacholerDegree=" + bacholerDegree
				+ ", employeement=" + employeement + ", occupation=" + occupation + ", annual_income=" + annual_income
				+ ", express_yourself=" + express_yourself + ", created_At=" + created_At + ", created_By=" + created_By
				+ ", Updated_At=" + Updated_At + ", Updated_By=" + Updated_By + ", user=" + user + "]";
	}

}
