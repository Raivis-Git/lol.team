package lol.team.controller.rest;

import lol.team.integration.process.Status;
import lol.team.integration.process.v4.StatusV4;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    
    private static final Status status = new StatusV4();
    
    @GetMapping(path = "/v4/status")
    public static Object getStatus() {
        try {
            return status.getStatus();
        } catch (Exception e) {
            return "nigger";
        }
    }
    
}
