package com.projectMain.Model;

import Util.DateRange;
import Enum.Difficulty;
import Enum.Duration;
import java.time.LocalDate;
import java.util.List;

public class Quest {
    private int questId;
    private String name;
    private List<Integer> taskIds;
    private boolean completed;
    private Difficulty difficulty;
    private Duration duration;
    private DateRange dueDate;
    private LocalDate deadline;
    private int rewardId;

    public int getQuestId() {
        return questId;
    }

    public void setQuestId(int questId) {
        this.questId = questId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getTasks() {
        return taskIds;
    }

    public void setTasks(List<Integer> tasks) {
        this.taskIds = tasks;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public DateRange getDueDate() {
        return dueDate;
    }

    public void setDueDate(DateRange dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public int getRewardId() {
        return rewardId;
    }

    public void setRewardId(int rewardId) {
        this.rewardId = rewardId;
    }
}
