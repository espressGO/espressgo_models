package models;

import org.bson.types.ObjectId;

import java.time.ZonedDateTime;
import java.util.Date;

public class Message {
    public String userEmail;
    public ObjectId shopId;
    public ObjectId drinkId;
    public String comment;
    public Integer rating;
    private ZonedDateTime messageSent;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public ObjectId getShopId() {
        return shopId;
    }

    public void setShopId(ObjectId shopId) {
        this.shopId = shopId;
    }

    public ObjectId getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(ObjectId drinkId) {
        this.drinkId = drinkId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public ZonedDateTime getMessageSent() {
        return messageSent;
    }

    public void setMessageSent(ZonedDateTime messageSent) {
        this.messageSent = messageSent;
    }
}

