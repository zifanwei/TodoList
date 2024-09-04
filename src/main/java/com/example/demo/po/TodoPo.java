package com.example.demo.po;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;

import java.util.Date;

@Data
public class TodoPo {

    private String id;

    @Column("created_time")
    private Date createdTime;

    private Date deadline;
    private String content;
    private boolean isDone;
    private String priority;

    public TodoPo() {}

    public TodoPo(String id, Date createdTime,
                  Date deadline, String content,
                  boolean isDone, String priority) {
        this.id = id;
        this.createdTime = createdTime;
        this.deadline = deadline;
        this.content = content;
        this.isDone = isDone;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
