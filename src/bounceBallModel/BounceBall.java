package bounceBallModel;

public class BounceBall {
	private int ballPositionX;
	private int ballPositionY;
	private int ballDirectionX;
	private int ballDirectionY;
	private int ballRadius;
	
	public BounceBall(int ballPositionX,int ballPositionY,int ballDirectionX,int ballDirectionY,int ballRadius) {
		// TODO Auto-generated constructor stub
		this.ballPositionX=ballPositionX;
		this.ballPositionY=ballPositionY;
		this.ballDirectionX=ballDirectionX;
		this.ballDirectionY=ballDirectionY;
		this.ballRadius=ballRadius;
	}
	
	public int getBallPositionX() {
		return ballPositionX;
	}
	public void setBallPositionX(int ballPositionX) {
		this.ballPositionX = ballPositionX;
	}
	public int getBallPositionY() {
		return ballPositionY;
	}
	public void setBallPositionY(int ballPositionY) {
		this.ballPositionY = ballPositionY;
	}
	public int getBallDirectionX() {
		return ballDirectionX;
	}
	public void setBallDirectionX(int ballDirectionX) {
		this.ballDirectionX = ballDirectionX;
	}
	public int getBallDirectionY() {
		return ballDirectionY;
	}
	public void setBallDirectionY(int ballDirectionY) {
		this.ballDirectionY = ballDirectionY;
	}

	public int getBallRadius() {
		return ballRadius;
	}

	public void setBallRadius(int ballRadius) {
		this.ballRadius = ballRadius;
	}
	
}
