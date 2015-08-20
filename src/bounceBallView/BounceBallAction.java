package bounceBallView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bounceBallControl.BounceBallController;
import bounceBallModel.BounceBallManager;

public class BounceBallAction implements ActionListener{
	
	private BounceBallController bounceBallController;
	private BounceBallManager bounceBallManager;	
	
	public BounceBallAction(BounceBallController bounceBallController,BounceBallManager bounceBallManager) {
		// TODO Auto-generated constructor stub
		this.bounceBallController=bounceBallController;
		this.bounceBallManager=bounceBallManager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String buttonString=e.getActionCommand();
		if(buttonString.equals(BallControlButtonPanel.BounceBallStartStopButtonName))	bounceBallController.ballMoveControl();
		if(buttonString.equals(BallControlButtonPanel.BounceBallAddButtonName))	bounceBallManager.ballCreate();
		if(buttonString.equals(BallControlButtonPanel.BounceBallDeleteButtonName))	bounceBallManager.ballDelete();
	};

}
