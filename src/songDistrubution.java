import java.util.*;
public class songDistrubution {

	public static void main(String[] args) {
		ArrayList<Integer> songTrackLengths = new ArrayList<Integer>();
		songTrackLengths.add(10);
		songTrackLengths.add(30);
		songTrackLengths.add(15);
		songTrackLengths.add(50);
		songTrackLengths.add(70);
		songTrackLengths.add(35);
		songTrackLengths.add(25);
		ArrayList<Integer> result = songRecommender(90, songTrackLengths);
		System.out.println(result.get(0)+" "+result.get(1));
	}
	public static ArrayList<Integer> songRecommender(int userTravelTime, ArrayList<Integer> songTrackLengths){
		ArrayList<Integer> songTrackLength = songTrackLengths;
		ArrayList<Integer> deflt = new ArrayList<>();
		deflt.add(-1);
		deflt.add(-1);
		int requiredTimeInSeconds = userTravelTime - 30;
		if(requiredTimeInSeconds < 0)
			return deflt;
		ArrayList<Integer> result = new ArrayList<Integer>();
		HashMap<Integer, Integer> songOriginalIndex = new HashMap<>();
		int numberofSongs = songTrackLength.size();
		for(int i=0;i<numberofSongs;i++) {
			if(!songOriginalIndex.containsKey(songTrackLength.get(i)))		//This will eliminate chances of repetition in data.
				songOriginalIndex.put(songTrackLength.get(i), i);
		}
		Collections.sort(songTrackLength);
		for(int i=numberofSongs-1;i>=0;i--) {
			for(int j=i-1;j>=0;j--) {
				int diff = requiredTimeInSeconds - songTrackLength.get(i) - songTrackLength.get(j);
				if(diff>=0){
					result.add(songOriginalIndex.get(songTrackLength.get(j)));
					result.add(songOriginalIndex.get(songTrackLength.get(i)));
					return result;
				}
			}
		}
		
		return deflt;
	}
}
