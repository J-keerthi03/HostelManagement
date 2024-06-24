package com.example.Jwtcrud.model;

import java.util.List;

public class UserSearchCriteria {

    private List<Long> id;
    private List<Integer> roomNo;

    // Getters and setters
    public List<Long> getId() {
        return id;
    }

    public void setId(List<Long> id) {
        this.id = id;
    }

    public List<Integer> getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(List<Integer> roomNo) {
        this.roomNo = roomNo;
    }
}
