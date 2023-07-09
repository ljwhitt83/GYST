package com.projectMain.Model;

import Enum.Difficulty;
import Enum.Frequency;
import Util.DateRange;

import java.time.LocalDate;
import java.util.EnumSet;

public class Task {
    private final int taskId;
    private final String taskName;
    private final String taskDescription;
    private final EnumSet<Difficulty> difficulty;
    private final int completed;
    private final EnumSet<Frequency> frequency;
    private final DateRange dateRange;
    //private final LocalDate deadline;
    private final int rewardId;

    public int getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public EnumSet<Difficulty> getDifficulty() {
        return difficulty;
    }

    public int getCompleted() {
        return completed;
    }

    public EnumSet<Frequency> getFrequency() {
        return frequency;
    }

    public DateRange getDateRange() {
        return dateRange;
    }

    public int getRewardId() {
        return rewardId;
    }

    public Task(Builder builder) {
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;;
        this.taskDescription = builder.taskDescription;
        this.difficulty = builder.difficulty;
        this.completed = builder.completed;
        this.frequency = builder.frequency;
        this.dateRange = builder.dateRange;
        this.rewardId = builder.rewardId;
    }

    public static class Builder {
        private int taskId;
        private String taskName;
        private String taskDescription;
        private EnumSet<Difficulty> difficulty = EnumSet.noneOf(Difficulty.class);
        private int completed;
        private EnumSet<Frequency> frequency = EnumSet.noneOf(Frequency.class);
        private DateRange dateRange;
        //private LocalDate deadline;
        private int rewardId;

        public Builder setTaskId(int taskId) {
            this.taskId = taskId;
            return this;
        }
        public Builder setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public Builder setTaskDescription(String taskDescription) {
            this.taskDescription = taskDescription;
            return this;
        }
        public Builder setDifficulty(Difficulty difficulty) {
            this.difficulty.add(difficulty);
            return this;
        }
        public Builder setCompleted(int completed) {
            this.completed = completed;
            return this;
        }
        public Builder setFrequency(Frequency frequency) {
            this.frequency.add(frequency);
            return this;
        }
        public Builder setDateRange(LocalDate startDate, LocalDate endDate) {
            this.dateRange = new DateRange(startDate, endDate);
            return this;
        }
        public Builder setRewardId(int rewardId) {
            this.rewardId = rewardId;
            return this;
        }
        public Task build() {
            return new Task(this);
        }
    }
}
