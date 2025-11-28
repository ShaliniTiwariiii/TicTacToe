package org.example.tictactoe.ParkingLotManagement.Controllers;

public class IssueTicketRequest {
    private String licensePlateNumber;
    private String ownerName;
    private int geteId;

    public IssueTicketRequest(String licensePlateNumber, String ownerName, int geteId) {
        this.licensePlateNumber = licensePlateNumber;
        this.ownerName = ownerName;
        this.geteId = geteId;
    }
    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getGeteId() {
        return geteId;
    }

    public void setGeteId(int geteId) {
        this.geteId = geteId;
    }
}
