package com.example.demo.model;

import java.util.Date;

public class TodoDto {
    private String todoId;
    private Date createdTime;
    private String content;
    private Date deadline;
    private boolean isDone;
    private String priority;
    private String userId;

    public TodoDto(String todoId, Date createdTime, String content,
                   Date deadline, boolean isDone, String priority,
                   String userId) {
        this.todoId = todoId;
        this.createdTime = createdTime;
        this.content = content;
        this.deadline = deadline;
        this.isDone = isDone;
        this.priority = priority;
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTodoId() {
        return todoId;
    }

    public void setTodoId(String todoId) {
        this.todoId = todoId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
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
