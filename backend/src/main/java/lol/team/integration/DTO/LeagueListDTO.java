package lol.team.integration.DTO;

import java.util.List;

public class LeagueListDTO {
    private String leagueId;
    private List<LeagueItemDTO> entries;
    private String tier;
    private String name;
    private String queue;
    
    public String getLeagueId() {
        return leagueId;
    }
    
    public List<LeagueItemDTO> getEntries() {
        return entries;
    }
    
    public String getTier() {
        return tier;
    }
    
    public String getName() {
        return name;
    }
    
    public String getQueue() {
        return queue;
    }
}
