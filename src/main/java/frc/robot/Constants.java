package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public class Constants {

    public static final class DriveConstants {
      public static final int kLeftMotor1Port = 2;
      public static final int kLeftMotor2Port = 4;
      public static final int kRightMotor1Port = 1;
      public static final int kRightMotor2Port = 3; 
    }

    public static final class PusherConstants {
      public static final int pusherMotorID = 8;
      public static final int pusherSwitchPort = 4;
    }
    
     public static final class DoorConstants {
      public static final int doorMotorID = 8;
      public static final int doorSwitchPort = 4;
    }
}

