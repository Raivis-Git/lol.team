package lol.team.integration.DTO;

public class LeagueItemDTO {
    private boolean freshBlood;
    // Winning team on Summoners Rift
    private int wins;
    private String summonerName;
    private MiniSeriesDTO miniSeries;
    private boolean inactive;
    private boolean veteran;
    private boolean hotStreak;
    private String rank;
    private int leaguePoints;
    // Losing team on Summoners Rift
    private int losses;
    // Player's encrypted summonerId
    private String summonerId;
    
    public boolean isFreshBlood() {
        return freshBlood;
    }
    
    public int getWins() {
        return wins;
    }
    
    public String getSummonerName() {
        return summonerName;
    }
    
    public MiniSeriesDTO getMiniSeries() {
        return miniSeries;
    }
    
    public boolean isInactive() {
        return inactive;
    }
    
    public boolean isVeteran() {
        return veteran;
    }
    
    public boolean isHotStreak() {
        return hotStreak;
    }
    
    public String getRank() {
        return rank;
    }
    
    public int getLeaguePoints() {
        return leaguePoints;
    }
    
    public int getLosses() {
        return losses;
    }
    
    public String getSummonerId() {
        return summonerId;
    }
}
