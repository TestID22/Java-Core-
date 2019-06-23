package com.september;

/**
 * От этого класса нельзя создать объект, от него можно только наследовать
 */
public abstract class Hero {
    public abstract String getDescription();
    private String name;
    public Hero (String name){

        this.name = name;
    }
    public String getName()
    {
        return name;

    }

}
