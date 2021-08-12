package lol.team.integration.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SummonerDTO {
    
    private String accountId;
    private int profileIconId;
    private long revisionDate;
    private String name;
    private String id;
    private String puuid;
    private String summonerLevel;
    
    public String getAccountId() {
        return accountId;
    }
    
    public int getProfileIconId() {
        return profileIconId;
    }
    
    public long getRevisionDate() {
        return revisionDate;
    }
    
    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }
    
    public String getPuuid() {
        return puuid;
    }
    
    public String getSummonerLevel() {
        return summonerLevel;
    }
}
