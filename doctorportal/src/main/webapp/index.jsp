
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<%@ page isELIgnored="false" %>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Doctor Management Portal</title>

<!-- Bootstrap 5 CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet">

<style>
    body {
        background-color: #f4f7fb;
        font-family: Arial, sans-serif;
    }

    .navbar {
        background: #173b67;
    }

    .navbar-brand {
        font-weight: bold;
        color: white !important;
        font-size: 22px;
    }

    .page-title {
        color: #173b67;
        font-weight: 700;
    }

    .main-card {
        border: none;
        border-radius: 12px;
        box-shadow: 0 3px 15px rgba(0,0,0,0.07);
    }

    .table thead th {
        background-color: #173b67;
        color: white;
        white-space: nowrap;
        padding: 14px;
    }

    .table tbody td {
        vertical-align: middle;
        white-space: nowrap;
    }

    .table tbody tr:hover {
        background-color: #f0f5fc;
    }

    .btn-add {
        background-color: #198754;
        color: white;
        font-weight: 600;
    }

    .btn-add:hover {
        background-color: #146c43;
        color: white;
    }

    .footer-text {
        color: #777;
        font-size: 13px;
    }
</style>

</head>

<body>

<!-- Navigation Bar -->
<nav class="navbar navbar-expand-lg navbar-dark">
    <div class="container-fluid px-4">

        <a class="navbar-brand" href="${pageContext.request.contextPath}/index">
            Doctor Portal
        </a>

        <span class="navbar-text text-white">
            Doctor Management System
        </span>

    </div>
</nav>


<!-- Main Content -->
<div class="container-fluid px-4 py-5">

    <!-- Page Heading -->
    <div class="d-flex flex-wrap justify-content-between
                align-items-center mb-4">

        <div>
            <h2 class="page-title">Doctor Management</h2>
            <p class="text-secondary mb-0">
                Manage doctor information and records
            </p>
        </div>

        <a href="${pageContext.request.contextPath}/addDoctor"
           class="btn btn-add mt-3 mt-md-0">

            + Add New Doctor

        </a>

    </div>


    <!-- Doctor Details Card -->
    <div class="card main-card">

        <div class="card-header bg-white py-3">

            <h5 class="mb-0 fw-bold">
                Doctor Details
            </h5>

        </div>


        <div class="card-body">

            <div class="table-responsive">

                <table class="table table-bordered table-hover
                              align-middle mb-0">

                    <thead>
                        <tr>
                            <th>Doctor ID</th>
                            <th>Doctor Name</th>
                            <th>Specialization</th>
                            <th>Experience</th>
                            <th>Qualification</th>
                            <th>Email</th>
                            <th>Phone</th>
                            <th>Consultation Fee</th>
                            <th>Hospital Name</th>
                            <th>Available Days</th>
                            <th>Available Time</th>
                            <th>Actions</th>
                        </tr>
                    </thead>


                    <tbody>

                        <c:forEach var="doctor" items="${list}">

                            <tr>

                                <td>${doctor.doctorId}</td>

                                <td class="fw-semibold">
                                    ${doctor.doctorName}
                                </td>

                                <td>${doctor.specialization}</td>

                                <td>${doctor.experience} Years</td>

                                <td>${doctor.qualification}</td>

                                <td>${doctor.email}</td>

                                <td>${doctor.phone}</td>

                                <td>₹ ${doctor.consultationFee}</td>

                                <td>${doctor.hospitalName}</td>

                                <td>${doctor.availableDays}</td>

                                <td>${doctor.availableTime}</td>


                                <!-- Action Buttons -->
                                <td>

                                    <div class="d-flex gap-2">

                                        <!-- Edit Button -->
                                        <a href="${pageContext.request.contextPath}/editDoctor/${doctor.doctorId}"
                                           class="btn btn-sm btn-primary">

                                            Edit

                                        </a>


                                        <!-- Delete Button -->
                                        <form action="${pageContext.request.contextPath}/deleteDoctor/${doctor.doctorId}"
                                              method="post"
                                              onsubmit="return confirm('Are you sure you want to delete this doctor?');">

                                            <button type="submit"
                                                    class="btn btn-sm btn-danger">

                                                Delete

                                            </button>

                                        </form>

                                    </div>

                                </td>

                            </tr>

                        </c:forEach>


                        <!-- When no records are available -->
                        <c:if test="${empty list}">

                            <tr>
                                <td colspan="12"
                                    class="text-center text-secondary py-4">

                                    No doctor records found.

                                </td>
                            </tr>

                        </c:if>

                    </tbody>

                </table>

            </div>

        </div>

    </div>


    <!-- Footer -->
    <div class="text-center mt-4 footer-text">

        Doctor Management Portal | All Rights Reserved

    </div>

</div>

<!-- Bootstrap JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js">
</script>

</body>
</html>
