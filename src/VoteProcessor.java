import java.util.ArrayList;

public class VoteProcessor {

	String popeFrancis[] = {"pope francis","Pope francis", "pope Francis", "Pope Francis", "POPE FRANCIS"};
	String edwardSnowden[] = {"edward snowden","Edward snowden", "edward Snowden", "Edward Snowden", "EDWARD SNOWDEN"};
	int fCount = 0;
	int eCount = 0;
	
	public String calculateElectionWinner(ArrayList<String> votes) {
		for (int i = 0; i < votes.size(); i++) {
			for (int j = 0; j < popeFrancis.length; j++) {
				if (votes.get(i) == popeFrancis[j]) {
					fCount += 1;
				}
			}
			for (int j = 0; j < edwardSnowden.length; j++) {
				if (votes.get(i) == edwardSnowden[j]) {
					eCount += 1;
				}
			}
		}	if (fCount > eCount) {
				return "pope francis";
			}
			if (eCount > fCount) {
				return "edward snowden";
			}
			return "TIE";
		
	} 

}
