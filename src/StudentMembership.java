public class StudentMembership extends Membership{
    private String schoolName;

    public StudentMembership(String memberName, int memberID, String schoolName) {
        if (schoolName == null || schoolName.trim().isEmpty()) {
            throw new IllegalArgumentException("School name cannot be empty");
        }
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
