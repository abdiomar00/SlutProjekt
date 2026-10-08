public class StandardMembership extends Membership implements Bookable{
    private int bookedClass = 0;
    private final int MAX_bookedClass = 3;

    public StandardMembership(String memberName, int memberID, int bookedClass) {
        super(memberName, memberID);
        this.bookedClass = bookedClass;
    }

    @Override
    public String getmembershipType(){
        return "Standard";
    }

    public void getDescribtion(){
        System.out.println("[" + getmembershipType() + "] ID: " + getMemberID() + " - " + getMemberName() +
                " (Booked classes: " + bookedClass + " " + MAX_bookedClass + ")");
    }

    @Override
    public void bookGroupClass(){
        if (bookedClass >= MAX_bookedClass){
            throw new IllegalStateException("Standard members cannot book more than " + MAX_bookedClass + " classes.");
        }
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
