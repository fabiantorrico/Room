/**
 * 
 * Fabian Torrico
 * 4/9/2015
 *
 */

public class Room {
	
	private String Color;
	private String Flooring;
	private int Windows;
	
	public Room(){
		this.Color = "Yellow";
		this.Flooring = "Carpet";
		this.Windows = 1;
	}
	public Room(String Color, String Flooring, int Windows){
		this.Color = Color;
		this.Flooring = Flooring;
		this.Windows= Windows;
	}
	public String setColor(){
		return Color;
		} 
	public void getColor(String Color){
		this.Color = Color;
		}
	public String setFlooring(){
		return Flooring;
		} 
	public void getRoomFlooring(String Flooring){
		this.Flooring = Flooring;
		}
	public int setWindows(){
		return Windows;
		} 
	public void getWindows(int Windows){
		this.Windows = Windows;
		}	
	public String toString(){
		return "The room is colored: " + this.Color + ", The flooring is: " + this.Flooring + ", The number of windows is: " + this.Windows;
	}

}
