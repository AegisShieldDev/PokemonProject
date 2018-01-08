package pokemon.view;

import pokemon.controller.*;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

import pokemon.controller.PokemonController;

public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	private SpringLayout appLayout;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel evolvableLable;
	private JLabel modiferLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;

	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		appLayout = new SpringLayout();
		
		evolvableBox = new JCheckBox();
		nameField = JTextField("name");
		numberField = new JTextField("##");
		attackField = new JTextField("ap");
		healthField = new JTextField("hp");
		modifierField = new JTextField("mod");
		
		iconLabel = new JLabel("", new ImageIcon(getClass().getResource("/pokemon/view/images/Pokeball.png")), JLabel.CENTER);
		
		nameLabel = new JLabel("name");
		evolvableLabel new JLabel("evolvable");
		numberLabel = new JLabel("");
		attackLabel = new JLabel("");
		healthLabel = new JLabel("");
		modifierLabel = new JLabel("");
		
		pokedexDropdown = new JComboBox();
		clearButton = new JButton("clear");
		saveButton = new JButton("Save");
		
		descriptionArea = new JTextArea(4,15);
		
		firstType = new JPanel();
		secondType = new JPanel();
		thirdType = new JPanel();
		fourthType = new JPanel();
		
		setupComboBox();
		setupTypePanels();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	
	private void setupTypePanels()
	{
		firstType.setSize(50,50);
		secondType.setSize(50,50);
		thirdType.setSize(50,50);
		fourthType.setSize(50,50);
	}
	
	private void updatTypePanels()
	{
		String[] types = appController.getPokedex().get(pokedexDropown.getSelectedIndex()).getPokemonTypes();
		
		if(types[0].equals("Flying"))
		{
			firstType.setBackground(Color.LIGHT_GRAY);
		}
		if(types[0].equals("Fighting"))
		{
			firstType.setBackground(Color.ORANGE);
		}
		if(types[0].equals("Psychic"))
		{
			firstType.setBackground(Color.PINK);
		}
		if(types[0].equals("Steel"))
		{
			firstType.setBackground(Color.DARK_GRAY);
		}
		else
		{
			firstType.setBackground(Color.RED);
		}
		
		if (types.length > 1)
		{
			if(types[1].equals("Flying"))
			{
				secondType.setBackground(Color.LIGHT_GRAY);
			}
			if(types[1].equals("Fighting"))
			{
				secondType.setBackground(Color.ORANGE);
			}
			if(types[1].equals("Psychic"))
			{
				secondType.setBackground(Color.PINK);
			}
			if(types[1].equals("Steel"))
			{
				secondType.setBackground(Color.DARK_GRAY);
			}
			else
			{
				secondType.setBackground(Color.RED);
			}
			
		}
	}
	
	private void setupListeners()
	{
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selectedPokemonIndex = pokedexDpdown.getSelectedIndex();
				updatePokedexInfo(selectedPokemonIndex);
				updateImage();
				updateTypePanels();
				repaint();
			}
		});
	}
	
	private void updatePokedexInfo(int index)
	{
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
	}
}
