package frc.team5115.statemachines;

import frc.team5115.base.*;
import static frc.team5115.robot.Robot.*;

public class DriveStateMachine extends StateMachine {
    public void init() {
        setState(OFF);
        ds.resetEncoders();
        ds.update();
    }

    public void update() {
        setState(joy.autoCorrect() ? AUTO_DRIVE : ON);
        ds.update();
    }
}
