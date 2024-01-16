package fr.eni.rcda032p.m03tp01.controller;


import fr.eni.rcda032p.m03tp01.bll.TreasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class TreasureRoomController {
    private TreasureService tresorService;

    public String fin() {
        return tresorService.ouvrir();
    }

    @Autowired
    public void setTresorService(TreasureService tresorService) {
        this.tresorService = tresorService;
    }
}
