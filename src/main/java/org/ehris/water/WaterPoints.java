package org.ehris.water;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;


public class WaterPoints {
	private String water_pay; 
	private String respondent; 
	private String research_asst_name;
	private String water_used_season;
	private String _bamboo_dataset_id;
	private String _deleted_at;
	private String water_point_condition;
	private String _xform_id_string;
	private String other_point_1km;
	private List<String>_attachments;
	private String communities_villages;
	private String end_date;
	private String animal_number;
	private String water_point_id;
	private String start_date;
	private String water_connected;
	private String water_manager_name;
	private String _status;
	private String enum_id_1;
	private String water_lift_mechanism;
	private String districts_divisions;
	private String _uuid;
	private String grid;
	private String date;
	private String formhub_uuid;
	private String road_available;
	private String water_functioning;
	private String _submission_time;
	private String signal;
	private String water_source_type;
	private List<String> _geolocation;
	private String water_point_image;
	private String water_point_geocode;
	private String deviceid;
	private String locations_wards;
	private String water_manager;
	private String water_developer;
	private String _id; 
	private String animal_point;
	private String water_mechanism_plate;
	private String water_lift_mechanism_type;
	private String water_mechanism_plate_units;
	private String water_mechanism_plate_no;
	private String water_not_functioning;
	private String water_source_type_other;
	private String simserial;
	private String subscriberid;
	
    
    
    
    
    
    
    /**
     * @return the subscriberid
     */
    public String getSubscriberid() {
    	return subscriberid;
    }








	
    /**
     * @param subscriberid the subscriberid to set
     */
    public void setSubscriberid(String subscriberid) {
    	this.subscriberid = subscriberid;
    }








	/**
     * @return the simserial
     */
    public String getSimserial() {
    	return simserial;
    }







	
    /**
     * @param simserial the simserial to set
     */
    public void setSimserial(String simserial) {
    	this.simserial = simserial;
    }







	public String getWater_source_type_other() {
    	return water_source_type_other;
    }






	
    public void setWater_source_type_other(String water_source_type_other) {
    	this.water_source_type_other = water_source_type_other;
    }






	public String getWater_not_functioning() {
    	return water_not_functioning;
    }





	
    public void setWater_not_functioning(String water_not_functioning) {
    	this.water_not_functioning = water_not_functioning;
    }





	public String getWater_mechanism_plate_no() {
    	return water_mechanism_plate_no;
    }




	
    public void setWater_mechanism_plate_no(String water_mechanism_plate_no) {
    	this.water_mechanism_plate_no = water_mechanism_plate_no;
    }




	public String getWater_mechanism_plate_units() {
    	return water_mechanism_plate_units;
    }



	
    public void setWater_mechanism_plate_units(String water_mechanism_plate_units) {
    	this.water_mechanism_plate_units = water_mechanism_plate_units;
    }



	public String getRoad_type() {
    	return road_type;
    }


	
    public void setRoad_type(String road_type) {
    	this.road_type = road_type;
    }

	private String road_type;
	
	
    
    public String getWater_lift_mechanism_type() {
    	return water_lift_mechanism_type;
    }

	
    public void setWater_lift_mechanism_type(String water_lift_mechanism_type) {
    	this.water_lift_mechanism_type = water_lift_mechanism_type;
    }

	public String getWater_mechanism_plate() {
    	return water_mechanism_plate;
    }
	
    public void setWater_mechanism_plate(String water_mechanism_plate) {
    	this.water_mechanism_plate = water_mechanism_plate;
    }
	public WaterPoints(String water_point_condition, String communities_villages, String _uuid) {
		this.water_point_condition=water_point_condition;
		this.communities_villages = communities_villages;
		this._uuid = _uuid;
	}
    public String getWater_pay() {
    	return water_pay;
    }
	
    public void setWater_pay(String water_pay) {
    	this.water_pay = water_pay;
    }
	
    public String getRespondent() {
    	return respondent;
    }
	
    public void setRespondent(String respondent) {
    	this.respondent = respondent;
    }
	
    public String getResearch_asst_name() {
    	return research_asst_name;
    }
	
    public void setResearch_asst_name(String research_asst_name) {
    	this.research_asst_name = research_asst_name;
    }
	
    public String getWater_used_season() {
    	return water_used_season;
    }
	
    public void setWater_used_season(String water_used_season) {
    	this.water_used_season = water_used_season;
    }
	
