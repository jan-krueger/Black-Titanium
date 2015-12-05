package de.SweetCode.BlackTitanium.Event;

/**
 * Created by Yonas on 04.12.2015.
 */
public enum EventPriorities implements EventPriority {

    LOWEST {

        @Override
        public String getName() {
            return "Lowest";
        }

        @Override
        public double getValue() {
            return 0;
        }

    },
    LOW {
        @Override
        public String getName() {
            return "Low";
        }

        @Override
        public double getValue() {
            return 25;
        }
    },
    NORMAL {
        @Override
        public String getName() {
            return "Normal";
        }

        @Override
        public double getValue() {
            return 50;
        }
    },
    HIGH {

        @Override
        public String getName() {
            return "High";
        }

        @Override
        public double getValue() {
            return 75;
        }

    },
    HIGHEST {

        @Override
        public String getName() {
            return "Highest";
        }

        @Override
        public double getValue() {
            return 100;
        }

    }

}
