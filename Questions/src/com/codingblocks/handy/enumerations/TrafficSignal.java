package com.codingblocks.handy.enumerations;

public class TrafficSignal {

    enum Signal{
        red("STOP"), yellow("WAIT"), green("GO");

        String action;

        Signal(String action) {
            this.action = action;
        }

        public String getAction() {
            return this.action;
        }
    }

    public static void main(String[] args) {

        Signal[] signals = Signal.values();

        for (Signal sig : signals){
            System.out.println(sig.getAction());
        }

    }


}
