package org.example.tictactoe.ParkingLotManagement.modal;

import java.util.HashMap;
import java.util.List;

public class ParkingLot extends BaseModal {
    private List<Gate>entryGate;
    private List<Gate> exitGate;
    private ParkingLotStatus parkingLotStatus;
    private List<ParkingFloor> parkingfloors;
    private HashMap<VehicleType,Integer> allowedVehicleTypes;

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<Gate> getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(List<Gate> entryGate) {
        this.entryGate = entryGate;
    }



    public List<ParkingFloor> getParkingfloors() {
        return parkingfloors;
    }

    public void setParkingfloors(List<ParkingFloor> parkingfloors) {
        this.parkingfloors = parkingfloors;
    }
}
