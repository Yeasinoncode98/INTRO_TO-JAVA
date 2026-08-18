// interface Notification {
//     void sendNotifications(String message);
// }

// abstract class User {
//     String name;
//     int id;

//     User(String name, int id) {
//         this.name = name;
//         this.id = id;
//     }

//     abstract void accessDigitalCampus();
// }

// class Student extends User implements Notification {

//     Student(String name, int id) {
//         super(name, id);
//     }

//     @Override
//     void accessDigitalCampus() {
//         System.out.println(name + " accessed the campus as a student");
//     }

//     @Override
//     public void sendNotifications(String message) {
//         System.out.println("Student Notification: " + message);
//     }
// }

// class Teacher extends User implements Notification {

//     Teacher(String name, int id) {
//         super(name, id);
//     }

//     @Override
//     void accessDigitalCampus() {
//         System.out.println(name + " accessed the campus as a teacher");
//     }

//     @Override
//     public void sendNotifications(String message) {
//         System.out.println("Teacher Notification: " + message);
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         User student = new Student("Arafat", 101);
//         User teacher = new Teacher("Rahim", 102);

//         student.accessDigitalCampus();
//         teacher.accessDigitalCampus();

//         Notification n1 = new Student("Arafat", 101);
//         Notification n2 = new Teacher("Rahim", 102);

//         n1.sendNotifications("Class Reminder");
//         n2.sendNotifications("Exam Reminder");
//     }
// }


// interface MachineOperations {

//     void startOperation();

//     void endOperation();
// }

// abstract class VotingMachine implements MachineOperations {

//     String machineID;
//     String location;

//     VotingMachine(String machineID, String location) {
//         this.machineID = machineID;
//         this.location = location;
//     }

//     void showMachineInfo() {
//         System.out.println("Machine ID: " + machineID);
//         System.out.println("Location: " + location);

//     }
// }

// class EVM extends VotingMachine {

//     int batteryLevel;

//     EVM(String machineID, String location, int batteryLevel) {
//         super(machineID, location);
//         this.batteryLevel = batteryLevel;
//     }

//     @Override
//     public void startOperation() {
//         System.out.println("EVM voting operation started.");
//     }

//     @Override
//     public void endOperation() {
//         System.out.println("EVM voting operation ended.");
//     }

//     @Override
//     void showMachineInfo(){
//         super.showMachineInfo();
//         System.out.println("Batterly Level: "+batteryLevel);
//     }
// }

// class BVM extends VotingMachine {

//     int ballotCapacity;

//     BVM(String machineID, String location, int ballotCapacity) {
//         super(machineID, location);
//         this.ballotCapacity = ballotCapacity;
//     }

//     @Override
//     public void startOperation() {
//         System.out.println("BVM voting operation started.");
//     }

//     @Override
//     public void endOperation() {
//         System.out.println("BVM voting operation ended.");
//     }
//         @Override
//     void showMachineInfo(){
//         super.showMachineInfo();
//         System.out.println("Ballot capacity: "+ballotCapacity);
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         VotingMachine evm = new EVM("101", "Dhaka", 80);
//         VotingMachine bvm = new BVM("102", "Khulna", 500);

//         evm.startOperation();
//         evm.endOperation();

//         bvm.startOperation();
//         bvm.endOperation();

//         evm.showMachineInfo();
//         bvm.showMachineInfo();
//     }
// }


// ................
// class MyThread extends Thread {

//     public void run() {
//         System.out.println("Thread is running");
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         MyThread t = new MyThread();
//         t.start();
//     }
// }



// class RunnableTo implements  Runnable{
//     public void run(){
//         System.err.println("Runnable is running");
//     }
// }

// public  class Main{
//     public static void main(String[] args) {
//         RunnableTo run = new RunnableTo();

//         Thread thread = new Thread(run);
//         thread.start();
//     }
// }


// class  HelloTask implements Runnable{
//     @Override
//     public void run(){
//         for(int i =0; i<=5;i++){
//             System.out.println("Hello"+i);
//             try{
//                 Thread.sleep(500);
//             }
//             catch(InterruptedException e){
//                 e.printStackTrace();
//             }
//         }
//         }
// }

