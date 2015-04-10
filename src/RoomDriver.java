public class RoomDriver {

	public static void main(String[] args) {
	
		Room Room1 = new Room();
		System.out.println("The Bedroom is " + Room1);
		
		//Identifies first room
		Room RoomOne=new Room ("Yellow", "Hard Wood",1);
		System.out.println(RoomOne);
		
		//Identifies second room
		Room RoomTwo =new Room ("Purple","Tiled", 0);
		System.out.println(RoomTwo);
		
		//Identifies third room
		Room RoomThree =new Room ("White","Carpet", 3);
		System.out.println(RoomThree);
	}
}