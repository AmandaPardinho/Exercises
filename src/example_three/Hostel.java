package example_three;

public class Hostel extends Student{
    private int room;

    public Hostel(String name, String email, int room) {
        super(name, email);
        this.room = room;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHostel{" +
                "room: " + room +
                "}";
    }
}
