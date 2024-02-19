package Øvelse;

import java.util.Date;

public class Ticket2 {
    private String eventName;
    private boolean isUsed;

    public Ticket2(String eventName, boolean isUsed) {
        this.eventName = eventName;
        this.isUsed = isUsed;
    }

    public void useTicket() throws Exception {
        if (isUsed) {
            throw new Exception("Ticket is already used");
        }
        this.isUsed = true;
        System.out.println("Ticket used for event: " + eventName);
    }

    public static void main(String[] args) {
        Ticket2 [] tickets = new Ticket2[4];
        tickets[0] = new Ticket2("lort", false);
        tickets[1] = new Ticket2("lort", true);
        tickets[2] = new Ticket2("lort", false);
        tickets[3] = new Ticket2("lort", true);

        int numberUsed=0;

        for (Ticket2 lot: tickets) {
            try {
                lot.useTicket();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        for (Ticket2 lort: tickets) {
            if (lort.isUsed) {
                numberUsed++;
            }
        }

        System.out.println(numberUsed);

    }
}

