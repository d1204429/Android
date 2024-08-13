package com.example.webexamsimulation;

public class Todo {
    // 成員變數，用來儲存待辦事項的標題與內容
    private String title;



    private String content;

    // 建構子，用來初始化待辦事項的標題與內容
    public Todo(String title, String content) {
        this.title = title;
        this.content = content;
    }

    //get與set的方法
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
