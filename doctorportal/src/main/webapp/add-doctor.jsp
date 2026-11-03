
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Doctor</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
    }

    .container {
        width: 450px;
        margin: 30px auto;
        padding: 25px;
        background-color: white;
        border-radius: 10px;
        box-shadow: 0 0 10px #ccc;
    }

    h2 {
        text-align: center;
        color: #333;
    }

    label {
        display: block;
        margin-top: 12px;
        font-weight: bold;
    }

    input {
        width: 100%;
        padding: 9px;
        margin-top: 5px;
        box-sizing: border-box;
    }

    button {
        width: 100%;
        padding: 12px;
        margin-top: 20px;
        background-color: #007bff;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }

    button:hover {
        background-color: #0056b3;
    }
</style>
</head>

<body>

<div class="container">

    <h2>Add Doctor</h2>

    <form:form action="add"
               method="post"
               modelAttribute="doctor">

        <label>Doctor Name:</label>
        <form:input path="doctorName" required="required"/>

        <label>Specialization:</label>
        <form:input path="specialization" required="required"/>

        <label>Experience (Years):</label>
        <form:input path="experience" type="number"
                    min="0" required="required"/>

        <label>Qualification:</label>
        <form:input path="qualification" required="required"/>

        <label>Email:</label>
        <form:input path="email" type="email"
                    required="required"/>

        <label>Phone:</label>
        <form:input path="phone" type="tel"
                    required="required"/>

        <label>Consultation Fee:</label>
        <form:input path="consultationFee" type="number"
                    min="0" step="0.01" required="required"/>

        <label>Hospital Name:</label>
        <form:input path="hospitalName" required="required"/>

        <label>Available Days:</label>
        <form:input path="availableDays"
                    placeholder="Monday, Wednesday, Friday"
                    required="required"/>

        <label>Available Time:</label>
        <form:input path="availableTime"
                    placeholder="10:00 AM - 2:00 PM"
                    required="required"/>

        <button type="submit">Add Doctor</button>

    </form:form>

</div>

</body>
</html>
