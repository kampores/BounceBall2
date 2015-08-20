package bounceBallView;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

import bounceBallModel.BounceBall;
import bounceBallModel.BounceBallBox;
import bounceBallModel.BounceBallManager;

public class BounceBallDrawComponent extends JComponent{
	/**
	 * 
	 */
	private static final long serialVersionUID = 557039908685975768L;
	
	private BounceBallManager bounceBallManager;
	private BounceBallBox bounceBallBox;
	
	public BounceBallDrawComponent(BounceBallManager bounceBallManager) {
		// TODO Auto-generated constructor stub
		this.bounceBallManager=bounceBallManager;
		this.bounceBallBox=bounceBallManager.getBounceBallBox();
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.fillRect(bounceBallBox.getBallBoxPositionX(), bounceBallBox.getBallBoxPositionY(), bounceBallBox.getBallBoxWidth(), bounceBallBox.getBallBoxHeight());
		for (BounceBall bounceBall:bounceBallManager.getBallList()){
			g.setColor(Color.RED);
			g.fillOval(bounceBall.getBallPositionX(),bounceBall.getBallPositionY(),bounceBall.getBallRadius()*2,bounceBall.getBallRadius()*2);			
		}
	}
}
