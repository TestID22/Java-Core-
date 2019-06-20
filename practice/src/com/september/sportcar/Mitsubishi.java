package com.september.sportcar;

public class Mitsubishi extends Sportcar{
    private boolean nos;

    public Mitsubishi(int speed, String name, boolean nos) {
        super(speed, name);
        this.nos = nos;
    }

    public void heyBraingetNitro(){
        System.out.println("ООООО НЕЕЕТТТ СКОРОСТЬ ПРЕДЕЛЬНАЯ 20КМ.Ч");
    }
    public String getNos() {
        if (nos == true)
            return "Турба стоит";
        return null;
    }




}
