package api;

public class Score {
	private int id;
	private String name;
	private int roomId;
	private int score;
	private float percentage;
	private int time;
	private boolean isFirst;
	private boolean didFinish;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public boolean isFirst() {
		return isFirst;
	}

	public void setFirst(boolean isFirst) {
		this.isFirst = isFirst;
	}

	public boolean isDidFinish() {
		return didFinish;
	}

	public void setDidFinish(boolean didFinish) {
		this.didFinish = didFinish;
	}

	public String toString() {
		return name + ":" + score;
	}

}
