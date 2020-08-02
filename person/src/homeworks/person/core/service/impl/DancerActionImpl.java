package homeworks.person.core.service.impl;

import homeworks.person.core.service.DancerAction;

public class DancerActionImpl implements DancerAction {

    @Override
    public void learn()
    {
        System.out.println("The dancer is learning the movements of the dance.");
    }

    @Override
    public void eat()
    {
        System.out.println("The dancer is eating healthy food.");
    }

    @Override
    public void dancing()
    {
        System.out.println("The dancer is dancing.");
    }
}
