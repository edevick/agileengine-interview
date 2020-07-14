package com.agileengine.agileengineinterview.model;

public class ImageDetail {

    private String id;
    private String author;
    private String camera;
    private String tags;
    private String cropped_picture;
    private String full_picture;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(final String camera) {
        this.camera = camera;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(final String tags) {
        this.tags = tags;
    }

    public String getCropped_picture() {
        return cropped_picture;
    }

    public void setCropped_picture(final String cropped_picture) {
        this.cropped_picture = cropped_picture;
    }

    public String getFull_picture() {
        return full_picture;
    }

    public void setFull_picture(final String full_picture) {
        this.full_picture = full_picture;
    }
}
