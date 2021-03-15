package lol.team.controller.rest;

import lol.team.controller.rest.exception.APIException;
import lol.team.integration.process.League;
import lol.team.integration.process.v4.LeagueV4;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeagueController {
    
    private static final League league = new LeagueV4();
    
    @GetMapping(path = "/v4/challengerLeaguesByQueue")
    public static Object getChallengerLeaguesByQueue(@RequestParam(value = "queue", defaultValue = "") String queue) {
        return league.getChallengerLeaguesByQueue(queue);
    }
    
    @GetMapping(path = "/v4/entriesBySummonerId")
    public Object getEntriesBySummonerId(@RequestParam(value = "summonerId", defaultValue = "") String summonerId) {
        try {
            return league.getEntriesBySummonerId(summonerId);
        } catch (Exception e) {
            return new APIException(HttpStatus.HTTP_VERSION_NOT_SUPPORTED, "Hi", e);
        }
    }
    
    @GetMapping(path = "/v4/entriesByQueueTierDivision")
    public Object getEntriesByQueueTierDivision(@RequestParam(value = "queue", defaultValue = "") String queue,
                                                     @RequestParam(value = "tier", defaultValue = "") String tier,
                                                     @RequestParam(value = "division", defaultValue = "") String division) {
        return league.getEntriesByQueueTierDivision(queue, tier, division);
    }
    
    @GetMapping(path = "/v4/grandMasterLeaguesByQueue")
    public Object getGrandMasterLeaguesByQueue(@RequestParam(value = "queue", defaultValue = "") String queue) {
        return league.getGrandMasterLeaguesByQueue(queue);
    }
    
    @GetMapping(path = "/v4/leagueByLeagueId")
    public Object getLeagueByLeagueId(@RequestParam(value = "leagueId", defaultValue = "") String leagueId) {
        return league.getLeagueByLeagueId(leagueId);
    }
    
    @GetMapping(path = "/v4/masterLeagueByQueue")
    public Object getMasterLeaguesByQueue(@RequestParam(value = "queue", defaultValue = "") String queue) {
        return league.getMasterLeaguesByQueue(queue);
    }
}
