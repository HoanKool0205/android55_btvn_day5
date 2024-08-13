package com.androidexp.android55_btvn_day5;

public class Contact {
    private String tvProductName;
    private String price;
    private String size;
    private String color;
    private String cart;
    private String avatar;

    public Contact() {
    }

    public Contact(String tvProductName, String price, String size, String color, String cart, String avatar) {
        this.tvProductName = tvProductName;
        this.price = price;
        this.size = size;
        this.color = color;
        this.cart = cart;
        this.avatar = avatar;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getTvProductName() {
        return tvProductName;
    }

    public void setTvProductName(String tvProductName) {
        this.tvProductName = tvProductName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCart() {
        return cart;
    }

    public void setCart(String cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "tvTitle='" + tvProductName + '\'' +
                ", price='" + price + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", cart='" + cart + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
