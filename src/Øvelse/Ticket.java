package Øvelse;

import java.time.LocalDate;

public class Ticket {
    String eventName;
    String date;
    boolean isUsed;

    public Ticket(String eventName, String date) {
        this.eventName = eventName;
        this.date = date;
        this.isUsed = false;
    }
    public boolean getIsUsed() {
        return isUsed;
    }

public void useTicket () throws Exception {
    if (isUsed) {
        throw new Exception("Billetten er allerede brugt");
    }
     isUsed = true;
}


    public static void main(String[] args) throws Exception {
        Ticket [] tickets = new Ticket[5];
        tickets [0] = new Ticket("Koncert", "2024-01-12");
        tickets [1] = new Ticket("fodbold", "2024-01-12");
        tickets [2] = new Ticket("tivoli", "2024-01-12");
        tickets [3] = new Ticket("dav", "2024-01-12");
        tickets [4] = new Ticket("hej", "2024-01-12");


        try {
            tickets[0].useTicket();
            tickets[1].useTicket();
            tickets[2].useTicket();
            tickets[3].useTicket();
            tickets[4].useTicket();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        int usedTicketCount = 0;
        for (Ticket tick: tickets) {
            if (tick!=null && tick.getIsUsed()) {
                usedTicketCount++;
            }
        }
        System.out.println("Brugte billetter" + usedTicketCount);
    }
}

