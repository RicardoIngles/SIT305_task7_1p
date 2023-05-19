package com.example.lostandfoundapp.model;

public class Advertisement {
    private int advert_id;
    private String selectedOption, name, phone, description, date, location;
    public Advertisement(String selectedOption, String name, String phone, String description, String date, String location) {
        this.selectedOption = selectedOption;
        this.name = name;
        this.phone = phone;
        this.description = description;
        this.date = date;
        this.location = location;
    }
    public Advertisement() {}
    public int getAdvert_id() {
        return advert_id;
    }
    public void setAdvert_id(int user_id) {
        this.advert_id = advert_id;
    }
    public String getSelectedOption() {
        return selectedOption;
    }
    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() { return phone; }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getDescription() { return description; }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDate() { return date; }
    public void setDate(String date) {
        this.date = date;
    }
    public String getLocation() { return location; }
    public void setLocation(String location) {
        this.location = location;
    }
}