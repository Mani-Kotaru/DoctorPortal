package com.collections;

public class Patient {
   private int patientId;
   private String name;
   private int age;
   private int triageLevel;
   private String condition;
   public Patient(int patientId, String name, int age, int triageLevel, String condition) {
	this.patientId = patientId;
	this.name = name;
	this.age = age;
	this.triageLevel = triageLevel;
	this.condition = condition;
   }
   public Patient()
   {
	   
   }
   public int getPatientId() {
	return patientId;
   }
   public void setPatientId(int patientId) {
	this.patientId = patientId;
   }
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   public int getAge() {
	return age;
   }
   public void setAge(int age) {
	this.age = age;
   }
   public int getTriageLevel() {
	return triageLevel;
   }
   public void setTriageLevel(int triageLevel) {
	this.triageLevel = triageLevel;
   }
   public String getCondition() {
	return condition;
   }
   public void setCondition(String condition) {
	this.condition = condition;
   }
   @Override
   public String toString() {
	return "Patient [patientId=" + patientId + ", name=" + name + ", age=" + age + ", triageLevel=" + triageLevel
			+ ", condition=" + condition + "]";
   }
   
   
}
