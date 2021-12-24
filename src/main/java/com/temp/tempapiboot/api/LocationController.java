package com.temp.tempapiboot.api;

import com.temp.tempapiboot.service.cities.LocationService;
import com.temp.tempapiboot.service.dto.LocationDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/locations", produces = "application/json")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public LocationDto saveLocation(@RequestBody LocationDto locationDto){
        return locationService.saveLocation(locationDto);
    }
}
