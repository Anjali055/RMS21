package com.assimilate.matrimony.domain;

import java.util.Date;

import javax.persistence.CascadeType;
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
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="lifestyle")

@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createAt"},allowGetters = true)
public class LifeStyleEntity {
		
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer lifestyle_id;
	
	@Column()
	private String assets;
	
	@Column()
	 private String foodCook;
	
	@Column()
	private String favBook;
	
	@Column()
	private String favFood;
	
	@Column()
	private String favMusic;
	
	@Column()
	private String vacation;
	
	@Column()
	private String movies;
	
	@Column()
	private String tvShows;
	
	@Column()
	private String pets;
	
	@Column()
	private String habits;
	
	@Column(nullable = false,updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date created_At;
	
	@Column()
	private String createdBy;
	
	@Column(nullable = false,updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date Updated_At;
	
	@Column()
	private String UpdatedBy;
	
	
	
	@OneToOne
	@JoinColumn(name = "language_id" )
	private  LanguageEntity language;
	
	@OneToOne
	@JoinColumn(name = "hobbies_id" )
	private  HobbiesEntity hobbies;
	

	@OneToOne
	@JoinColumn(name = "interest_id")
	private  InterestEntity interest;
	

	@OneToOne
	@JoinColumn(name = "sports_id")
	private SportsEntity sports;
	
	@OneToOne
	@JoinColumn(name = "dress_style_id")
	private DressStyleEntity dressStyle;

	@OneToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;
	

	public LifeStyleEntity(DressStyleEntity dressStyle) {
		super();
		this.dressStyle = dressStyle;
	}


	public DressStyleEntity getDressStyle() {
		return dressStyle;
	}


	public void setDressStyle(DressStyleEntity dressStyle) {
		this.dressStyle = dressStyle;
	}


	public Integer getLifestyle_id() {
		return lifestyle_id;
	}


	public void setLifestyle_id(Integer lifestyle_id) {
		this.lifestyle_id = lifestyle_id;
	}


	public String getAssets() {
		return assets;
	}


	public void setAssets(String assets) {
		this.assets = assets;
	}


	public String getFoodCook() {
		return foodCook;
	}


	public void setFoodCook(String foodCook) {
		this.foodCook = foodCook;
	}


	public String getFavBook() {
		return favBook;
	}


	public void setFavBook(String favBook) {
		this.favBook = favBook;
	}


	public String getFavFood() {
		return favFood;
	}


	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}


	public String getFavMusic() {
		return favMusic;
	}


	public void setFavMusic(String favMusic) {
		this.favMusic = favMusic;
	}


	public String getVacation() {
		return vacation;
	}


	public void setVacation(String vacation) {
		this.vacation = vacation;
	}


	public String getMovies() {
		return movies;
	}


	public void setMovies(String movies) {
		this.movies = movies;
	}


	public String getTvShows() {
		return tvShows;
	}


	public void setTvShows(String tvShows) {
		this.tvShows = tvShows;
	}


	public String getPets() {
		return pets;
	}


	public void setPets(String pets) {
		this.pets = pets;
	}


	public String getHabits() {
		return habits;
	}


	public void setHabits(String habits) {
		this.habits = habits;
	}


	public Date getCreated_At() {
		return created_At;
	}


	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public Date getUpdated_At() {
		return Updated_At;
	}


	public void setUpdated_At(Date updated_At) {
		Updated_At = updated_At;
	}


	public String getUpdatedBy() {
		return UpdatedBy;
	}


	public void setUpdatedBy(String updatedBy) {
		UpdatedBy = updatedBy;
	}


	public LanguageEntity getLanguage() {
		return language;
	}


	public void setLanguage(LanguageEntity language) {
		this.language = language;
	}


	public HobbiesEntity getHobbies() {
		return hobbies;
	}


	public void setHobbies(HobbiesEntity hobbies) {
		this.hobbies = hobbies;
	}


	public InterestEntity getInterest() {
		return interest;
	}


	public void setInterest(InterestEntity interest) {
		this.interest = interest;
	}


	public SportsEntity getSports() {
		return sports;
	}


	public void setSports(SportsEntity sports) {
		this.sports = sports;
	}


	public LifeStyleEntity(Integer lifestyle_id, String assets, String foodCook, String favBook, String favFood,
			String favMusic, String vacation, String movies, String tvShows, String pets, String habits,
			Date created_At, String createdBy, Date updated_At, String updatedBy, LanguageEntity language,
			HobbiesEntity hobbies, InterestEntity interest, SportsEntity sports) {
		super();
		this.lifestyle_id = lifestyle_id;
		this.assets = assets;
		this.foodCook = foodCook;
		this.favBook = favBook;
		this.favFood = favFood;
		this.favMusic = favMusic;
		this.vacation = vacation;
		this.movies = movies;
		this.tvShows = tvShows;
		this.pets = pets;
		this.habits = habits;
		this.created_At = created_At;
		this.createdBy = createdBy;
		Updated_At = updated_At;
		UpdatedBy = updatedBy;
		this.language = language;
		this.hobbies = hobbies;
		this.interest = interest;
		this.sports = sports;
	}


	public LifeStyleEntity() {
		super();
	}


	@Override
	public String toString() {
		return "LifeStyleEntity [user=" + user + "]";
	}


	public UserEntity getUser() {
		return user;
	}


	public void setUser(UserEntity user) {
		this.user = user;
	}


	public LifeStyleEntity(UserEntity user) {
		super();
		this.user = user;
	}

	


}
