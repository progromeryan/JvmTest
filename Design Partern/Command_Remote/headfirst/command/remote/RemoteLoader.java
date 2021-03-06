package headfirst.command.remote;


public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        /**
         * 所有装置在合适位置
         */
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        /**
         * 所有电灯的命令对象
         */
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);


//        /**
//         * 调用吊扇的开与关的命令
//         */
//        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
//        CeilingFanHighCommand ceilingFanOff = new CeilingFanHighCommand(ceilingFan);
//
//        /**
//         * 创建车库门的上与下命令
//         */
//        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
//        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
//
//        /**
//         * 创建音响的开与关的命令
//         */
//        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
//        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
//
//        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
//        remoteControl.setCommand(1,kitchenLightOn,kitchenLightOff);
//        remoteControl.setCommand(2,ceilingFanOn,ceilingFanOff);
//        remoteControl.setCommand(3,stereoOnWithCD,stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

    }
}
