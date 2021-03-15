package lol.team.integration.process;

public abstract class League {
    
    public abstract Object getChallengerLeaguesByQueue(String queue);
    
    public abstract Object getEntriesBySummonerId(String summonerId);
    
    public abstract Object getEntriesByQueueTierDivision(String queue, String tier, String division);
    
    public abstract Object getGrandMasterLeaguesByQueue(String queue);
    
    public abstract Object getLeagueByLeagueId(String leagueId);
    
    public abstract Object getMasterLeaguesByQueue(String queue);
}
