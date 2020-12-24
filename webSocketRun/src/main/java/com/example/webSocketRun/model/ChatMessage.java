package com.example.webSocketRun.model;


import org.springframework.beans.factory.annotation.Value;

public class ChatMessage {
    @Value("Welcome")
    private String content;
    private String sender;
    private MessageType message;

    public enum MessageType{
        CHAT, LEAVE, JOIN
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public MessageType getMessage() {
        return message;
    }

    public void setMessage(MessageType message) {
        this.message = message;
    }
}
