package com.company;

public class Image {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return image.getName().equals(this.getName());
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }
}
