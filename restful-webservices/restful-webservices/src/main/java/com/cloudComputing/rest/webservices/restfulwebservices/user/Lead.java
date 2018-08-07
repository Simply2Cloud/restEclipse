package com.cloudComputing.rest.webservices.restfulwebservices.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;





@Entity
@Table(name = "lead")
public class Lead {

	@Id
	@SequenceGenerator(name = "my_seq", sequenceName = "seq1", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq")
	@Column(name = "Id")
	private Integer id = 0;
	@Column(name = "Phone")
	private Integer phone = 0;
	@Column(name = "Name")
	private String name = "";
	@Column(name = "Email")
	private String email = "";
	@Column(name = "Profession")
	private String profession = "";
	@Column(name = "LeadType")
	private String leadType = "";
	@Column(name = "LeadSource")
	private String leadSource = "";
	@Column(name = "LeadDate")
	private String leadDate = "";
	@Column(name = "LeadTime")
	private String leadTime = "";
	@Column(name = "LeadStatus")
	private String leadStatus = "";
	@Column(name = "Comments")
	private String comments = "";
	@Column(name = "ReferenceName")
	private String referenceName = "";

	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id2) {
		this.id = id2;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer i) {
		this.phone = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getLeadType() {
		return leadType;
	}
	public void setLeadType(String leadType) {
		this.leadType = leadType;
	}
	public String getLeadSource() {
		return leadSource;
	}
	public void setLeadSource(String leadSource) {
		this.leadSource = leadSource;
	}
	public String getLeadDate() {
		return leadDate;
	}
	public void setLeadDate(String leadDate) {
		this.leadDate = leadDate;
	}
	public String getLeadTime() {
		return leadTime;
	}
	public void setLeadTime(String leadTime) {
		this.leadTime = leadTime;
	}
	public String getLeadStatus() {
		return leadStatus;
	}
	public void setLeadStatus(String leadStatus) {
		this.leadStatus = leadStatus;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getRefName() {
		return referenceName;
	}
	public void setRefName(String referenceName) {
		this.referenceName = referenceName;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", phone=" + phone + ", name=" + name + ", email=" + email + ", profession="
				+ profession + ", leadType=" + leadType + ", leadSource=" + leadSource + ", leadDate=" + leadDate
				+ ", leadTime=" + leadTime + ", leadStatus=" + leadStatus + ", comments=" + comments + ", refName="
				+ referenceName + "]";
	}
	
	public Lead(Integer i) {
		super();
		this.id = i;
	}
	
	public Lead() {
		
	}
	
	/*public Lead(Integer id, Integer phone, String name, String email, String profession, String leadType,
			String leadSource, String leadDate, String leadTime, String leadStatus, String comments, String refName) {
		super();
		this.id = id;
		this.phone = phone;
		this.name = name;
		this.email = email;
		this.profession = profession;
		this.leadType = leadType;
		this.leadSource = leadSource;
		this.leadDate = leadDate;
		this.leadTime = leadTime;
		this.leadStatus = leadStatus;
		this.comments = comments;
		this.referenceName = refName;
	}*/
	
	
	
}
