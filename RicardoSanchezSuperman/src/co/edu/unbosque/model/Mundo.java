package co.edu.unbosque.model;

import java.io.IOException;

import co.edu.unbosque.persistence.ArchivoFile;

public class Mundo {
	private ArchivoFile archivo = new ArchivoFile();
	private SeaPlane seaplane= new SeaPlane();
	private Superman superman = new Superman();
	private Bird bird = new Bird();
	private Helicopter helicoptero= new Helicopter();
    public String gestionarArchivoCadena() throws IOException{
	 
	 archivo.escribirArchivo("dato de tipo String", "./docs/mon.dat");
	 return "lei este dato: " + archivo.leerArchivo("./docs/mon.dat");
	 }
public ArchivoFile getArchivo() {
	return archivo;
}
public SeaPlane getSeaplane() {
	return seaplane;
}
public Superman getSuperman() {
	return superman;
}
public Bird getBird() {
	return bird;
}
public Helicopter getHelicoptero() {
	return helicoptero;
}
 
 
}
