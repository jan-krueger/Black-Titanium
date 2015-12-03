package de.SweetCode.BlackTitanium.Settings;

/**
 * Created by Yonas on 03.12.2015.
 */
public enum Settings implements Setting {

    SCREEN_TITLE {

        public String getName() {
            return "Screen Title";
        }

        public String getPath() {
            return "screen.title";
        }

        public String getValue() {
            return "Black Titanium";
        }

    },
    SCREEN_WIDTH {

        public String getName() {
            return "Screen Width";
        }

        public String getPath() {
            return "screen.width";
        }

        public Integer getValue() {
            return 1920;
        }

    },
    SCREEN_HEIGHT {

        public String getName() {
            return "Screen Height";
        }

        public String getPath() {
            return "screen.height";
        }

        public Integer getValue() {
            return 1080;
        }

    },
    BUFFER_STRATEGY_BUFFERS {
        public String getName() {
            return "Buffer Strategy Buffers";
        }

        public String getPath() {
            return "buffer.strategy.buffers";
        }

        public Integer getValue() {
            return 3;
        }

    }

}
