package bounceBallView;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BallControlButtonPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4814115430744001645L;
	private JButton bounceBallStartStopButton;
	private JButton bounceBallAddButton;
	private JButton bounceBallDeleteButton;
	public static final String BounceBallStartStopButtonName="Start/Stop";
	public static final String BounceBallAddButtonName="Ball Add";
	public static final String BounceBallDeleteButtonName="Ball Delete";
	
	public BallControlButtonPanel() {
		// TODO Auto-generated constructor stub
		bounceBallStartStopButton = new JButton(BounceBallStartStopButtonName);
		bounceBallAddButton = new JButton(BounceBallAddButtonName);
		bounceBallDeleteButton = new JButton(BounceBallDeleteButtonName);
		add(bounceBallStartStopButton);
		add(bounceBallAddButton);		
		add(bounceBallDeleteButton);		
	}

	public void setBounceBallAction(BounceBallAction bounceBallAction) {
		bounceBallStartStopButton.addActionListener(bounceBallAction);
		bounceBallAddButton.addActionListener(bounceBallAction);
		bounceBallDeleteButton.addActionListener(bounceBallAction);
	}
}