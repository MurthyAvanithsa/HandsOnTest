import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Example2 {

	public static void main(String[] args) {
		Map<String,Integer> teamsAndScores = new HashMap<>();
		teamsAndScores.put("India", 223);
		teamsAndScores.put("Australia", 288);
		
		//Get score of a team by name 
		String teamNameToSearch = "India";
		Boolean teamExists =  teamsAndScores.containsKey(teamNameToSearch);
		if(teamExists) {
			teamsAndScores.put(teamNameToSearch, 300);
		}
		 // iterate though keys 
		for (Entry<String, Integer> entry : teamsAndScores.entrySet()) {
		    System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
