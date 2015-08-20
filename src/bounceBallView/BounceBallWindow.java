package bounceBallView;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import bounceBallControl.BounceBallController;
import bounceBallModel.BounceBallManager;

public class BounceBallWindow {
	private JFrame bounceBallFrame;
	private BallControlButtonPanel ballControlButtonPanel;
	private JComponent bounceBallDrawComponent;
	private BounceBallAction bounceBallAction;
	
	public BounceBallWindow(BounceBallController bounceBallController,BounceBallManager bounceBallManager) {
		// TODO Auto-generated constructor stub
		bounceBallManager.setBounceBallWindow(this);
		bounceBallFrame=new JFrame("Bounce Ball");
		bounceBallAction = new BounceBallAction(bounceBallController,bounceBallManager);
		ballControlButtonPanel=new BallControlButtonPanel();
		ballControlButtonPanel.setBounceBallAction(bounceBallAction);
		bounceBallDrawComponent=new BounceBallDrawComponent(bounceBallManager);
		bounceBallFrame.setSize(500, 500);
		bounceBallFrame.setLocation(500, 500);
		bounceBallFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bounceBallFrame.add(ballControlButtonPanel, BorderLayout.NORTH);
		bounceBallFrame.add(bounceBallDrawComponent, BorderLayout.CENTER);
		bounceBallFrame.setVisible(true);
	}
	
	public void redraw() {
		bounceBallDrawComponent.repaint();
	}
	
	public void cantDeleteBounceBallPopupMessage(){
		JOptionPane.showMessageDialog(bounceBallFrame, "더 지울 공이 없습니다.");		
	}
	
}
