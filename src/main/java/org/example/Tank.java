package org.example;

public class Tank extends CloseRangeUnit implements Terran{
    public Tank() {
        super.tribe = TRIBE;
        super.att = 7;
        super.def = 15;
    }
}
