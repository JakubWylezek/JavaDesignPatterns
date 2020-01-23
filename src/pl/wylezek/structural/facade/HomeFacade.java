package pl.wylezek.structural.facade;

import pl.wylezek.structural.facade.door.Door;
import pl.wylezek.structural.facade.door.GarageDoor;
import pl.wylezek.structural.facade.door.MainDoor;
import pl.wylezek.structural.facade.light.HallLight;
import pl.wylezek.structural.facade.light.Light;
import pl.wylezek.structural.facade.light.LivingRoomLight;

public class HomeFacade {

    private Light livingRoomLight = new LivingRoomLight();
    private Light hallLight = new HallLight();
    private Door mainDoor = new MainDoor();
    private Door garageDoor = new GarageDoor();

    public void lockHome() {
        System.out.println("-----------LOCK HOME -----------");
        livingRoomLight.off();
        hallLight.off();
        mainDoor.lock();
        garageDoor.lock();
    }

    public void unlockHome(){

        System.out.println("------ UNLOCK HOME -----");
        hallLight.on();
        mainDoor.unlock();
        garageDoor.unlock();
    }

    public void lightOff(){

        System.out.println("------ LIGHT OFF -----");
        livingRoomLight.off();
        hallLight.off();
    }

    public void lightOn(){

        System.out.println("------ LIGHT ON -----");
        livingRoomLight.on();
        hallLight.on();
    }
}
