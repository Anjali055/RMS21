package com.assimilate.matrimony.common;

public class MatrimonyConstants {

	public final static String API= "/api/user";
	
	public final static String POST_USER_DETAILS="/create";
	public final static String GET_ALL_USER="/getalluser";
	
	
	public final static String POST_PROFILE_DETAILS="/profiledetails/create_profile_details";
	public final static String UPDATE_PROFILE_DETAILS = "/profileDetails/updateProfileDetails/{user_id}/{profile_details_id}";
	public final static String DELETE_PROFILE_DETAILS="/profiledetails/{profile_details_id}";
	public final static String PROFILE_DETAILS_LIST="/getAll/list";
	public final static String DELETE_PROFILE_DETAILS_By_USER_ID="/profile_details/delete/{user_id}";
	public final static String GET_USER_BY_ID="/getprofiledetails/{user_id}";
	public final static String ALL_MOTHERTONGUES="/getAllMothertongues";
	public final static String ALL_RELIGIONS="/getAllReligions";
	public final static String ALL_MANGLIK="/getAllManglik";
	public final static String ALL_HOROSCOPE="/getAllHoroscope";
	public final static String All_MARITAL_STATUS="/getAllMaritalStatus";
	public final static String All_USER="/getAllUser";
	
	
	
	
	public final static String POST_LIFE_STYLE="/lifeStyle/postLifeStyle";
	public final static String UPDATE_LIFE_STYLE="/lifeStyle/updateLifeStyle/{user_id}/{lifestyle_id}";
	public final static String DELETE_LIFE_STYLE="/lifeStyle/deleteLifeStyle/{lifestyle_id}";
	public final static String GET_ALL_LIFE_STYLES="/getAll";
	public final static String GET_ALL_LANGUAGES="/getAllLanguage";
	public final static String ALL_HOBBIES="/getAllHobbies";
	public final static String ALL_INTEREST="/getAllInterest";
	public final static String ALL_SPORTS="/getAllSports";
	public final static String ALL_DRESS_STYLE="/getAllDressStyle";
	
	
	
	
	
	public final static String API="/api/educationdetails";
	
	public final static String POST_EDUCATION_DETAILS="/educationdetails/create_education_details";

	public final static String GET_USER_BY_ID_EDUCATIONDETAILS_ID="/getAllUser/{user_id}/{education_details_id}";
	
	public final static String GET_ALL_EDUCATIONDETAILS="/getallEducationDetails";
	
	public final static String  UPDATE_USER_BY_ID_EDUCATIONDETAILS_ID ="/updateById/{user_id}/{education_details_id}";
	
	public final static String DELETE_USER="/delete/{user_id}";
	
	public final static String GET_BRIDE_COUNT="/getBrideCount";
}
