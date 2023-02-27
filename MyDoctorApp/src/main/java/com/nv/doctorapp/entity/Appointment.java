package com.nv.doctorapp.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="appointment")
public class Appointment {
	
	
	/*@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "appointmentId")
	private List<Patient> patient;*/
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appointmentId;
	private String date;
	private String status;
	private String patientName;
	private String patientPhoneNumber;
	private String doctorName;
	private String hospitalName;
	private String speciality;
	
	public Appointment(int appointmentId, String date, String status, String patientName, String patientPhoneNumber,
			String doctorName, String hospitalName, String speciality) {
		super();
		this.appointmentId = appointmentId;
		this.date = date;
		this.status = status;
		this.patientName = patientName;
		this.patientPhoneNumber = patientPhoneNumber;
		this.doctorName = doctorName;
		this.hospitalName = hospitalName;
		this.speciality = speciality;
	}
	
//	appointmentId: number;    
//	date : string;    
//	status: string;    
//	doctorName: string;    
//	patientName: string;    
//	speciality: string;    
//	hospitalName: string;    
//	patientPhoneNumber: string;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}
