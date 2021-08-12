package lol.team.integration.process;

public abstract class Summoner {
    
    public abstract Object getSummonerBySummonerName(String summonerName);
    
    public abstract Object getSummonerByAccountId(String accountId);
    
    public abstract Object getSummonerByPUUID(String puuid);
    
    public abstract Object getSummonerBySummonerId(String summonerId);
    
}
