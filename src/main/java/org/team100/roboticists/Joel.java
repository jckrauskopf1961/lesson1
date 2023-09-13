package org.team100.roboticists;

public class Joel implements Roboticist {

    @Override
    public type getType() {
        return type.MENTOR;
    }

    @Override
    public String getName() {
        return "Joel";
    }

    @Override
    public int getStudentId() {
        return 0;
    }

    @Override
    public String getSpecialTalent() {
        return "Dad jokes";
    }

}
