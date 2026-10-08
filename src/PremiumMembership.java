public class PremiumMembership extends Membership implements Bookable{
    private boolean personalTrainer;

    public PremiumMembership(String memberName, int memberID, int bookedClass, boolean personalTrainer) {
        if (memberName == null || memberName.trim().isEmpty()) {
            throw new IllegalArgumentException("Member name cannot be empty");
        }
        super(memberName, memberID);
        this.personalTrainer = personalTrainer;
    }

    public boolean hasPersonalTrainer() {
        return personalTrainer;
    }

    @Override
    public String getmembershipType(){
        return "Premium";
    }

    @Override
    public String getDescription() {
         if (personalTrainer){
             return "Premium membership with personal trainer";
         }
         return "Premium membership without personal trainer";
    }

    @Override
    public void bookTraining(){
        if (!personalTrainer){
            throw new IllegalStateException("This member does not have a personal trainer");
        }
        System.out.println(getMemberName() + "booked a personal trainer session.");
    }

    @Override
    public boolean canBookTraining(){
        return personalTrainer;
    }

}
