package lol.team.integration.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UpdateDTO {
    private int id;
    private String author;
    private boolean publish;
    @JsonProperty(value = "publish_location")
    private List<String> publishLocation;
    private List<ContentDTO> translations;
    @JsonProperty(value = "created_at")
    private String createdAt;
    @JsonProperty(value = "updated_at")
    private String updatedAt;
    
    public int getId() {
        return id;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public boolean isPublish() {
        return publish;
    }
    
    public List<String> getPublishLocation() {
        return publishLocation;
    }
    
    public List<ContentDTO> getTranslations() {
        return translations;
    }
    
    public String getCreatedAt() {
        return createdAt;
    }
    
    public String getUpdatedAt() {
        return updatedAt;
    }
}
