
interface MachineOperations {

    void startOperation();

    void endOperation();
}

abstract class VotingMachine implements MachineOperations {

    int machineID;
    String location;

    VotingMachine(int machineID, String location) {
        this.machineID = machineID;
        this.location = location;
    }

    @Override
    public void startOperation() {
        System.out.println("Voting machine starting");
    }

    @Override
    public void endOperation() {
        System.out.println("voting machine ended");
    }

    void showMachineInfo() {
        System.out.println("Machine ID: " + machineID);
        System.out.println("Machine Location: " + location);
    }
}

class EVM extends VotingMachine {

    double batteryLevel;

    public EVM(double batteryLevel, int machineID, String location) {
        super(machineID, location);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void startOperation() {
        System.out.println("EVM STARTED");
    }

    @Override
    public void endOperation() {
        System.out.println("EVM ENDED");
    }

    @Override
    void showMachineInfo() {
        System.out.println("EVM MACHINE ID: " + machineID);
        System.out.println("EVM MACHINE LOCATION: " + location);
        System.out.println("EVM BATTERY LEVEL: " + batteryLevel);
    }
}

class BVM extends VotingMachine {

    double batteryCapacity;

    public BVM(double batteryCapacity, int machineID, String location) {
        super(machineID, location);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void startOperation() {
        System.out.println("BVM STARTED");
    }

    @Override
    public void endOperation() {
        System.out.println("BVM ENDED");
    }

    @Override
    void showMachineInfo() {
        System.out.println("BVM MACHINE ID: " + machineID);
        System.out.println("BVM MACHINE LOCATION: " + location);
        System.out.println("BVM BATTERY LEVEL: " + batteryCapacity);
    }
}

public class DoingVote {

    public static void main(String[] args) {
        VotingMachine evm = new EVM(100, 101, "khulna");
        VotingMachine bvm = new BVM(78, 102, "Jashore");
        evm.startOperation();
        evm.showMachineInfo();
        evm.endOperation();
        bvm.startOperation();
        bvm.showMachineInfo();
        bvm.endOperation();
    }
}

// .................. Using Abstract method 
// interface MachineOperations {
//     void startOperation();
//     void endOperation();
// }
// abstract class VotingMachine implements MachineOperations {
//     int machineID;
//     String location;
//     VotingMachine(int machineID, String location) {
//         this.machineID = machineID;
//         this.location = location;
//     }
//     abstract void votingPrint();
//     @Override
//     public void startOperation() {
//         System.out.println("Voting machine starting");
//     }
//     @Override
//     public void endOperation() {
//         System.out.println("voting machine ended");
//     }
//     void showMachineInfo() {
//         System.out.println("Machine ID: " + machineID);
//         System.out.println("Machine Location: " + location);
//     }
// }
// class EVM extends VotingMachine {
//     double batteryLevel;
//     public EVM(double batteryLevel, int machineID, String location) {
//         super(machineID, location);
//         this.batteryLevel = batteryLevel;
//     }
//     @Override
//     public void startOperation() {
//         System.out.println("EVM STARTED");
//     }
//     @Override
//     public void endOperation() {
//         System.out.println("EVM ENDED");
//     }
//     @Override
//     void votingPrint() {
//         // super.showMachineInfo();
//         System.out.println("Battery Level: " + batteryLevel);
//     }
// }
// class BVM extends VotingMachine {
//     double batteryCapacity;
//     public BVM(double batteryCapacity, int machineID, String location) {
//         super(machineID, location);
//         this.batteryCapacity = batteryCapacity;
//     }
//     @Override
//     public void startOperation() {
//         System.out.println("BVM STARTED");
//     }
//     @Override
//     public void endOperation() {
//         System.out.println("BVM ENDED");
//     }
//     @Override
//     void votingPrint() {
//         // super.showMachineInfo();
//         System.out.println("Battery capacity: " + batteryCapacity);
//     }
// }
// public class DoingVote {
//     public static void main(String[] args) {
//         VotingMachine evm = new EVM(100, 101, "khulna");
//         VotingMachine bvm = new BVM(78, 102, "Jashore");
//         evm.startOperation();
//         evm.showMachineInfo();
//         evm.votingPrint();
//         evm.endOperation();
//         System.out.println("----------------------");
//         bvm.startOperation();
//         bvm.showMachineInfo();
//         bvm.votingPrint();
//         bvm.endOperation();
//     }
// }
