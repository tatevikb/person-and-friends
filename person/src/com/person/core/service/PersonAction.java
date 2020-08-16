package com.person.core.service;

import com.person.core.enumeration.ActionType;

public interface PersonAction {
    void learn();
    void eat();
    void walk();
    void act(ActionType actionType);
}
