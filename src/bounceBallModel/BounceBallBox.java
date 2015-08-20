package bounceBallModel;

public class BounceBallBox {
	private int ballBoxPositionX;
	private int ballBoxPositionY;
	private int ballBoxWidth;
	private int ballBoxHeight;

	public BounceBallBox() {
		// TODO Auto-generated constructor stub
		this.ballBoxPositionX = 100;
		this.ballBoxPositionY = 100;
		this.ballBoxWidth = 300;
		this.ballBoxHeight = 200;
	}

	public int getBallBoxPositionX() {
		return ballBoxPositionX;
	}

	public void setBallBoxPositionX(int ballBoxPositionX) {
		this.ballBoxPositionX = ballBoxPositionX;
	}

	public int getBallBoxPositionY() {
		return ballBoxPositionY;
	}

	public void setBallBoxPositionY(int ballBoxPositionY) {
		this.ballBoxPositionY = ballBoxPositionY;
	}

	public int getBallBoxWidth() {
		return ballBoxWidth;
	}

	public void setBallBoxWidth(int ballBoxWidth) {
		this.ballBoxWidth = ballBoxWidth;
	}

	public int getBallBoxHeight() {
		return ballBoxHeight;
	}

	public void setBallBoxHeight(int ballBoxHeight) {
		this.ballBoxHeight = ballBoxHeight;
	}
	
}
