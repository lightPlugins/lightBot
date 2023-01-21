package de.lightbot.main;

import de.lightbot.api.QueryManager;
import de.lightbot.events.Events;

public class Main {

    public static QueryManager queryManager;

    public static void main(String[] args) {

        queryManager = new QueryManager();
        queryManager.connectQuery();

        Events events = new Events();
        events.loadEvents();

        System.out.println("Bot started!");
    }
}