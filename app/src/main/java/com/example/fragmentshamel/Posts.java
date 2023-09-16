package com.example.fragmentshamel;

public class Posts {
    String image;
    String type;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Posts(String image, String type) {
        this.image = image;
        this.type = type;
    }
}
