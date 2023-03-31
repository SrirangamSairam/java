package com.example.L13RestTemplatedemo;

import com.fasterxml.jackson.annotation.JsonAlias;

public class JobResponse {
    @JsonAlias("TotalJobsCount")
    private String totalJobsCount;
    @JsonAlias("TotalVacanciesCount")
    private String totalVacanciesCount;
    @JsonAlias("Designation")
    private String designation;
    @JsonAlias("Location")
    private String location;
    @JsonAlias("Experience")
    private String experience;
    @JsonAlias("Company")
    private String company;
    @JsonAlias("mboost")
    private String mboost;

    public String getMboost() {
        return mboost;
    }

    public void setMboost(String mboost) {
        this.mboost = mboost;
    }

    public String getTotalJobsCount() {
        return totalJobsCount;
    }

    public void setTotalJobsCount(String totalJobsCount) {
        this.totalJobsCount = totalJobsCount;
    }

    public String getTotalVacanciesCount() {
        return totalVacanciesCount;
    }

    public void setTotalVacanciesCount(String totalVacanciesCount) {
        this.totalVacanciesCount = totalVacanciesCount;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
