public interface Bookable {
    void bookGroupClass() throws IllegalStateException;
    void cancelBooking();
    int getBookedClassesCount();
}
