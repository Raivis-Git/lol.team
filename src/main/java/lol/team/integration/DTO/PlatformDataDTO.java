package lol.team.integration.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlatformDataDTO {
    private String id;
    private String name;
    private List<String> locales;
    private List<StatusDTO> maintenances;
    private List<StatusDTO> incidents;
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public List<String> getLocales() {
        return locales;
    }
    
    public List<StatusDTO> getMaintenances() {
        return maintenances;
    }
    
    public List<StatusDTO> getIncidents() {
        return incidents;
    }
}
