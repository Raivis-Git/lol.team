package lol.team.integration.process.v4;

import lol.team.constants.URI;
import lol.team.integration.DTO.PlatformDataDTO;
import lol.team.integration.process.Status;
import org.springframework.web.client.RestTemplate;

import static lol.team.utils.IntegrationProcessUtils.createURI;

public class StatusV4 extends Status {
    
    public PlatformDataDTO getStatus()
    {
        final String uri = createURI(null, URI.EUW_BASE, URI.LOL_STATUS_V4_URI);
        
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, PlatformDataDTO.class);
    }
    
}
