package com.example.appexam;

public class Todo {
    // 成員變數，用來儲存待辦事項的標題與內容
    private String title;
    private int number;
    private String content;
    private String img;

    // 建構子，用來初始化待辦事項的標題與內容
    public Todo(String title,int number ,String content,String img) {
        this.title = title;
        this.number = number;
        this.content = content;
        this.img = img;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public void setImg(String img) {
        this.img = img;
    }


    public String getImg() {
        return img;
    }


}
