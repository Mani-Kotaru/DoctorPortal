package com.doctorportal;

import java.util.List;


import org.springframework.jdbc.core.JdbcTemplate;

public class DoctorDAO {
   private JdbcTemplate jdbcTemplate;

   public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
   }
   
  
   public int insert(Doctor doctor) {
	    String sql = "INSERT INTO doctor "
	            + "(doctorName, specialization, experience, qualification, "
	            + "email, phone, consultationFee, hospitalName, "
	            + "availableDays, availableTime) "
	            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	    return jdbcTemplate.update(sql,
	            doctor.getDoctorName(),
	            doctor.getSpecialization(),
	            doctor.getExperience(),
	            doctor.getQualification(),
	            doctor.getEmail(),
	            doctor.getPhone(),
	            doctor.getConsultationFee(),
	            doctor.getHospitalName(),
	            doctor.getAvailableDays(),
	            doctor.getAvailableTime());
	}


   public List<Doctor> getAllDoctorInfo() {
	     String sql="select * from doctor";
	return jdbcTemplate.query(sql, new RowMapperImpl());
   }
   
   public int deleteDoctor(int id) {

	    String sql = "DELETE FROM doctor WHERE doctorId="+id;

	    return jdbcTemplate.update(sql);
	}


   public Doctor getDoctorById(int id) {
	   String sql="select * from doctor where doctorId="+id;
	return jdbcTemplate.queryForObject(sql, new RowMapperImpl());
   }


   public int updateDoctor(Doctor doctor) {
	   String sql = "UPDATE doctor SET doctorName=?, specialization=?, "
	            + "experience=?, qualification=?, email=?, phone=?, "
	            + "consultationFee=?, hospitalName=?, availableDays=?, "
	            + "availableTime=? WHERE doctorId=?";

	    return jdbcTemplate.update(sql,
	            doctor.getDoctorName(),
	            doctor.getSpecialization(),
	            doctor.getExperience(),
	            doctor.getQualification(),
	            doctor.getEmail(),
	            doctor.getPhone(),
	            doctor.getConsultationFee(),
	            doctor.getHospitalName(),
	            doctor.getAvailableDays(),
	            doctor.getAvailableTime(),
	            doctor.getDoctorId());
	
   }
}
