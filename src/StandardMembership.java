public class StandardMembership extends Membership implements Bookable{
    private boolean groupTraining;


    public StandardMembership(String memberName, int memberID, boolean groupTraining) {
        super(memberName, memberID);
        this.groupTraining = groupTraining;
    }
    public boolean hasGroupTraining() {
        return groupTraining;
    }

    @Override
    public String getmembershipType(){
        return "Standard";
    }

    @Override
    public String getDescription(){
         if (groupTraining){
             return "Standard membership with group training. ";
         }
         return "Standard membership without group training. ";
    }

    @Override
    public void bookTraining(){
        if (!groupTraining){
            throw new IllegalStateException("This member does not have group training.");
        }
        System.out.println(getMemberName() + "booked group training.");
    }

    @Override
    public boolean canBookTraining(){
        return groupTraining;
    }
}
