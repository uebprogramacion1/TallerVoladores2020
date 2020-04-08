package co.edu.unbosque.Model;

public class SeaPlane extends Aircraft{
	
	private String datos;
	
	public SeaPlane() {
		
		datos = infoAircraft();
		
	}
	
	@Override
	public String infoAircraft() {
		// TODO Auto-generated method stub
		String info = "Soy un Aeroplano y " + soyVehiculo() +
				super.fly() + ". Puedo " + super.takeOff() + " y " + super.land();
		return info;
	}
	
	@Override
	public String soyVehiculo() {
		// TODO Auto-generated method stub
		return "Soy un Vehiculo";
	}
	
}
