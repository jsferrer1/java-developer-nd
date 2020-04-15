package com.restapis.graphql.service;

import com.restapis.graphql.entity.Location;

import java.util.List;

public interface LocationService {
    List<Location> retrieveLocations();
}
