package lol.team.integration.process.v4;

import lol.team.constants.URI;
import lol.team.integration.DTO.SummonerDTO;
import lol.team.integration.process.Summoner;
import org.springframework.web.client.RestTemplate;

import static lol.team.utils.IntegrationProcessUtils.createURI;

public class SummonerV4 extends Summoner {
    
    public SummonerDTO getSummonerBySummonerName(String summonerName) {

        final String uri = createURI(summonerName, URI.EUW_BASE, URI.LOL_SUMMONER_BY_NAME_V4_URI);
        
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, SummonerDTO.class);
    }
    
    public SummonerDTO getSummonerByAccountId(String accountId) {
        
        final String uri = createURI(accountId, URI.EUW_BASE, URI.LOL_SUMMONER_BY_ACCOUNT_ID_V4_URI);
        
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, SummonerDTO.class);
    }
    
    public SummonerDTO getSummonerByPUUID(String puuid) {
    
        final String uri = createURI(puuid, URI.EUW_BASE, URI.LOL_SUMMONER_BY_PUUID_V4_URI);
        
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, SummonerDTO.class);
    }
    
    public SummonerDTO getSummonerBySummonerId(String summonerId) {
    
        final String uri = createURI(summonerId, URI.EUW_BASE, URI.LOL_SUMMONER_BY_SUMMONER_ID_V4_URI);
    
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, SummonerDTO.class);
    }
    
}
