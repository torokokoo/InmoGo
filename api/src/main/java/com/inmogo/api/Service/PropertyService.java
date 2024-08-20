package com.inmogo.api.Service;

import com.inmogo.api.Entity.Property;
import com.inmogo.api.Repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PropertyService {
    @Autowired
    private PropertyRepository properRepo;

    public Property createproperty(long id, String name, String address, String district, String description, String sectorDescription, String newPropertySectorDescription, String dimensions, ArrayList<String> images){
        Property newproperty = new Property(id, name, address, district, description, sectorDescription, dimensions, images);
        return properRepo.save(newproperty);
    }
}
