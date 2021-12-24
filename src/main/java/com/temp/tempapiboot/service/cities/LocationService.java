package com.temp.tempapiboot.service.cities;

import com.temp.tempapiboot.domain.Location;
import com.temp.tempapiboot.repository.LocationRepository;
import com.temp.tempapiboot.service.dto.LocationDto;
import com.temp.tempapiboot.service.mappers.LocationMapper;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
    private LocationRepository locationRepository;
    private LocationMapper locationMapper;

    public LocationService(LocationRepository locationRepository, LocationMapper locationMapper) {
        this.locationRepository = locationRepository;
        this.locationMapper = locationMapper;
    }

    public LocationDto saveLocation(LocationDto locationDto) {
        return locationMapper.map(locationRepository.saveLocation(locationMapper.map(locationDto)));
    }
}
