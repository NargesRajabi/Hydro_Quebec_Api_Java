package com.hydroqapi.models;

import groovy.transform.builder.Builder;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

import java.util.List;


@Entity
@Builder
public class PowerOutage {
    @Id
    @GeneratedValue
    private Long PowerOutageId;
    private LocalDate startDate;
    private LocalTime startTime;
    private LocalTime updateTime;
    private String address;
    private String status;
    private String description;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "Employee_PowerOutage",
            joinColumns = {@JoinColumn(name = "PowerOutageId")},
            inverseJoinColumns = {
                    @JoinColumn(name = "employeeId")
            })
    private List<Employee> employees;

    public Long getPowerOutageId() {
        return PowerOutageId;
    }

    public void setPowerOutageId(Long powerOutageId) {
        PowerOutageId = powerOutageId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
