package basic.LR3.controller;

import basic.LR3.model.Faculty;

public class FacultyCreator implements Creator {
    @Override
    public Faculty create() {
        return new Faculty();
    }
}