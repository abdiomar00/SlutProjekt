public class PremiumMembership extends Membership implements Bookable{
    private int bookedClass;
    private String personalTrainerName;

    public PremiumMembership(String memberName, int memberID, int bookedClass, String personalTrainerName) {
        super(memberName, memberID);
        this.bookedClass = bookedClass;
        this.personalTrainerName = personalTrainerName;
    }

    @Override
    public String getmembershipType(){
        return "Premium";
    }

    @Override
    public void displayMembership(){
        System.out.println("[" + getmembershipType() + "] ID: " + getMemberID() + " - " + getMemberName() +
                " (Booked classes: " + bookedClass + "PT" + personalTrainerName + ")");
    }

    @Override
    public void bookGroupClass(){
        bookedClass++;
    }

    @Override
    public void cancelBooking(){
        if (bookedClass > 0) bookedClass--;
    }
    @Override
    public int getBookedClassesCount(){
        return bookedClass;
    }
}
