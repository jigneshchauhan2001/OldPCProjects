package inner;

public class FootBall {

	String leagueName, coachName;
	public String getLeagueName() {
		return leagueName;
	}
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	static FootBall footBall = new FootBall();	
	public  static void main(String[] args) {
		
		Player player = footBall.new Player();
	
		player.setPlayername("Jignesh");
		player.setPhoneno(45966485566l);
		
		System.out.println(player.getPlayername());
		System.out.println(player.getPhoneno());
		
		player.setMethodsOfFootBall();
		System.out.println(footBall.getCoachName());
		System.out.println(footBall.getLeagueName());
	}

	class Player {
		String playername;
		long phoneno;
		public String getPlayername() {
			return playername;
		}
		public void setPlayername(String playername) {
			this.playername = playername;
		}
		public long getPhoneno() {
			return phoneno;
		}
		public void setPhoneno(long phoneno) {
			this.phoneno = phoneno;
		}

		
		public void setMethodsOfFootBall() {	
			footBall.setCoachName("Sunil");
			footBall.setLeagueName("Programming");
		}
		
	}
}
