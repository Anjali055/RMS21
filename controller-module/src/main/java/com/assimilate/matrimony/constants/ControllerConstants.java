package com.assimilate.matrimony.constants;

public class ControllerConstants {
	
	public final static String ROOT_API_URL="api/user";
	
	
	//--All user Api--//
	public final static String ROOT_API_URL_USER="/api/user";
	public final static String GET_ALL_USER="/getall" ;
	public final static String POST_USER="/postuser" ;
	public final static String GET_BY_USERID="/getbyid/{id}";
	public final static String DELETE_BY_USERID="/softdelete/{id}";
	public final static String GET_ALL_GROOMS="/getallgrooms";
	public final static String GET_ALL_COUNT="/getallcount";
	
	//--All the Country Api--//
	public final static String ROOT_API_COUNTRY="/api/country";
	public final static String GET_ALL_COUNTRY="/getall";
	public final static String SAVE_COUNTRY="/savecountry";
	
	
	//---All the City Api---//
	public final static String ROOT_API_CITY="/api/city";
	public final static String SAVE_CITY="/postcity";
	
	//--All the stateApi--//
	public final static String ROOT_API_STATE="/api/state";
	public final static String  SAVE_STATE="/poststate";
	
	
	//--ALl the  FamilyDetails Controller
	
	public final static String  ROOT_API_FAMILYDETAILS="/api/familydetails";
	public final static String 	SAVE_FAMILYDETAILS="/postall";
	public final static String 	GET_ALL_FAMILYDETAILS="/getall";
	public final static String 	GET_ALL_FAMILYDETAILS_BY_USERID="/getById/{uid}";
	public final static String GET_ALL_FAMILYDETAILS_BY_FAMILYID="/getbyfamilyid/{fid}";
	public final static String UPDATE_BASED_ON_USERID_FAMILYDETAILSID="/update/{user_id}/{family_id}";
	
	
	
	
	
	

}
