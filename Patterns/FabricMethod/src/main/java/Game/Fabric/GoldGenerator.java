package Game.Fabric;

import Game.Interfaces.iGameItem;
import Game.Product.GoldReward;

public class GoldGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new GoldReward();
    }

}