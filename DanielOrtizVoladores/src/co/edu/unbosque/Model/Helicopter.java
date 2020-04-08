package co.edu.unbosque.Model;

public class Helicopter extends Aircraft{
	
	private String datos;
	
	public Helicopter() {
		
		datos = infoAircraft();
		
	}
	
	@Override
	public String infoAircraft() {
		// TODO Auto-generated method stub
		String datos = "Soy un Helicoptero y " + soyVehiculo() +
				 "Puedo " + super.fly() + ". Puedo " + super.takeOff() +
				 " y " + super.land();
		return datos;
	}

	@Override
	public String soyVehiculo() {
		// TODO Auto-generated method stub
		return "soy un Vehiculo";
	}

	public String getDatos() {
		return datos;
	}
	
}
