package com.restapis.bootstrap.service;

import com.restapis.bootstrap.entity.Dog;
import com.restapis.bootstrap.exception.DogNotFoundException;
import com.restapis.bootstrap.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogServiceImpl implements DogService {

    @Autowired
    DogRepository dogRepository;

    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    public List<String> retrieveDogBreed() {
        return (List<String>) dogRepository.findAllBreed();
    }

    public String retrieveDogBreedById(Long id) {
//        Optional<String> optionalBreed = Optional.ofNullable(dogRepository.findBreedById(id));
//        String breed = optionalBreed.orElseThrow(DogNotFoundException::new);
//        return breed;
        return null;
    }

    public List<String> retrieveDogNames() {
        return (List<String>) dogRepository.findAllName();
    }
}
