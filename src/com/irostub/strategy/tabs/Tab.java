package com.irostub.strategy.tabs;

import com.irostub.strategy.tabs.StrategyInterface;
import com.irostub.strategy.tabs.TabBlog;

public class Tab {
    private StrategyInterface strategyTab = new TabBlog();

    public void setStrategyTab(StrategyInterface strategyTab) {
        this.strategyTab = strategyTab;
    }

    public void onClick() {
        strategyTab.changeTab();
    }
}
