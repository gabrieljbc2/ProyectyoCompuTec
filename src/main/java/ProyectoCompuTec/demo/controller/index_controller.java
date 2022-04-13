
package ProyectoCompuTec.demo.controller;

import ProyectoCompuTec.demo.service.Computec_service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j

public class index_controller {
    @Autowired
    
    private Computec_service computec_service;
    
    //@GetMapping("/")
    
    //@GetMapping("/login")
    
    //@GetMapping("/registro")
}
