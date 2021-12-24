package com.temp.tempapiboot.service.mappers;

import com.temp.tempapiboot.domain.Location;
import com.temp.tempapiboot.service.dto.LocationDto;
import org.springframework.stereotype.Service;

@Service
public class LocationMapper {
    public LocationDto map(Location location){
        return new LocationDto(location);
    }

    public Location map(LocationDto locationDto){
        return new Location(locationDto);
    }
}
