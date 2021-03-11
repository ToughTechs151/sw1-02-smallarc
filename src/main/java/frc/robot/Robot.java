package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

/**
 * We create the robot using the TimedRobot base. The difference between
 * the IimedRobot base and the other common choice, IterativeRobot, is that
 * iterative calls the periodic methods each time there is a new packet
 * from the drive station, while the TimedRobot calls them each 20ms.
 * Since the drive station typically sends its data each 20ms there isn't 
 * much difference, but there can be jitter in the drive station and in the
 * network so the actual time at which they run can be off. When we use
 * control loops like the PID loop pattern, this can have an effect on 
 * the calculations. So TimedRobot is a bit more stable. 
 **/
public class Robot extends TimedRobot {
  /**
   * We move robot configuration information out of the Robot.java
   * file into a separate RobotContainer file. This separates things
   * that can change as the hardware changes, i.e. physical parts, 
   * from the actions that those things need to take, i.e. the code
   * that provides the logic behind them. Since this example uses
   * the real Command Based Robot pattern, we don't actually have to 
   * do much other than create the Robot in the container and run the
   * scheduler. In this small case we still will not move the
   * commands into their own files. Instead we will leave them in the
   * robot container. We do put the subsystem into its own file and folder.
   **/
  /* 
   * We override the robotInit method here to create the robot in the
   * robot container. The 
   */
  @Override
  public void robotInit() {
    new RobotContainer();
  }
  @Override
  public void robotPeriodic() {
    CommandScheduler.getInstance().run();
  }
  @Override
  public void testInit() {
    CommandScheduler.getInstance().cancelAll();
  }

}
