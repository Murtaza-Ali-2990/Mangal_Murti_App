package com.example.mangal_murti_app;

public class ImageAndDescDataStorage {
    private String image, desc;

    public ImageAndDescDataStorage() {}

    public ImageAndDescDataStorage(String image, String desc) {
        this.image = image;
        this.desc = desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public String getDesc() {
        return desc;
    }
}
