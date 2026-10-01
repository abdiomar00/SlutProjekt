public class Membership {
    private String memberName;
    private int memberID;

    public Membership(String memberName, int memberID) {
        this.memberName = memberName;
        this.memberID = memberID;
    }

    public String getName() {
        return memberName;
    }

    public int getId() {
        return memberID;
    }

    public String getmembershipType() {
        return "membership";
    }
    public void displayMembership() {
        System.out.println(memberName + " " + memberID);
    }


}
