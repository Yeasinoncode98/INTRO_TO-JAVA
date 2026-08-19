
abstract class Candidate {

    int candidateId;
    String candidateName;
    String party;

    public Candidate(int candidateId, String candidateName, String party) {
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.party = party;
    }

    abstract void displayInfo();

    void showBasicInfo() {
        System.out.println("candidate Id: " + candidateId);
        System.out.println("Candidate Name: " + candidateName);
    }
}

class LocalCandidate extends Candidate {

    String consitituency;

    public LocalCandidate(String consitituency, int candidateId, String candidateName, String party) {
        super(candidateId, candidateName, party);
        this.consitituency = consitituency;
    }

    @Override
    void displayInfo() {
        System.out.println("Local Candidate Details");
        System.out.println("Local-Candiadte ID: " + candidateId);
        System.out.println("Local-Candidate Name: " + candidateName);
        System.out.println("Local-Candidate Party: " + party);
        System.out.println("Local-Candidate Consitituency: " + consitituency);
    }

}

class NationalCandidate extends Candidate {

    String region;

    public NationalCandidate(String region, int candidateId, String candidateName, String party) {
        super(candidateId, candidateName, party);
        this.region = region;
    }

    @Override
    void displayInfo() {
        System.out.println("National Candidate Details");
        System.out.println("National Candidate ID: " + candidateId);
        System.out.println("National Candidate Name: " + candidateName);
        System.out.println("National Candidate Party: " + party);
        System.out.println("National Candidate Region: " + region);

    }
}

public class Fall24 {

    public static void main(String[] args) {
        Candidate local = new LocalCandidate("jashore", 1020, "Arafat", "BNP");
        Candidate national = new NationalCandidate("Khulna", 1300, "Rafat", "Boat");

        local.showBasicInfo();
        local.displayInfo();

        System.out.println("----------------------");

        national.showBasicInfo();
        national.displayInfo();

    }

}
