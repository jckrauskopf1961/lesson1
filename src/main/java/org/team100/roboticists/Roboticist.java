package org.team100.roboticists;

public interface Roboticist {
    public enum type {STUDENT, MENTOR}

    type getType();

    String getName();

    /** return 0 if no id exists. */
    int getStudentId();

    String getSpecialTalent();
}
