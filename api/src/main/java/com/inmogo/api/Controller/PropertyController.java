package com.inmogo.api.Controller;

import com.inmogo.api.Entity.Property;
import com.inmogo.api.Service.OwnerService;
import com.inmogo.api.Service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/Api/Property")

public class PropertyController {
    @Autowired
    private PropertyService propertyService;

    @PostMapping("/createproperty")
    public Property createproperty(@RequestBody Property newProperty){
        return propertyService.createproperty(newProperty.getName(), newProperty.getAddress(), newProperty.getDistrict(), newProperty.getDescription(), newProperty.getDescription(), newProperty.getSectorDescription(), newProperty.getImages(), newProperty.getDimensions());
    }
}
