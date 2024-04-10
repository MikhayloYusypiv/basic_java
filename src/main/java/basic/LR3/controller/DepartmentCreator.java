package basic.LR3.controller;

import basic.LR3.model.Department;

public class DepartmentCreator implements Creator {
    @Override
    public Object create() {
        return new Department();
    }
}