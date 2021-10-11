package com.zelinska.hello_world.model;


public class ToDoList {

    private Long id;
    private String title;
    private boolean done;

    public ToDoList() {
    }

    public ToDoList(Long id, String title, boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
