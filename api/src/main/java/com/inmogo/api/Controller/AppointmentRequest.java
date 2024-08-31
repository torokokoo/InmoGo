package com.inmogo.api.Controller;

public class AppointmentRequest {
    private Long ownerId;
    private Long acquirerId;
    private Long listingId;
    private long unixDate;

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

    public long getUnixDate() {
        return unixDate;
    }

    public void setUnixDate(long unixDate) {
        this.unixDate = unixDate;
    }
}

