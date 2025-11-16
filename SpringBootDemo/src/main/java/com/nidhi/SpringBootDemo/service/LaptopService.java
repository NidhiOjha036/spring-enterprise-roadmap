package com.nidhi.SpringBootDemo.service;

import com.nidhi.SpringBootDemo.model.Laptop;
import com.nidhi.SpringBootDemo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap)
    {
        repo.save(lap);
    }

    public boolean isGoodForProg(Laptop lap)
    {
        return true;
    }

}
