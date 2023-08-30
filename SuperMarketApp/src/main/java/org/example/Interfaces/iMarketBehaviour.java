package org.example.Interfaces;

import java.util.List;

import org.example.Classes.Actor;

public interface iMarketBehaviour {

    void acceptToMarket(iActorBehaviour actor);

    void releaseFromMarket(List<Actor> actors);

    void update();
}