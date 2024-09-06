package com.example.demo.model;

import com.example.demo.po.TodoPo;
import com.example.demo.util.CommonUtil;

import java.util.Date;

public class TodoDto {
    private String todoId;
    private Date createdTime;
    private Date deadline;
    private String content;
    private boolean isDone;
    private String priority;
    private String userId;

    public TodoDto(String todoId, Date createdTime, Date deadline,
                   String content, boolean isDone, String priority,
                   String userId) {
        this.todoId = todoId;
        this.createdTime = createdTime;
        this.deadline = deadline;
        this.content = content;
        this.isDone = isDone;
        this.priority = priority;
        this.userId = userId;
    }

    public void initialise() {
        this.todoId = CommonUtil.getUUID32();
        this.createdTime = new Date();
        this.isDone = false;
    }

    public TodoPo toTodoPo() {
        return new TodoPo(
                this.todoId,
                this.createdTime,
                this.deadline,
                this.content,
                this.isDone,
                this.priority,
                this.userId
        );
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
