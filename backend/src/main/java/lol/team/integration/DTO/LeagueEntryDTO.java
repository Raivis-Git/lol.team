package lol.team.integration.DTO;

public class LeagueEntryDTO {
    private String leagueId;
    private String summonerId;
    private String summonerName;
    private String queueType;
    private String tier;
    private String rank;
    private int leaguePoints;
    private int wins;
    private int losses;
    private boolean hotStreak;
    private boolean veteran;
    private boolean freshBlood;
    private boolean inactive;
    private MiniSeriesDTO miniSeries;
    
    public String getLeagueId() {
        return leagueId;
    }
    
    public String getSummonerId() {
        return summonerId;
    }
    
    public String getSummonerName() {
        return summonerName;
    }
    
    public String getQueueType() {
        return queueType;
    }
    
    public String getTier() {
        return tier;
    }
    
    public String getRank() {
        return rank;
    }
    
    public int getLeaguePoints() {
        return leaguePoints;
    }
    
    public int getWins() {
        return wins;
    }
    
    public int getLosses() {
        return losses;
    }
    
    public boolean isHotStreak() {
        return hotStreak;
    }
    
    public boolean isVeteran() {
        return veteran;
    }
    
    public boolean isFreshBlood() {
        return freshBlood;
    }
    
    public boolean isInactive() {
        return inactive;
    }
    
    public MiniSeriesDTO getMiniSeries() {
        return miniSeries;
    }
}
