package org.example.tictactoe.ParkingLotManagement.modal;

public class Gate extends BaseModal {
    private String getNumber;
    private GateStatus gateStatus;
    private Operator currentOperator;

    public String getGetNumber() {
        return getNumber;
    }

    public void setGetNumber(String getNumber) {
        this.getNumber = getNumber;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public Operator getCurrentOperator() {
        return currentOperator;
    }

    public void setCurrentOperator(Operator currentOperator) {
        this.currentOperator = currentOperator;
    }
}
