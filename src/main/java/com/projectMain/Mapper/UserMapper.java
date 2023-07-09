package com.projectMain.Mapper;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.projectMain.Model.User;

@DynamoDBTable(tableName = "Users")
public class UserMapper {

    private DynamoDBMapper mapper;

    public UserMapper(DynamoDBMapper mapper) {
       this.mapper = mapper;
    }

    public void saveUser(User user) {
        DynamoDBSaveExpression saveExpression = new DynamoDBSaveExpression();
        mapper.save(user);
    }
    public User get(int userId) {
        return mapper.load(User.class, userId);
    }

    public void delete(User user) {
        mapper.delete(user);
    }
}

