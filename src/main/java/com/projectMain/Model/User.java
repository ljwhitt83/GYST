package com.projectMain.Model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.ArrayList;
import java.util.List;

@DynamoDBTable(tableName = "Users")
public class User {

    @DynamoDBHashKey(attributeName = "userId")
    private int userId;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private List<Integer> friendIds;
    private int avatarId;

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Integer> getFriendIds() {
        return friendIds;
    }

    public int getAvatarId() {
        return avatarId;
    }

    public static class Builder {
        private int userId;
        private String userName;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private List<Integer> friendIds = new ArrayList<>();
        private int avatarId;

        public Builder setUserId( int userId) {
            this.userId = userId;
            return this;
        }
        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }
        public Builder addFriendIds(Integer friendId) {
            if (friendId == null || friendId.toString().isEmpty()) {
                friendId = 0;
            }
            this.friendIds.add(friendId);
            return this;
        }
        public Builder setAvatarId(int avatarId) {
            this.avatarId = avatarId;
            return this;
        }

        public User build() {
            return new User();
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", friendIds=" + friendIds +
                ", avatarId=" + avatarId +
                '}';
    }
}
