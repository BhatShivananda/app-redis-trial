package com.trial.entities;

import java.io.Serializable;

/**
 * @author A039883
 *
 */
public enum UserActionEnum implements Serializable {
	ADD ("ADD"),
	ADDPRIVATE ("ADDPRIVATE"),
	REMOVE ("REMOVE"),
	REMOVEEXPIRED ("REMOVEEXPIRED"),
	REDEEM ("REDEEM"),
	REDEEMEDPRIVATE ("REDEEMEDPRIVATE"),
	SIGNIN ("SIGNIN"),
	SIGNOUT ("SIGNOUT"),
	AUTHORIZE("AUTHORIZE"),
	POSNOTIFICATION("POSNOTIFICATION"),
	MILESTONE("MILESTONE"),
	ADDBADGE("ADDBADGE"),
	NEWBADGE("NEWBADGE"),
	ADDSLOT("ADDSLOT"),
	ADDACHIEVEMENT("ADDACHIEVEMENT"),
	BADGEDISPLAYED("BADGEDISPLAYED"),
	SETTINGUPDATE("SETTINGUPDATE"),
	PREFERENCEUPDATE("PREFERENCEUPDATE"),
	REMOVEMULTIPLE("REMOVEMULTIPLE"),
	REMOVEMULTIPLEEXPIRED("REMOVEMULTIPLEEXPIRED"),
	OFFER_EXPIRY("OFFER_EXPIRY"),
	EARN_SPOTS("EARN_SPOTS"),
	MERGEACCOUNT("MERGEACCOUNT"),
	DAILY_LIMIT("DAILY_LIMIT"),
	MERGESUGGEST("MERGESUGGEST"),
	GGLDEAUTH("GGLDEAUTH"),
	PROFILEUPDATE("PROFILEUPDATE");
	
	
	private final String description;
	
	UserActionEnum(final String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}
}
