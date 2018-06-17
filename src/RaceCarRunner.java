

public class RaceCarRunner {
	
 
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar yeet = new RaceCar("Maserati", 5); 
		// 2. Print the RaceCar's position in the race
yeet.getPositionInRace();
int PositionInRace = 5;
		// 3. Crash the RaceCar
		yeet.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
yeet.pit();
		// 5. Help the car move into first place.
yeet.overtake();
yeet.overtake();
yeet.overtake();
yeet.overtake();
yeet.overtake();
yeet.overtake();
yeet.overtake();

	}
}
