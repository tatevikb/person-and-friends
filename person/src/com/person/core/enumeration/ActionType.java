package com.person.core.enumeration;

import com.person.core.exceptions.IncorrectInputException;
import com.person.core.exceptions.ValidationException;

public enum ActionType {
    EAT("eat"),
    WALK("walk"),
    LEARN("learn"),
    DANCE("dance"),
    CODE("code"),
    SING("sing"),
    PLAY_GUITAR("play guitar"),
    STOP("stop");

    private String id;

    ActionType(String id) {
        this.id = id;
    }

    public static ActionType getById(String id) {
        for(ActionType a : values()) {
            if(a.id.equals(id)) {
                return a;
            }
        }
        throw new IncorrectInputException("Incorrect action name!");
    }
}
