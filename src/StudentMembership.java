public class StudentMembership extends Membership{
    private String schoolName;

    public StudentMembership(String memberName, int memberID, String schoolName) {
        if (schoolName == null || schoolName.trim().isEmpty()) {
            throw new IllegalArgumentException("School name cannot be empty");
        }
        super(memberName, memberID);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String getmembershipType(){
        return "Student";
    }

    @Override
    public String getDescription() {
        return "Student membership at " + schoolName + ".";
    }

}
