package frc.robot;
/**
 * We create constants all in one file so we can easily find and change them.
 * By convention we start each constant with a lower case "k" to make them
 * obvious in elsewhere. We can group constants together when they are 
 * functionally related. In this case we have a class for all the constants
 * related to the drive train and a class for all the constants related to 
 * the Operator Interface (OI). 
 **/
public final class Constants {
    public static final class DriveConstants {
        public static final int LEFT_MOTOR_PORT = 0;
        public static final int RIGHT_MOTOR_PORT = 1;
        private DriveConstants() {}
    }
    public static final class OIConstants {
        public static final int JOYSTICK_PORT = 0;
        private OIConstants() {}
    }
    private Constants() {}
}
