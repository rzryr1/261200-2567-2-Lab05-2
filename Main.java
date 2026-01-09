void main() {
    User John = new User("John",2026,1,9);
    John.displayInfo();
    John.displayHappyBirthday();
    Admin nicolas = new Admin("Nicolas",1964,1,9);
    nicolas.displayInfo(true);
    nicolas.displayHappyBirthday();
//    nicolas.displayInfo(false);
}