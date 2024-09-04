package com.example.demo.model;

import java.util.Date;

public class TodoDto {
    private String todoId;
    private Date createdTime;
    private String content;
    private Date deadLine;
    private boolean isDone;
    private String priority;

    public TodoDto(String todoId, Date createdTime, String content, Date deadLine, boolean isDone, String priority) {
        this.todoId = todoId;
        this.createdTime = createdTime;
        this.content = content;
        this.deadLine = deadLine;
        this.isDone = isDone;
        this.priority = priority;
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

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
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
