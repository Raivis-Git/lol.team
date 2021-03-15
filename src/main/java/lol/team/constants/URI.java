package lol.team.constants;

public class URI {
    // Base
    public static final String EUW_BASE     = "https://euw1.api.riotgames.com";
    public static final String BR1_BASE     = "https://br1.api.riotgames.com";
    public static final String EUN1_BASE    = "https://eun1.api.riotgames.com";
    public static final String JP1_BASE     = "https://jp1.api.riotgames.com";
    public static final String KR1_BASE     = "https://kr1.api.riotgames.com";
    public static final String LA1_BASE     = "https://la1.api.riotgames.com";
    public static final String LA2_BASE     = "https://la2.api.riotgames.com";
    public static final String NA1_BASE     = "https://na1.api.riotgames.com";
    public static final String OC1_BASE     = "https://oc1.api.riotgames.com";
    public static final String RU1_BASE     = "https://ru.api.riotgames.com";
    public static final String TR1_BASE     = "https://tr1.api.riotgames.com";
    
    // Status
    public static final String LOL_STATUS_V4_URI    = "/lol/status/v4/platform-data/";
    
    // Summoner
    public static final String LOL_SUMMONER_BY_NAME_V4_URI          = "/lol/summoner/v4/summoners/by-name/%s";
    public static final String LOL_SUMMONER_BY_ACCOUNT_ID_V4_URI    = "/lol/summoner/v4/summoners/by-account/%s";
    public static final String LOL_SUMMONER_BY_PUUID_V4_URI         = "/lol/summoner/v4/summoners/by-puuid/%s";
    public static final String LOL_SUMMONER_BY_SUMMONER_ID_V4_URI   = "/lol/summoner/v4/summoners/%s";
    
    // League
    public static final String LOL_LEAGUE_CHALLENGER_LEAGUES    = "/lol/league/v4/challengerleagues/by-queue/";
    public static final String LOL_LEAGUE_ENTRIES_BY_SUMMONER   = "/lol/league/v4/entries/by-summoner/";
    public static final String LOL_LEAGUE_ENTRIES_ALL           = "/lol/league/v4/entries/";
    public static final String LOL_LEAGUE_GRANDMASTER_LEAGUES   = "/lol/league/v4/grandmasterleagues/by-queue/";
    public static final String LOL_LEAGUE_CHOSEN_LEAGUES        = "/lol/league/v4/leagues/";
    public static final String LOL_LEAGUE_MASTER_LEAGUES        = "/lol/league/v4/masterleagues/by-queue/";
    
}
