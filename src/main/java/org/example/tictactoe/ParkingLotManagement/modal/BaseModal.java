package org.example.tictactoe.ParkingLotManagement.modal;

import java.util.Date;

public abstract class BaseModal {
    private Long id;
    private Date createdAt;
    private Date updatedAt;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {

    }
}
