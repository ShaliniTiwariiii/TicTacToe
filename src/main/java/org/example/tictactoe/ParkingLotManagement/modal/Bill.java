package org.example.tictactoe.ParkingLotManagement.modal;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModal {
    private Ticket ticket;
    private Operator operator;
    private Gate exitGate;
    private int amount;
    private Date exitTime;
    private List<Payment> payments;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Gate getGate() {
        return exitGate;
    }

    public void setGate(Gate gate) {
        this.exitGate = gate;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
