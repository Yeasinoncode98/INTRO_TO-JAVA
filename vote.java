
abstract class Candidate {

    int candidateID;
    String candidateName;
    String party;

    public Candidate(int candidateID, String candidateName, String party) {
        this.candidateID = candidateID;
        this.candidateName = candidateName;
        this.party = party;
    }

    abstract void displayInfo();

    void showBasicInfo() {
        System.out.println("Candidate ID: " + candidateID);
        System.out.println("Candidate Name: " + candidateName);
    }
}

class LocalCandidate extends Candidate {

    String consitituency;

    public LocalCandidate(String consitituency, int candidateID, String candidateName, String party) {
        super(candidateID, candidateName, party);
        this.consitituency = consitituency;
    }

    @Override
    void displayInfo() {
        System.out.println("Local Candidate Details");
        System.out.println("Local Candidate ID: " + candidateID);
        System.out.println("Local Candidate Name: " + candidateName);
        System.out.println("Local Candidate Party: " + party);
        System.out.println("Local Candidate Consitituency : " + consitituency);
    }
}

class NationalCandidate extends Candidate {

    String region;

    public NationalCandidate(String region, int candidateID, String candidateName, String party) {
        super(candidateID, candidateName, party);
        this.region = region;
    }

    @Override
    void displayInfo() {
        System.out.println("Nationa; Candidate Details");
        System.out.println("National Candidate ID: " + candidateID);
        System.out.println("National Candidate Name: " + candidateName);
        System.out.println("National Candidate Party: " + party);
        System.out.println("National Candidate Region: " + region);
    }

}

public class vote {

    public static void main(String[] args) {
        Candidate local = new LocalCandidate("Jashore", 110, "Yeasin", "AwamiLeague");
        Candidate national = new NationalCandidate("Khulna", 220, "Arafat", "BNP");

        local.showBasicInfo();
        local.displayInfo();
        national.showBasicInfo();
        national.displayInfo();

    }
}
