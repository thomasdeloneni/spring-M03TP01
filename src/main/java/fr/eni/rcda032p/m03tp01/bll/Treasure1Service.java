package fr.eni.rcda032p.m03tp01.bll;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("trap")
public class Treasure1Service implements TreasureService {

	public String ouvrir() {
		return "Perdu, vous êtes tombé dans un piège !";
	}
	
}
