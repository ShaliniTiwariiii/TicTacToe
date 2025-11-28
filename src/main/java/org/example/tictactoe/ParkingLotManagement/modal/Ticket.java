package org.example.tictactoe.ParkingLotManagement.modal;

import org.example.tictactoe.ParkingLotManagement.strategy.FeeCalculationStrategyType;

import java.util.Date;

public class Ticket extends BaseModal {
    private Vehicle vehicle;
    private Date enteryTime;
    private Gate gate;
    private Operator operator;
    private ParkingFloor parkingFloor;
    private ParkingSlot parkingSlot;
    private FeeCalculationStrategyType feeCalculationStrategyType;
}
