package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMMotorController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
    private final PWMMotorController m_leftmotor;
    private final PWMMotorController m_rightmotor;
    private final DifferentialDrive m_diffdrive;

    public DriveSubsystem(PWMMotorController leftmotor, PWMMotorController rightmotor) {
        m_leftmotor = leftmotor;
        m_rightmotor = rightmotor;
        m_diffdrive = new DifferentialDrive(m_leftmotor, m_rightmotor);
    }
    public void arcadeDrive(double fwd, double rot) {
        m_diffdrive.arcadeDrive(fwd, rot);
    }
}