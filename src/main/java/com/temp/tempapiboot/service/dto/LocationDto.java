package com.temp.tempapiboot.service.dto;

import com.temp.tempapiboot.domain.Location;

public class LocationDto {
    private int id;
    private String city;
    private double longitude;
    private double latitude;

    public LocationDto(String city, double longitude, double latitude) {
        this.city = city;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public LocationDto(Location location) {
        this.id = location.getId();
        this.city = location.getCity();
        this.longitude = location.getLongitude();
        this.latitude = location.getLatitude();
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }
}
