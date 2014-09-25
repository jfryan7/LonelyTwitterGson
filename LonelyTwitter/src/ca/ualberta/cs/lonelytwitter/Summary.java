package ca.ualberta.cs.lonelytwitter;

public class Summary {
	
	private static long avgNumTweets;
	private static long avgLenTweets; 
	
	public Summary(){
		
	}

	public long getAvgNumTweets() {
		return avgNumTweets;
	}

	public void setAvgNumTweets(long l) {
		this.avgNumTweets = l;
	}

	public long getAvgLenTweets() {
		return avgLenTweets;
	}

	public void setAvgLenTweets(long avgLenTweets) {
		this.avgLenTweets = avgLenTweets;
	}
	

}
