package com.springMongoStarter.springMongo.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "legosets")
@JsonIgnoreProperties(ignoreUnknown = true)
public class LegoSet {
    @Id
    private String id;

    private String name;

    @Indexed(direction = IndexDirection.ASCENDING)
    private String theme;

    private LegoSetDifficulty legoSetDifficulty;

    private List<ProductReview> reviews;

    @Field("delivery")
    private DeliveryInfo deliveryInfo;

    @Transient
    private Integer noOfParts;
}