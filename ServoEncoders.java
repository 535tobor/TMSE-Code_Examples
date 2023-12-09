package org.firstinspires.ftc.teamcode.reference.teleop;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
@Disabled
public class ServoEncoders extends OpMode{

    /* Declare OpMode members. */
    public Servo servo;
    @Override
    public void init() {
        // Define and Initialize Motors
        backLeft  = hardwareMap.get(Servo.class, "servo");

        thing.setDirection(Servo.Direction.REVERSE);
        // this ^ is different depending on the direction you want your servo to turn.

        telemetry.addData(">", "Ready.");    // initialized and ready to go.
    }

    @Override
    public void init_loop() { // loop that runs after initialization has been carried.
    }

    @Override
    public void start() {
        telemetry.addData(">", "Go!");
        // moving servos is a hole lot easier than moving motors. We can move them kind of like encoders but easier and without plugging anything else in.
        // bellow is all we have to say:
        thing.setPosition(50);
    } /* the play button has been
    clicked and the robot is running! */

    @Override
    public void loop() { // loop that runs after the play button has been pushed.
    }

    @Override
    public void stop() {
        telemetry.addData(">", "Robot is Stopped."); /* Send the message to the driver's station
        that the robot is now stopped.*/
    }
}
