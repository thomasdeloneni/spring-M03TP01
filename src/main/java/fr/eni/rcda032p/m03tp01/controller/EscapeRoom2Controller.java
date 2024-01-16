package fr.eni.rcda032p.m03tp01.controller;


import fr.eni.rcda032p.m03tp01.bll.RoomService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("room2")
public class EscapeRoom2Controller {
    private RoomService roomService;
    public EscapeRoom2Controller(RoomService roomService) {
        this.roomService = roomService;
    }

    public void entreeSalle2() {
        System.out.println(roomService.entreeSalle());
    }

}
