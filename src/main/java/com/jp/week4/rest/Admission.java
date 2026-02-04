package com.jp.week4.rest;

public class Admission {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public String getFindings() {
		return findings;
	}

	public void setFindings(String findings) {
		this.findings = findings;
	}

	public Admission(int id, String date, String patientname, String findings) {
		super();
		this.id = id;
		this.date = date;
		this.patientname = patientname;
		this.findings = findings;
	}

	private int id;
	private String date;
	private String patientname;
	private String findings;
	
	public Admission() {}
	

}
