package CodeWars;

public class HandShakeProblem {
    public static void main(String[] args) {
        System.out.println(GetParticipants(10));
    }

    public static int GetParticipants(int handshakes) {
        int participants = 1;
        int totalHandshakes = 0;

        while (totalHandshakes < handshakes) {
            totalHandshakes += participants - 1;
            System.out.println("Total Handshakes: "+ totalHandshakes);
            participants++;
            System.out.println("Participant: " + participants);
        }

        return participants - 1;
    }
}
