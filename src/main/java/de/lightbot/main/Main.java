package de.lightbot.main;

import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;

public class Main {

    public static void main(String[] args) {

        final TS3Config config = new TS3Config();
        config.setHost("116.202.129.62");
        config.setFloodRate(TS3Query.FloodRate.UNLIMITED);

        final TS3Query query = new TS3Query(config);
        query.connect();

        final TS3Api api = query.getApi();
        api.login("lightBot", "GKiBQOvf");
        api.selectVirtualServerByPort(9987);
        //api.setNickname("lightBot");



        System.out.println("Hello world!");
    }
}