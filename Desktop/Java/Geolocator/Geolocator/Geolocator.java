public class Geolocator {
     public String findGeopoliticalzone(String state){
		return switch(state){
			case "Kano", "Katsina", "Kaduna", "Kebbi", "Sokoto", "Zamfara", -> "North-West";


			default -> "No zone";
			};
	

}
}