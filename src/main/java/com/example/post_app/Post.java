package com.example.post_app;

public class Post {
    String id;

    public Post(String id, String userId, String url, String title, String body) {
        this.id = id;
        this.userId = userId;
        this.url = url;
        this.title = title;
        this.body = body;
    }

   private String userId;
   private String url;
   private String title;
   private String body;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
