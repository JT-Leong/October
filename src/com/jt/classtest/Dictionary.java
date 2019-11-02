package com.jt.classtest;

public class Dictionary extends Book {
    private int pingyinPages;

    public Dictionary(String bookid, String bookname, int pages,int pingyinPages) {
        super(bookid, bookname, pages);
        this.pingyinPages = pingyinPages;
    }

    public int getPingyinPages() {
        return pingyinPages;
    }

    public void setPingyinPages(int pingyinPages) {
        this.pingyinPages = pingyinPages;
    }
}
