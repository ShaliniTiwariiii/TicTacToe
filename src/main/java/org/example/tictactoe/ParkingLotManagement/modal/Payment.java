package org.example.tictactoe.ParkingLotManagement.modal;

import java.util.Date;

public class Payment {
    private Date date;
    private double amount;
    private PaymentStatus paymenStatus;
    private PaymentMode paymentMode;
    private Bill bill;
    private String refNo;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentStatus getPaymenStatus() {
        return paymenStatus;
    }

    public void setPaymenStatus(PaymentStatus paymenStatus) {
        this.paymenStatus = paymenStatus;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }
}
