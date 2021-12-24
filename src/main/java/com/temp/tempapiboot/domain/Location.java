package com.temp.tempapiboot.domain;

import com.temp.tempapiboot.service.dto.LocationDto;

import javax.persistence.*;


@Entity
@Table(name = "LOCATIONS")
public class Location {
    @Id
    @GeneratedValue(generator = "location_seq")
    private int id;
    private String city;
    private double longitude;
    private double latitude;

    public Location(String city, double longitude, double latitude) {
        this.city = city;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Location() {
    }

    public Location(LocationDto locationDto) {
        this.id = locationDto.getId();
        this.city = locationDto.getCity();
        this.longitude = locationDto.getLongitude();
        this.latitude = locationDto.getLatitude();
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
