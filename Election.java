
interface MachineOperations {

    void startOperation();

    void endOperation();
};

abstract class VotingMachine implements MachineOperations {

    int machineID;
    String location;

    public VotingMachine(int machineID, String location) {
        this.machineID = machineID;
        this.location = location;
    }

    @Override
    public void startOperation() {
        System.out.println("Voting Machine started");
    }

    @Override
    public void endOperation() {
        System.out.println("Voting Machine Ended");
    }

    void showMachineInfo() {
        System.out.println("Machine ID: " + machineID);
        System.out.println("Location: " + location);
    }
}

class EVM extends VotingMachine {

    int batteryLevel;

    public EVM(int batteryLevel, int machineID, String location) {
        super(machineID, location);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void startOperation() {
        System.out.println("EVM Voting Machine started");
    }

    @Override
    public void endOperation() {
        System.out.println("EVM Voting Machine Ended");
    }

    @Override
    void showMachineInfo() {
        System.out.println("EVM Machine Details");
        System.out.println("EVM Machine ID: " + machineID);
        System.out.println("EVM Machine Locaton: " + location);
        System.out.println("EVM Machine Batter level: " + batteryLevel);
    }
}

class BVM extends VotingMachine {

    int batteryCapacity;

    public BVM(int batteryCapacity, int machineID, String location) {
        super(machineID, location);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void startOperation() {
        System.out.println("BVM Voting Machine started");
    }

    @Override
    public void endOperation() {
        System.out.println("BVM Voting Machine Ended");
    }

    @Override
    void showMachineInfo() {
        System.out.println("BVM Machine Details");
        System.out.println("BVM Machine ID: " + machineID);
        System.out.println("BVM Machine Locaton: " + location);
        System.out.println("BVM Machine Battery Capacity: " + batteryCapacity);
    }
}

public class Election {

    public static void main(String[] args) {
        VotingMachine evm = new EVM(85, 120, "Jashore");
        VotingMachine bvm = new BVM(4559, 101, "Khulna");
        evm.startOperation();
        evm.showMachineInfo();
        evm.endOperation();
        bvm.startOperation();
        bvm.showMachineInfo();
        bvm.endOperation();
    }
}

// ........................................
// ...............................Trying new system
// interface MachineOperations {
//     void startOperation();
//     void endOperation();
// };
// abstract class VotingMachine implements MachineOperations {
//     int machineID;
//     String location;
//     public VotingMachine(int machineID, String location) {
//         this.machineID = machineID;
//         this.location = location;
//     }
//     abstract void votingPrint();
//     @Override
//     public void startOperation() {
//         System.out.println("Voting Machine started");
//     }
//     @Override
//     public void endOperation() {
//         System.out.println("Voting Machine Ended");
//     }
//     void showMachineInfo() {
//         System.out.println("Machine ID: " + machineID);
//         System.out.println("Location: " + location);
//     }
// }
// class EVM extends VotingMachine {
//     int batteryLevel;
//     public EVM(int batteryLevel, int machineID, String location) {
//         super(machineID, location);
//         this.batteryLevel = batteryLevel;
//     }
//     @Override
//     public void startOperation() {
//         System.out.println("EVM Voting Machine started");
//     }
//     @Override
//     public void endOperation() {
//         System.out.println("EVM Voting Machine Ended");
//     }
//     // @Override
//     // void showMachineInfo() {
//     //     System.out.println("EVM Machine Details");
//     //     System.out.println("EVM Machine ID: " + machineID);
//     //     System.out.println("EVM Machine Locaton: " + location);
//     //     System.out.println("EVM Machine Batter level: " + batteryLevel);
//     // }
//     @Override
//     void votingPrint() {
//         System.out.println("EVM Batter Level: " + batteryLevel);
//     }
// }
// class BVM extends VotingMachine {
//     int batteryCapacity;
//     public BVM(int batteryCapacity, int machineID, String location) {
//         super(machineID, location);
//         this.batteryCapacity = batteryCapacity;
//     }
//     @Override
//     public void startOperation() {
//         System.out.println("BVM Voting Machine started");
//     }
//     @Override
//     public void endOperation() {
//         System.out.println("BVM Voting Machine Ended");
//     }
//     // @Override
//     // void showMachineInfo() {
//     //     System.out.println("BVM Machine Details");
//     //     System.out.println("BVM Machine ID: " + machineID);
//     //     System.out.println("BVM Machine Locaton: " + location);
//     //     System.out.println("BVM Machine Battery Capacity: " + batteryCapacity);
//     // }
//     @Override
//     void votingPrint() {
//         System.out.println("BVM Batter Level: " + batteryCapacity);
//     }
// }
// public class Election {
//     public static void main(String[] args) {
//         VotingMachine evm = new EVM(85, 120, "Jashore");
//         VotingMachine bvm = new BVM(4559, 101, "Khulna");
//         evm.startOperation();
//         evm.showMachineInfo();
//         evm.votingPrint();
//         evm.endOperation();
//         bvm.startOperation();
//         bvm.showMachineInfo();
//         bvm.votingPrint();
//         bvm.endOperation();
//     }
// }
