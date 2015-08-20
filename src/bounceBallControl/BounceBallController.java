package bounceBallControl;

import bounceBallModel.BounceBall;
import bounceBallModel.BounceBallBox;
import bounceBallModel.BounceBallManager;
import bounceBallView.BounceBallWindow;

public class BounceBallController {
	
	private BounceBallManager bounceBallManager;
	private BounceBallBox bounceBallBox;
	private BounceBallWindow bounceBallWindow;
	
	public BounceBallController() {
		// TODO Auto-generated constructor stub
		bounceBallManager = new BounceBallManager();
		bounceBallWindow = new BounceBallWindow(this,bounceBallManager);
		this.bounceBallBox=bounceBallManager.getBounceBallBox();
		bounceBallControl();
	}
	
	public void ballMoveControl(){
		if (bounceBallManager.getBallsMove()) {
			bounceBallManager.setBallsMove(false);
		} else {
			bounceBallManager.setBallsMove(true);
		}
	}
	
	private void bounceBallControl(){
		while(true){
			if (bounceBallManager.getBallsMove()){
				for (BounceBall bounceBall:bounceBallManager.getBallList()){
					ballDirectionControl(bounceBall);
					ballMove(bounceBall);					
				}
			}
			bounceBallWindow.redraw();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	private void ballDirectionControl(BounceBall bounceBall){
		if (bounceBall.getBallPositionX() < bounceBallBox.getBallBoxPositionX()) bounceBall.setBallDirectionX(1);
		if (bounceBall.getBallPositionX() > bounceBallBox.getBallBoxPositionX()+bounceBallBox.getBallBoxWidth()-bounceBall.getBallRadius()*2) bounceBall.setBallDirectionX(-1);
		if (bounceBall.getBallPositionY() < bounceBallBox.getBallBoxPositionY()) bounceBall.setBallDirectionY(1);
		if (bounceBall.getBallPositionY() > bounceBallBox.getBallBoxPositionY()+bounceBallBox.getBallBoxHeight()-bounceBall.getBallRadius()*2) bounceBall.setBallDirectionY(-1);
	}
	
	private void ballMove(BounceBall bounceBall) {
		bounceBall.setBallPositionX(bounceBall.getBallPositionX()+bounceBall.getBallDirectionX());
		bounceBall.setBallPositionY(bounceBall.getBallPositionY()+bounceBall.getBallDirectionY());
	}
	
	public static void main(String[] args) {
		new BounceBallController();
	}
}
