package br.com.lelo.springcloud.myeurekaclient.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

public class Message {

    private String title;

    private Date startup;

    @JsonIgnoreProperties
    private int requestCount = 0;

    public Message(String title) {
        this.title = title;
        this.startup = new Date();
    }

    public Message addRequestCount() {
        ++requestCount;
        return this;
    }

    public String getTitle() {
        StringBuilder builder = new StringBuilder();
        builder.append("[").append(requestCount).append("]");
        builder.append(" - ").append(title);
        return builder.toString();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy HH:mm:ss")
    public Date getStartup() {
        return startup;
    }

    public void setStartup(Date startup) {
        this.startup = startup;
    }
}
