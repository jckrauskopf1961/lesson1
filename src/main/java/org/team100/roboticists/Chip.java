package org.team100.roboticists;

public class Chip implements Roboticist {

    @Override
    public type getType() {
        return type.MENTOR;
    }

    @Override
    public String getName() {
        return "Chip";
    }

    @Override
    public int getStudentId() {
        return 0;
    }

    @Override
    public String getSpecialTalent() {
        return "Buys Most of the Stuff";
    }

}
