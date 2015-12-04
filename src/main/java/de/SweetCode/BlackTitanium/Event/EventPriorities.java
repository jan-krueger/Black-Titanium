package de.SweetCode.BlackTitanium.Event;

/**
 * Created by Yonas on 04.12.2015.
 */
public enum EventPriorities implements EventPriority {

    LOW {
        @Override
        public String getName() {
            return "Low";
        }

        @Override
        public double getValue() {
            return 0;
        }
    },
    MIDDLE {
        @Override
        public String getName() {
            return "Middle";
        }

        @Override
        public double getValue() {
            return 5;
        }
    },
    HIGH {
        @Override
        public String getName() {
            return "High";
        }

        @Override
        public double getValue() {
            return 10;
        }
    }

}
