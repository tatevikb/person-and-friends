package homeworks.person.core.service.impl;

import homeworks.person.core.service.DancerAction;

public class DancerActionImpl implements DancerAction {
    @Override
    public void learn()
    {
        System.out.println("Dancer can learn unlimited.");
    }

    @Override
    public void eat()
    {
        System.out.println("Dancer can eat 3 time in a day not more.");
    }

    @Override
    public void walk() {
        System.out.println("Dancer can walk unlimited.");
    }

    @Override
    public void dancing()
    {
        System.out.println("Dancer can dancing only after eating.");
    }
}
