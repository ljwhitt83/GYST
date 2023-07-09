package com.projectMain.Model;

import java.util.List;

public class Campaign {
    private int campaignId;
    private String name;
    private List<Integer> questIds;

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getQuests() {
        return questIds;
    }

    public void setQuests(List<Integer> quests) {
        this.questIds = quests;
    }
}
