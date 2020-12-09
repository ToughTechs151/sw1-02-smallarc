package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.Constants.DriveConstants;
import frc.robot.Constants.OIConstants;
import frc.robot.subsystems.DriveSubsystem;

public class RobotContainer {
    /** 
     * As usual we put the robot parts together here in one place. This is just like 
     * the previous example, but this time we replace the hard coded port numbers
     * with constants from the Constants file.
     **/
    private final PWMVictorSPX m_leftmotor = new PWMVictorSPX(DriveConstants.kLeftMotorPort);
    private final PWMVictorSPX m_rightmotor = new PWMVictorSPX(DriveConstants.kRightMotorPort);
    private final DriveSubsystem m_drivesubsystem = new DriveSubsystem(m_leftmotor, m_rightmotor);
    private final Joystick m_stick = new Joystick(OIConstants.kJoystickPort);
    
    /**
     * In the Command Based Robot pattern, we can specifiy a command that is run 
     * if no other command is running. This is done on a per subsystem basis, that
     * is, each subsystem can have its own default command. We use the setDefaultCommand
     * method from the subsystem to designate what command is the default. 
     * 
     * We use Java Generics to succinctly create our command and pass it into the 
     * setDefaultCommand method. Just as we did in the previous example we simply
     * read a value from the joystick for each motor and then set the motor to 
     * that value. Remember that the scheduler calls the command and the scheduler
     * is run in robotPeriodic, so the command is going to get called each time through
     * the main loop, i.e. every 20ms. It is therefore imperitive that the command does not
     * take a long time to run, or loop or wait on any event. We can effectively do all of 
     * these things with a different structure to the code, but we will cover that later.
     **/
    public RobotContainer() {
        m_drivesubsystem.setDefaultCommand(
            new RunCommand(() -> m_drivesubsystem
            .arcadeDrive(m_stick.getY(GenericHID.Hand.kLeft),
            m_stick.getX(GenericHID.Hand.kLeft)), m_drivesubsystem));
    }
}
