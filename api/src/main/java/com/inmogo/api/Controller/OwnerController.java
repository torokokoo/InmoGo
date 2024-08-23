package com.inmogo.api.Controller;

import com.inmogo.api.Entity.Listing;
import com.inmogo.api.Entity.Owner;
import com.inmogo.api.Service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/owner")


public class OwnerController {
    @Autowired
    private OwnerService ownerService;

}
