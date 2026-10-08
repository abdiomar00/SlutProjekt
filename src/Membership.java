public class Membership {
    private String memberName;
    private int memberID;

    public Membership(String memberName, int memberID) {
        if (memberName == null || memberName.trim().isEmpty()) {
            throw new IllegalArgumentException("Member name cannot be null or empty");
        }
        if (memberID <= 1000 || memberID > 9999) {
            throw new IllegalArgumentException("Member ID must be a 4-digit number (1001-9999)");
        }

        this.memberName = memberName;
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getMemberID() {
        return memberID;
    }

    public String getmembershipType() {
        return " General Membership";
    }
    public String getDescription() {
        return "General gym membership";
    }

    @Override
    public String toString() {
        return "ID: "  + memberID + " | Name: " + memberName + " | Ty: " + getmembershipType();
    }


}
