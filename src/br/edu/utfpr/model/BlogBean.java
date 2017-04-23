package br.edu.utfpr.model;

import br.edu.utfpr.model.DB.BlogDAO;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.Date;

public class BlogBean implements Serializable{

    private String title;
    private String content;
    private Date date;
    private BlogDAO blogDAO;

    public BlogBean(String title, String content) throws SQLException {
        setTitle(title);
        setContent(content);
        setDate();
    }

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

    public Date getDate() {
        return date;
    }

    private void setDate() {
        this.date = new Date();
    }
}
