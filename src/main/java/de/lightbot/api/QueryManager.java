package de.lightbot.api;

import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.exception.TS3CommandFailedException;

public class QueryManager {

    public static TS3Config config;
    public static TS3Query query;
    public static TS3Api api;

    public QueryManager() {
        connectQuery();
        System.out.println("Successfull connected to Teamspeak");
    }

    private void setConfig() {
        config = new TS3Config();
    }
    private void setQuery(){
        query = new TS3Query(config);
    }
    private void setApi() {
        api = query.getApi();
    }

    public void connectQuery() {
        setConfig();
        config.setHost("116.202.129.62");
        config.setFloodRate(TS3Query.FloodRate.UNLIMITED);

        try {
            setQuery();
            query.connect();
        } catch (TS3CommandFailedException e) {
            System.out.println("Nickname wurde nicht geändert, da dieser schon vergeben ist!");
        }

        setApi();
        api.login("lightBot", "GKiBQOvf");
        api.selectVirtualServerByPort(9987);
        //api.setNickname("light-Bot");  // Beim ersten Server Start muss der name gesetzt werden.



    }
}
