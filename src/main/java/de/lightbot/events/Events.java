package de.lightbot.events;

import com.github.theholywaffle.teamspeak3.api.event.*;
import com.github.theholywaffle.teamspeak3.api.wrapper.Client;
import de.lightbot.api.QueryManager;


public class Events {

    public void loadEvents() {

        QueryManager.api.registerAllEvents();
        System.out.println("Alle Events registriert!");
        QueryManager.api.addTS3Listeners(new TS3Listener() {
            @Override
            public void onTextMessage(TextMessageEvent textMessageEvent) {

            }

            @Override
            public void onClientJoin(ClientJoinEvent clientJoinEvent) {

                Client client = QueryManager.api.getClientInfo(clientJoinEvent.getClientId());

                if(client == null) {
                    return;
                }

                if(client.getUniqueIdentifier().equalsIgnoreCase("Nk/+so7FqTCx4RbHHfmpkLAcCcY=")) {
                    System.out.println("Willkommen " + client.getNickname() + " auf dem OCB Teamspeak");
                } else {
                    System.out.println("Unbekannter User!");
                }

            }

            @Override
            public void onClientLeave(ClientLeaveEvent clientLeaveEvent) {

            }

            @Override
            public void onServerEdit(ServerEditedEvent serverEditedEvent) {

            }

            @Override
            public void onChannelEdit(ChannelEditedEvent channelEditedEvent) {

            }

            @Override
            public void onChannelDescriptionChanged(ChannelDescriptionEditedEvent channelDescriptionEditedEvent) {

            }

            @Override
            public void onClientMoved(ClientMovedEvent clientMovedEvent) {

            }

            @Override
            public void onChannelCreate(ChannelCreateEvent channelCreateEvent) {

            }

            @Override
            public void onChannelDeleted(ChannelDeletedEvent channelDeletedEvent) {

            }

            @Override
            public void onChannelMoved(ChannelMovedEvent channelMovedEvent) {

            }

            @Override
            public void onChannelPasswordChanged(ChannelPasswordChangedEvent channelPasswordChangedEvent) {

            }

            @Override
            public void onPrivilegeKeyUsed(PrivilegeKeyUsedEvent privilegeKeyUsedEvent) {

            }
        });

        System.out.println("Das hat funktioniert !");
    }
}
