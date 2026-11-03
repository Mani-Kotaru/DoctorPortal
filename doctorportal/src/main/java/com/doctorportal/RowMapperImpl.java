package com.doctorportal;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<Doctor> {

	@Override
	public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
		Doctor doctor=new Doctor();
		
		doctor.setDoctorId(rs.getInt(1));
		doctor.setDoctorName(rs.getString(2));
		doctor.setSpecialization(rs.getString(3));
		doctor.setExperience(rs.getInt(4));
		doctor.setQualification(rs.getString(5));
		doctor.setEmail(rs.getString(6));
		doctor.setPhone(rs.getString(7));
		doctor.setConsultationFee(rs.getDouble(8));
		doctor.setHospitalName(rs.getString(9));
		doctor.setAvailableDays(rs.getString(10));
		doctor.setAvailableTime(rs.getString(11));
		
		return doctor;
	}

	
}
