package lol.team.integration.process.v4;

import lol.team.constants.URI;
import lol.team.integration.DTO.LeagueEntryDTO;
import lol.team.integration.DTO.LeagueListDTO;
import lol.team.integration.process.League;
import org.springframework.web.client.RestTemplate;

import static lol.team.utils.IntegrationProcessUtils.createURI;

public class LeagueV4 extends League {
    @Override
    public LeagueListDTO getChallengerLeaguesByQueue(String queue) {
        final String uri = createURI(queue, URI.EUW_BASE, URI.LOL_LEAGUE_CHALLENGER_LEAGUES);
    
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, LeagueListDTO.class);
    }

    @Override
    public LeagueEntryDTO[] getEntriesBySummonerId(String summonerId) {
        final String uri = createURI(summonerId, URI.EUW_BASE, URI.LOL_LEAGUE_ENTRIES_BY_SUMMONER);
    
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, LeagueEntryDTO[].class);
    }

    @Override
    public LeagueEntryDTO[] getEntriesByQueueTierDivision(String queue, String tier, String division) {
        final String uri = createURI(queue + "/" + tier + "/" + division, URI.EUW_BASE, URI.LOL_LEAGUE_CHOSEN_LEAGUES);
    
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, LeagueEntryDTO[].class);
    }
    
    @Override
    public LeagueListDTO getGrandMasterLeaguesByQueue(String queue) {
        final String uri = createURI(queue, URI.EUW_BASE, URI.LOL_LEAGUE_GRANDMASTER_LEAGUES);
    
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, LeagueListDTO.class);
    }
    
    @Override
    public LeagueListDTO getLeagueByLeagueId(String leagueId) {
        final String uri = createURI(leagueId, URI.EUW_BASE, URI.LOL_LEAGUE_ENTRIES_ALL);
    
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, LeagueListDTO.class);
    }
    
    @Override
    public LeagueListDTO getMasterLeaguesByQueue(String queue) {
        final String uri = createURI(queue, URI.EUW_BASE, URI.LOL_LEAGUE_MASTER_LEAGUES);
    
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, LeagueListDTO.class);
    }
}
