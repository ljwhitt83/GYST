package com.projectMain.Model;

import java.util.LinkedList;
import java.util.List;

public class Reward {
    private final int rewardId;
    private final String rewardName;
    private final String description;
    private final int rewardCurrency;
    private final int experience;
    private final List<Integer> itemIds;

    private Reward(Builder builder) {
        this.rewardId = builder.rewardId;
        this.rewardName = builder.rewardName;
        this.description = builder.description;
        this.rewardCurrency = builder.rewardCurrency;
        this.experience = builder.experience;
        this.itemIds = new LinkedList<>();
    }

    public int getRewardId() {
        return rewardId;
    }

    public String getRewardName() {
        return rewardName;
    }

    public String getDescription() {
        return description;
    }

    public int getRewardCurrency() {
        return rewardCurrency;
    }

    public int getExperience() {
        return experience;
    }

    public List<Integer> getItemIds() {
        return itemIds;
    }

    public static class Builder{
        private int rewardId;
        private String rewardName;
        private String description;
        private int rewardCurrency;
        private int experience;
        private List<Integer> itemIds ;

        public static Builder rewardBuilder() {
            return new Builder();
        }
        public Builder setRewardId(int rewardId) {
            this.rewardId = rewardId;
            return this;
        }
        public Builder setRewardName(String rewardName) {
            this.rewardName = rewardName;
            return this;
        }
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }
        public Builder setRewardCurrency(int rewardCurrency) {
            this.rewardCurrency = rewardCurrency;
            return this;
        }
        public Builder setExperience(int experience) {
            this.experience = experience;
            return this;
        }
        public  Builder addItemIds(Integer itemId){
            if (itemId == null || itemId.toString().isEmpty()) {
                throw new IllegalArgumentException("Item id should not be empty");
            }
            this.itemIds.add(itemId);
            return this;
        }

        public Reward build() {
            return new Reward(this);
        }
    }

    @Override
    public String toString() {
        return "Reward{" +
                "rewardId=" + rewardId +
                ", rewardName='" + rewardName + '\'' +
                ", description='" + description + '\'' +
                ", rewardCurrency=" + rewardCurrency +
                ", experience=" + experience +
                ", itemIds=" + itemIds +
                '}';
    }
}
