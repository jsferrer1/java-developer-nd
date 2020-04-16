package com.restapis.bootstrap.repository;

import com.restapis.bootstrap.entity.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Long> {
}
