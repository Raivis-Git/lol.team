package lol.team.utils;

import lol.team.constants.LeagueOfLegends;

public class IntegrationProcessUtils {
    
    public static String createURI(String value, String serverURI, String baseURI) {
        if (value == null)
            value = "";
        
        return String.format(serverURI + baseURI + "?api_key=" + LeagueOfLegends.API_KEY, value);
    }
    
}
