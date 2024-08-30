package com.inmogo.api.Controller;

public class AppointmentRequest {
    private Long ownerId;
    private Long acquirerId;
    private Long listingId;
    private int dayOfAppointment;
    private int timeOfAppointment;

    // Getters y Setters


    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getAcquirerId() {
        return acquirerId;
    }

    public void setAcquirerId(Long acquirerId) {
        this.acquirerId = acquirerId;
    }

    public Long getListingId() {
        return listingId;
    }

    public void setListingId(Long listingId) {
        this.listingId = listingId;
    }

    public int getDayOfAppointment() {
        return dayOfAppointment;
    }

    public void setDayOfAppointment(int dayOfAppointment) {
        this.dayOfAppointment = dayOfAppointment;
    }

    public int getTimeOfAppointment() {
        return timeOfAppointment;
    }

    public void setTimeOfAppointment(int timeOfAppointment) {
        this.timeOfAppointment = timeOfAppointment;
    }
}

