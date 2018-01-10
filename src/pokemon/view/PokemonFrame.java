package pokemon.view;

import pokemon.controller.PokemonController;
import pokemon.view.PokemonPanel;
import javax.swing.JFrame;

public class PokemonFrame extends JFrame
{
	private PokemonController appController;
	private PokemonPanel appPanel;
	
	/**
	 * creates the PokemonFrame, calls setupframe
	 * @param PokemonController appController
	 */
	public PokemonFrame(PokemonController appController)
	{
		super();
		this.appController = appController;
		appPanel = new PokemonPanel(appController);
		setupFrame();
	}
	
	/**
	 * Sets the settings for the PokemonFrame
	 */
	private void setupFrame()
	{	
		this.setContentPane(appPanel);
		this.setSize(600,320);
		this.setTitle("Gotta catch em all");
		this.setResizable(false);
		this.setVisible(true);
	}
	
	/**
	 * Getter for the appController
	 * @return
	 */
	public PokemonController getBaseController()
	{
		return(appController);
	}
}