    public String get_bamboo_dataset_id() {
    	return _bamboo_dataset_id;
    }
	
    public void set_bamboo_dataset_id(String _bamboo_dataset_id) {
    	this._bamboo_dataset_id = _bamboo_dataset_id;
    }
	
    public String get_deleted_at() {
    	return _deleted_at;
    }
	
    public void set_deleted_at(String _deleted_at) {
    	this._deleted_at = _deleted_at;
    }
	
    public String getWater_point_condition() {
    	return water_point_condition;
    }
	
    public void setWater_point_condition(String water_point_condition) {
    	this.water_point_condition = water_point_condition;
    }
	
    public String get_xform_id_string() {
    	return _xform_id_string;
    }
	
    public void set_xform_id_string(String _xform_id_string) {
    	this._xform_id_string = _xform_id_string;
    }
	
    public String getOther_point_1km() {
    	return other_point_1km;
    }
	
    public void setOther_point_1km(String other_point_1km) {
    	this.other_point_1km = other_point_1km;
    }
	
    public List<String> get_attachments() {
    	return _attachments;
    }
	
    public void set_attachments(List<String> _attachments) {
    	this._attachments = _attachments;
    }
	
    public String getCommunities_villages() {
    	return communities_villages;
    }
	
    public void setCommunities_villages(String communities_villages) {
    	this.communities_villages = communities_villages;
    }
	
    @JsonProperty("end")
    public String getEnd_date() {
    	return end_date;
    }
	
    @JsonProperty("end")
    public void setEnd_date(String end_date) {
    	this.end_date = end_date;
    }
	
    public String getAnimal_number() {
    	return animal_number;
    }
	
    public void setAnimal_number(String animal_number) {
    	this.animal_number = animal_number;
    }
	
    public String getWater_point_id() {
    	return water_point_id;
    }
	
    public void setWater_point_id(String water_point_id) {
    	this.water_point_id = water_point_id;
    }
	
    @JsonProperty("start")
    public String getStart_date() {
    	return start_date;
    }
	
    @JsonProperty("start")
    public void setStart_date(String start_date) {
    	this.start_date = start_date;
    }
	
    public String getWater_connected() {
    	return water_connected;
    }
	
    public void setWater_connected(String water_connected) {
    	this.water_connected = water_connected;
    }
	
    public String getWater_manager_name() {
    	return water_manager_name;
    }
	
    public void setWater_manager_name(String water_manager_name) {
    	this.water_manager_name = water_manager_name;
    }
	
    public String get_status() {
    	return _status;
    }
	
    public void set_status(String _status) {
    	this._status = _status;
    }
	
    public String getEnum_id_1() {
    	return enum_id_1;
    }
	
    public void setEnum_id_1(String enum_id_1) {
    	this.enum_id_1 = enum_id_1;
    }
	
    public String getWater_lift_mechanism() {
    	return water_lift_mechanism;
    }
	
    public void setWater_lift_mechanism(String water_lift_mechanism) {
    	this.water_lift_mechanism = water_lift_mechanism;
    }
	
    public String getDistricts_divisions() {
    	return districts_divisions;
    }
	
    public void setDistricts_divisions(String districts_divisions) {
    	this.districts_divisions = districts_divisions;
    }
	
    public String get_uuid() {
    	return _uuid;
    }
	
    public void set_uuid(String _uuid) {
    	this._uuid = _uuid;
    }
	
    public String getGrid() {
    	return grid;
    }
	
    public void setGrid(String grid) {
    	this.grid = grid;
    }
	
    public String getDate() {
    	return date;
    }
	
    public void setDate(String date) {
    	this.date = date;
    }
	
    @JsonProperty("formhub/uuid")
    public String getFormhub_uuid() {
    	return formhub_uuid;
    }
	
    @JsonProperty("formhub/uuid")
    public void setFormhub_uuid(String formhub_uuid) {
    	this.formhub_uuid = formhub_uuid;
    }
	
    public String getRoad_available() {
    	return road_available;
    }
	
    public void setRoad_available(String road_available) {
    	this.road_available = road_available;
    }
	
    public String getWater_functioning() {
    	return water_functioning;
    }
	
    public void setWater_functioning(String water_functioning) {
    	this.water_functioning = water_functioning;
    }
	
    public String get_submission_time() {
    	return _submission_time;
    }
	
