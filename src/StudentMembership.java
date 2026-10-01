public class StudentMembership extends Membership{
    private String schoolName;

    public StudentMembership(String memberName, int memberID, String schoolName) {
        super(memberName, memberID);
        this.schoolName = schoolName;
    }

    @Override
    public String getmembershipType(){
        return "Standard";
    }

    @Override
    public void displayMembership(){
        System.out.println("[" + getmembershipType() + "] ID: " + getMemberID() + " - " + getMemberName() +
                " (School: " + schoolName + ") - Gym Access Only");
    }
}
