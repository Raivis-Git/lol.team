package lol.team.controller.rest;

import lol.team.integration.process.Summoner;
import lol.team.integration.process.v4.SummonerV4;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SummonerController {
    
    private static final Summoner summoner = new SummonerV4();
    
    @GetMapping(path = "/v4/summoner")
    public Object summoner(@RequestParam(value = "summonerName", defaultValue = "") String summonerName) {
        return summoner.getSummonerBySummonerName(summonerName);
    }
}