    public void set_submission_time(String _submission_time) {
    	this._submission_time = _submission_time;
    }
	
    public String getSignal() {
    	return signal;
    }
	
    public void setSignal(String signal) {
    	this.signal = signal;
    }
	
    public String getWater_source_type() {
    	return water_source_type;
    }
	
    public void setWater_source_type(String water_source_type) {
    	this.water_source_type = water_source_type;
    }
	
    public List<String> get_geolocation() {
    	return _geolocation;
    }
	
    public void set_geolocation(List<String> _geolocation) {
    	this._geolocation = _geolocation;
    }
	
    public String getWater_point_image() {
    	return water_point_image;
    }
	
    public void setWater_point_image(String water_point_image) {
    	this.water_point_image = water_point_image;
    }
	
    public String getWater_point_geocode() {
    	return water_point_geocode;
    }
	
    public void setWater_point_geocode(String water_point_geocode) {
    	this.water_point_geocode = water_point_geocode;
    }
	
    public String getDeviceid() {
    	return deviceid;
    }
	
    public void setDeviceid(String deviceid) {
    	this.deviceid = deviceid;
    }
	
    public String getLocations_wards() {
    	return locations_wards;
    }
	
    public void setLocations_wards(String locations_wards) {
    	this.locations_wards = locations_wards;
    }
	
    public String getWater_manager() {
    	return water_manager;
    }
	
    public void setWater_manager(String water_manager) {
    	this.water_manager = water_manager;
    }
	
    public String getWater_developer() {
    	return water_developer;
    }
	
    public void setWater_developer(String water_developer) {
    	this.water_developer = water_developer;
    }
	
    public String get_id() {
    	return _id;
    }
	
    public void set_id(String _id) {
    	this._id = _id;
    }
	
    public String getAnimal_point() {
    	return animal_point;
    }
	
    public void setAnimal_point(String animal_point) {
    	this.animal_point = animal_point;
    }
	public WaterPoints(String water_pay, String respondent, String research_asst_name, String water_used_season,
        String _bamboo_dataset_id, String _deleted_at, String water_point_condition, String _xform_id_string,
        String other_point_1km, List<String> _attachments, String communities_villages, String end_date,
        String animal_number, String water_point_id, String start_date, String water_connected, String water_manager_name,
        String _status, String enum_id_1, String water_lift_mechanism, String districts_divisions, String _uuid,
        String grid, String date, String formhub_uuid, String road_available, String water_functioning,
        String _submission_time, String signal, String water_source_type,List<String> _geolocation, String water_point_image,
        String water_point_geocode, String deviceid, String locations_wards, String water_manager, String water_developer,
        String _id, String animal_point) {	    
	    this.water_pay = water_pay;
	    this.respondent = respondent;
	    this.research_asst_name = research_asst_name;
	    this.water_used_season = water_used_season;
	    this._bamboo_dataset_id = _bamboo_dataset_id;
	    this._deleted_at = _deleted_at;
	    this.water_point_condition = water_point_condition;
	    this._xform_id_string = _xform_id_string;
	    this.other_point_1km = other_point_1km;
	    this._attachments = _attachments;
	    this.communities_villages = communities_villages;
	    this.end_date = end_date;
	    this.animal_number = animal_number;
	    this.water_point_id = water_point_id;
	    this.start_date = start_date;
	    this.water_connected = water_connected;
	    this.water_manager_name = water_manager_name;
	    this._status = _status;
	    this.enum_id_1 = enum_id_1;
	    this.water_lift_mechanism = water_lift_mechanism;
	    this.districts_divisions = districts_divisions;
	    this._uuid = _uuid;
	    this.grid = grid;
	    this.date = date;
	    this.formhub_uuid = formhub_uuid;
	    this.road_available = road_available;
	    this.water_functioning = water_functioning;
	    this._submission_time = _submission_time;
	    this.signal = signal;
	    this.water_source_type = water_source_type;
	    this._geolocation = _geolocation;
	    this.water_point_image = water_point_image;
	    this.water_point_geocode = water_point_geocode;
	    this.deviceid = deviceid;
	    this.locations_wards = locations_wards;
	    this.water_manager = water_manager;
	    this.water_developer = water_developer;
	    this._id = _id;
	    this.animal_point = animal_point;
    }
    
	public WaterPoints() {
		
	}
    
	
}
