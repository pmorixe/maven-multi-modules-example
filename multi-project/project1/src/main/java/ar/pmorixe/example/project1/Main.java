package ar.pmorixe.example.project1;

import common.Persona;
import common.utils.Chronometer;

public class Main {

	public static void main(String[] args) {
		Chronometer chronometer = new Chronometer();

		chronometer.start();
		Persona persona = new Persona();
		persona.setName("Pablo");
		chronometer.stop();
		
		System.out.println(chronometer.getTime());
		
		

	}

}
