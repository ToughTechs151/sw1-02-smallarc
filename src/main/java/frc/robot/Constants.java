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
        public static final int kLeftMotorPort = 0;
        public static final int kRightMotorPort = 1;

    }
    public static final class OIConstants {
        public static final int kJoystickPort = 0;
    }
}