// class WorldTask implements  Runnable{
//     @Override
// public void run(){
//     for(int i = 0 ; i <= 5 ; i++){
//         System.err.println("World"+i);
//         try{
//             Thread.sleep(500);
//         }
//         catch(InterruptedException e){
//             e.printStackTrace();
//         }
//     }
// }
// }

// public class Main{
//     public static void main(String[] args) {
//         Runnable hellotask = new HelloTask();
//         Runnable worldtask = new WorldTask();

//         Thread t1 = new Thread(hellotask);
//         Thread t2 = new Thread(worldtask);

//         t1.start();
//         t2.start();
//     }
// }




// Voting Deatils 
// abstract class Candidate {

//     int candidateID ;
//     String name;
//     String party;

//     public Candidate(int candidateID, String name, String party) {
//         this.candidateID = candidateID;
//         this.name = name;
//         this.party = party;
//     }

//     abstract void displayInfo();

//     void  showBasicInfo(){
//         System.out.println("Candidate Id: "+candidateID);
//         System.out.println("Name : "+name);
//     }

// }


// class LocalCandiate extends Candidate{
//     String Constituency;

//     public LocalCandiate(String Constituency, int candidateID, String name, String party) {
//         super(candidateID, name, party);
//         this.Constituency = Constituency;
//     }
    
//     @Override
//     public void displayInfo(){
//         System.out.println("Local Candidate details");
//         System.out.println("Local Candidate Id: "+candidateID);
//         System.out.println("Local Candidate name: "+name);
//         System.out.println("Local Candidate Party: "+party);
//         System.out.println("Local Candidate Constituency: "+Constituency);

//     }
// }

// class NationalCandidate extends  Candidate{
//     String region;

//     public NationalCandidate(String region, int candidateID, String name, String party) {
//         super(candidateID, name, party);
//         this.region = region;
//     }
//     public void displayInfo(){
//         System.out.println("National Candidate details");
//         System.out.println("National Candidate Id: "+candidateID);
//         System.out.println("National Candidate name: "+name);
//         System.out.println("National Candidate Party: "+party);
//         System.out.println("National Candidate Region: "+region);

//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         Candidate local = new LocalCandiate("Khulna",101,"Yeasin","Khulna BJP");
//         Candidate national = new NationalCandidate("Jashore", 102, "Arafat", "BNP");

//         local.showBasicInfo();
//         national.showBasicInfo();

//         local.displayInfo();
//         national.displayInfo();

//     }
// }


// Summer 25 code


// abstract  class Payment{
//     double amount ;

//     public Payment(double amount) {
//         this.amount = amount;
//     }

//     abstract void processPayment();
// }

// class CreditCardPayment extends  Payment{
//     int cardNumber;
//     String cardHolderName;

//     public CreditCardPayment(int cardNumber, String cardHolderName, double amount) {
//         super(amount);
//         this.cardNumber = cardNumber;
//         this.cardHolderName = cardHolderName;
//     }

//     @Override
//     void processPayment(){
//         System.out.println("Credit Card");
//         System.out.println("Processing payment: "+amount);
//         System.out.println("Card Number: "+cardNumber);
//         System.out.println("Card Holder Name: "+cardHolderName);
//     }

// }

// class MobilePayment extends Payment{
//     int mobileNumber;
//     String provider;

//     public MobilePayment(int mobileNumber, String provider, double amount) {
//         super(amount);
//         this.mobileNumber = mobileNumber;
//         this.provider = provider;
//     }

//     @Override
//   void processPayment(){
//         System.out.println("Mobile Payment");
//         System.out.println("Processing payment: "+amount);
//         System.out.println("Mobile Number: "+mobileNumber);
//         System.out.println("Provider  Name: "+provider);
//     }
// }


// public class Main{
//     public static void main(String[] args) {


// Payment [] payments = {
//         new CreditCardPayment(783783933, "Yeasin", 1000000),
//      new MobilePayment(1627800198, "Cirkle", 200)
// };

// for(Payment p : payments){
//   p.processPayment();

// }   

//     }
// }
