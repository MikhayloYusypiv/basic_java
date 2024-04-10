package basic.LR3.controller;


import basic.LR3.model.Group;

public class GroupCreator implements Creator {
    @Override
    public Group create() {
        return new Group();
    }
}