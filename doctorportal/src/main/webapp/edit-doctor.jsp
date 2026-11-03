
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<%@ page isELIgnored="false" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Edit Doctor Details</title>

<!-- Bootstrap 5 CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet">

<style>
    body {
        background-color: #f4f7fb;
        font-family: Arial, sans-serif;
    }

    .navbar {
        background-color: #173b67;
    }

    .navbar-brand {
        color: white;
        font-weight: bold;
        font-size: 22px;
    }

    .form-card {
        border: none;
        border-radius: 12px;
        box-shadow: 0 3px 15px rgba(0,0,0,0.08);
    }

    .page-title {
        color: #173b67;
        font-weight: bold;
    }

    .form-label {
        font-weight: 600;
    }

    .btn-update {
        background-color: #198754;
        color: white;
    }

    .btn-update:hover {
        background-color: #146c43;
        color: white;
    }
</style>

</head>

<body>

<!-- Navigation Bar -->
<nav class="navbar navbar-dark">
    <div class="container-fluid px-4">
        <a class="navbar-brand"
           href="${pageContext.request.contextPath}/index">
            Doctor Portal
        </a>
    </div>
</nav>


<!-- Main Container -->
<div class="container py-5">

    <div class="row justify-content-center">

        <div class="col-lg-9">

            <div class="card form-card">

                <div class="card-header bg-white p-4">

                    <h3 class="page-title mb-1">
                        Edit Doctor Details
                    </h3>

                    <p class="text-secondary mb-0">
                        Update the doctor's information below.
                    </p>

                </div>


                <div class="card-body p-4">

                    <form:form
                        action="${pageContext.request.contextPath}/updateDoctor"
                        method="post"
                        modelAttribute="doctor">

                        <!-- Doctor ID -->
                        <form:hidden path="doctorId"/>

                        <div class="row g-3">

                            <!-- Doctor Name -->
                            <div class="col-md-6">
                                <label class="form-label">Doctor Name</label>
                                <form:input path="doctorName"
                                    cssClass="form-control"
                                    required="required"/>
                            </div>


                            <!-- Specialization -->
                            <div class="col-md-6">
                                <label class="form-label">Specialization</label>
                                <form:input path="specialization"
                                    cssClass="form-control"/>
                            </div>


                            <!-- Experience -->
                            <div class="col-md-6">
                                <label class="form-label">Experience (Years)</label>
                                <form:input path="experience"
                                    type="number"
                                    cssClass="form-control"/>
                            </div>


                            <!-- Qualification -->
                            <div class="col-md-6">
                                <label class="form-label">Qualification</label>
                                <form:input path="qualification"
                                    cssClass="form-control"/>
                            </div>


                            <!-- Email -->
                            <div class="col-md-6">
                                <label class="form-label">Email</label>
                                <form:input path="email"
                                    type="email"
                                    cssClass="form-control"/>
                            </div>


                            <!-- Phone -->
                            <div class="col-md-6">
                                <label class="form-label">Phone</label>
                                <form:input path="phone"
                                    cssClass="form-control"/>
                            </div>


                            <!-- Consultation Fee -->
                            <div class="col-md-6">
                                <label class="form-label">Consultation Fee</label>
                                <form:input path="consultationFee"
                                    type="number"
                                    step="0.01"
                                    cssClass="form-control"/>
                            </div>


                            <!-- Hospital Name -->
                            <div class="col-md-6">
                                <label class="form-label">Hospital Name</label>
                                <form:input path="hospitalName"
                                    cssClass="form-control"/>
                            </div>


                            <!-- Available Days -->
                            <div class="col-md-6">
                                <label class="form-label">Available Days</label>
                                <form:input path="availableDays"
                                    cssClass="form-control"/>
                            </div>


                            <!-- Available Time -->
                            <div class="col-md-6">
                                <label class="form-label">Available Time</label>
                                <form:input path="availableTime"
                                    cssClass="form-control"/>
                            </div>

                        </div>


                        <!-- Buttons -->
                        <div class="mt-4 d-flex gap-2">

                            <button type="submit"
                                class="btn btn-update px-4">
                                Update Doctor
                            </button>

                            <a href="${pageContext.request.contextPath}/index"
                               class="btn btn-secondary px-4">
                                Cancel
                            </a>

                        </div>

                    </form:form>

                </div>

            </div>

        </div>

    </div>

</div>

</body>
</html>
