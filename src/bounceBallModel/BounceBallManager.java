package bounceBallModel;

import java.util.ArrayList;
import java.util.Random;

import bounceBallView.BounceBallWindow;

public class BounceBallManager {
	private ArrayList<BounceBall> bounceBallList = new ArrayList<BounceBall>();
	private Boolean ballsMove;
	private int bounceBallIndex;
	private BounceBallBox bounceBallBox;
	private BounceBallWindow bounceBallWindow;
	
	public BounceBallManager() {
		// TODO Auto-generated constructor stub
		this.ballsMove=true;
		this.bounceBallIndex=0;
		this.bounceBallBox=new BounceBallBox();
	}
	
	public void ballCreate(){
		BounceBall bounceBall;
		Random random = new Random();
		bounceBall = new BounceBall(bounceBallBox.getBallBoxPositionX()+random.nextInt(bounceBallBox.getBallBoxWidth()),
									bounceBallBox.getBallBoxPositionY()+random.nextInt(bounceBallBox.getBallBoxHeight()),
									random.nextInt(1)*2-1,
									random.nextInt(1)*2-1,
									10);
		bounceBallList.add(bounceBall);
		bounceBallIndex++;
	}
	
	public void ballDelete(){
		if(!bounceBallList.isEmpty()){
			bounceBallList.remove((bounceBallIndex--)-1);
		}
		else {
			bounceBallWindow.cantDeleteBounceBallPopupMessage();
		}
	}

	public Boolean getBallsMove() {
		return ballsMove;
	}

	public void setBallsMove(Boolean ballsMove) {
		this.ballsMove = ballsMove;
	}

	public ArrayList<BounceBall> getBallList() {
		return bounceBallList;
	}

	public void setBounceBallWindow(BounceBallWindow bounceBallWindow) {
		this.bounceBallWindow = bounceBallWindow;
	}

	public BounceBallBox getBounceBallBox() {
		return bounceBallBox;
	}
}
