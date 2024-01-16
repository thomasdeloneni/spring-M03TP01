package fr.eni.rcda032p.m03tp01.bll;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("trap")
public class Room2Service implements RoomService {

	@Override
	public String entreeSalle() {
		return "Perdu, vous etes dans la mauvaise salle !";
	}

}
