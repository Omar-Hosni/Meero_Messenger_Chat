package com.meero.meeromessengerchat.Models;

public class MessageModel {
    String uId, message , messageId;
    Long timespan;


    public MessageModel(String uId, String message, Long timespan){
        this.uId = uId;
        this.message = message;
        this.timespan = timespan;
    }

    public MessageModel(String uId, String message){
        this.uId = uId;
        this.message = message;
    }

    public MessageModel(){}

    public String getMessageId(){
        return messageId;
    }

    public void setMessageId(String messageId){
        this.messageId = messageId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimespan() {
        return timespan;
    }

    public void setTimespan(Long timespan) {
        this.timespan = timespan;
    }
}
