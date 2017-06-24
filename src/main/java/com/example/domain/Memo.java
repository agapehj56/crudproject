package com.example.domain;

import java.sql.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.domain.Memo;

public class Memo {

	private Integer mno;
	private String mname;
	private String mcontent;
	private String password;
	private Date mdate;

	public Memo() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		String str= null;
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			str = mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return str;
	}

	public Integer getMno() {
		return mno;
	}

	public Memo setMno(final Integer value) {
		mno = value;
		return this;
	}

	public String getMname() {
		return mname;
	}

	public Memo setMname(final String value) {
		mname = value;
		return this;
	}

	public String getMcontent() {
		return mcontent;
	}

	public Memo setMcontent(final String value) {
		mcontent = value;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public Memo setPassword(final String value) {
		password = value;
		return this;
	}

	public Date getMdate() {
		return mdate;
	}

	public Memo setMdate(final Date value) {
		mdate = value;
		return this;
	}
}
