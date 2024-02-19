package Øvelse;

import java.time.LocalDate;
import java.util.ArrayList;

public class LibraryEvent {
    String eventName;
    LocalDate evenDate;
    ArrayList<Participants> participants = new ArrayList<>();

    public void registerParticipants(Participants p) {
        participants.add(p);
    }

    public void unregisterParticipant(Participants p1) {
        participants.remove(p1);
    }

    public int getParticipantsCount() {

        return participants.size();
    }
}

class Participants {

}
