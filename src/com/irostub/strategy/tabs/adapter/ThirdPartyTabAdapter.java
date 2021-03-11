package com.irostub.strategy.tabs.adapter;

import com.irostub.strategy.tabs.StrategyInterface;

public class ThirdPartyTabAdapter extends ThirdPartyTab implements StrategyInterface {
    private ThirdPartyTab tab;

    public ThirdPartyTabAdapter(ThirdPartyTab tab) {
        this.tab = tab;
    }

    public void changeTab() {
        tab.selectTab("third party adapter pattern");
    }
}
