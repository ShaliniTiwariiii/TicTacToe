package org.example.tictactoe.ParkingLotManagement.Controllers;

import org.example.tictactoe.ParkingLotManagement.Dtos.IssueTicketResponse;
import org.example.tictactoe.ParkingLotManagement.Dtos.ResponseStatus;
import org.example.tictactoe.ParkingLotManagement.Services.TicketService;
import org.example.tictactoe.ParkingLotManagement.modal.Ticket;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponse issueTicket(IssueTicketRequest issueTicketRequest) {
        IssueTicketResponse response= new IssueTicketResponse();
        try {
            Ticket ticket = ticketService.issueTicket();
            response.setTicketId(ticket.getId());
            response.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception ex) {
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setFailureMessage(ex.getMessage());
        }
        return response;
    }
}