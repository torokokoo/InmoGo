package com.inmogo.api.Service;


import com.inmogo.api.Entity.Property;
import com.inmogo.api.Repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PropertyService {
    @Autowired
    private PropertyRepository properRepo;

    public Property createproperty(String name, String address, String district, String description, String sectorDescription, String newPropertySectorDescription, ArrayList<String> images, String dimensions){
        Property newproperty = new Property(name, address, district, description, sectorDescription, images, dimensions);
        return properRepo.save(newproperty);
    }

    public List<Property> getAll(){
        return properRepo.findAll();
    }
}
