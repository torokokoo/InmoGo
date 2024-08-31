package com.inmogo.api.Controller;

import com.inmogo.api.Entity.Acquirer;
import com.inmogo.api.Service.AcquirerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/acquirer")
public class AcquirerController {
    @Autowired
    private AcquirerService acquirerService;
    @Autowired
    private DataSourceTransactionManagerAutoConfiguration dataSourceTransactionManagerAutoConfiguration;

    @PostMapping("/register")
    public Acquirer register(@RequestBody Acquirer newAcquirer){
        return acquirerService.register(newAcquirer.getId(),
                                        newAcquirer.getName(),
                                        newAcquirer.getRut(),
                                        newAcquirer.getEmail(),
                                        newAcquirer.getPassword());
    }
}
