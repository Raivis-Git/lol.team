package lol.team.integration.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class StatusDTO {
    private int id;
    @JsonProperty(value = "maintenance_status")
    private String maintenanceStatus;
    @JsonProperty(value = "incident_severity")
    private String incidentSeverity;
    private List<ContentDTO> titles;
    private List<UpdateDTO> updates;
    @JsonProperty(value = "created_at")
    private String createdAt;
    @JsonProperty(value = "archive_at")
    private String archiveAt;
    @JsonProperty(value = "updated_at")
    private String updatedAt;
    private List<String> platforms;
    
    public int getId() {
        return id;
    }
    
    public String getMaintenanceStatus() {
        return maintenanceStatus;
    }
    
    public String getIncidentSeverity() {
        return incidentSeverity;
    }
    
    public List<ContentDTO> getTitles() {
        return titles;
    }
    
    public List<UpdateDTO> getUpdates() {
        return updates;
    }
    
    public String getCreatedAt() {
        return createdAt;
    }
    
    public String getArchiveAt() {
        return archiveAt;
    }
    
    public String getUpdatedAt() {
        return updatedAt;
    }
    
    public List<String> getPlatforms() {
        return platforms;
    }
}
