package com.digitalinnovationone.heroesapi.config;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;

import static com.digitalinnovationone.heroesapi.constants.HeroConstant.ENDPOINT_DYNAMO;
import static com.digitalinnovationone.heroesapi.constants.HeroConstant.REGION_DYNAMO;

public class HeroesData {

    public static void main(String[] args) {
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(ENDPOINT_DYNAMO, REGION_DYNAMO))
                .build();
        DynamoDB dynamoDB = new DynamoDB(client);

        Table table = dynamoDB.getTable("Heroes_Table");

        Item hero = new Item()
                .withPrimaryKey("id", "1")
                .withString("name", "Batman")
                .withString("universe", "dc comics")
                .withNumber("films", 7);

        Item hero2 = new Item()
                .withPrimaryKey("id", "2")
                .withString("name", "Spider-man")
                .withString("universe", "marvel")
                .withNumber("films", 8);

        Item hero3 = new Item()
                .withPrimaryKey("id", "3")
                .withString("name", "Goku")
                .withString("universe", "DragonBall")
                .withNumber("films", 4);

        Item hero4 = new Item()
                .withPrimaryKey("id", "4")
                .withString("name", "Spawn")
                .withString("universe", "McFarlane")
                .withNumber("films", 1);

        PutItemOutcome outcome1 = table.putItem(hero);
        PutItemOutcome outcome2 = table.putItem(hero2);
        PutItemOutcome outcome3 = table.putItem(hero3);
        PutItemOutcome outcome4 = table.putItem(hero4);



    }
}
