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
	private JLabel typeLabel;
	private JLabel nameLabel;
	private JLabel evolvableLable;
	private JLabel modiferLabel;
	private JLabel iconLabel;
	private JLabel numberLabel;
	
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
		setBackground(new Color(135, 206, 250));
		this.appController = appController;

		appLayout 		= new SpringLayout();
		evolvableBox 	= new JCheckBox();
		nameField 		= new JTextField("name");
		numberField 		= new JTextField("##");
		attackField 		= new JTextField("ap");
		healthField 		= new JTextField("hp");
		modifierField 	= new JTextField("mod");
		iconLabel 		= new JLabel("", new ImageIcon(getClass().getResource("/pokemon/view/images/Pokeball.png")), JLabel.CENTER);
		iconLabel.setBackground(new Color(135, 206, 250));
		typeLabel 		= new JLabel("Type");
		nameLabel 		= new JLabel("name");
		evolvableLable 	= new JLabel("Evolvable");
		numberLabel 		= new JLabel("");
		attackLabel 		= new JLabel("");
		healthLabel 		= new JLabel("");
		modiferLabel 	= new JLabel("");
		pokedexDropdown 	= new JComboBox();
		clearButton 		= new JButton("clear");
		saveButton 		= new JButton("Save");
		descriptionArea 	= new JTextArea(4,15);
		typeArea 		= new JTextArea(1,1);
		firstType 		= new JPanel();
		secondType 		= new JPanel();
		thirdType 		= new JPanel();
		fourthType 		= new JPanel();
		
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
	
	private void updateTypePanels()
	{
		String[] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
		
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
				int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
				updatePokedexInfo(selectedPokemonIndex);
				//updateImage();
				//updateTypePanels();
				repaint();
			}
		});
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(healthLabel);
		this.add(attackLabel);
		this.add(healthLabel);
		this.add(nameLabel);
		this.add(typeLabel);
		this.add(evolvableLable);
		this.add(modiferLabel);
		this.add(iconLabel);
		this.add(numberLabel);
		this.add(evolvableBox);
		this.add(nameField);
		this.add(numberField);
		this.add(attackField);
		this.add(healthField);
		this.add(modifierField);
		this.add(descriptionArea);
		this.add(typeArea);
		this.add(saveButton);
		this.add(clearButton);
		this.add(pokedexDropdown);
		this.add(firstType);
		this.add(secondType);
		
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, typeArea, 0, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.EAST, typeArea, 0, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.WEST, typeArea, 17, SpringLayout.EAST, secondType);
		appLayout.putConstraint(SpringLayout.EAST, nameField, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 22, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 236, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 0, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 6, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 81, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 1, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, 113, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, modifierField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.EAST, modifierField, 0, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel, 0, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.WEST, iconLabel, 62, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, iconLabel, -132, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, iconLabel, -26, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, clearButton, 262, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, clearButton, 0, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, -119, SpringLayout.WEST, saveButton);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 0, SpringLayout.NORTH, clearButton);
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 0, SpringLayout.WEST, typeLabel);
		appLayout.putConstraint(SpringLayout.EAST, typeLabel, -6, SpringLayout.WEST, firstType);
		appLayout.putConstraint(SpringLayout.WEST, firstType, 333, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, firstType, -93, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, secondType, 6, SpringLayout.EAST, firstType);
		appLayout.putConstraint(SpringLayout.EAST, secondType, -63, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 7, SpringLayout.SOUTH, descriptionArea);
		appLayout.putConstraint(SpringLayout.NORTH, descriptionArea, 6, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, descriptionArea, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, descriptionArea, -44, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, descriptionArea, 0, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 6, SpringLayout.SOUTH, modifierField);
		appLayout.putConstraint(SpringLayout.NORTH, typeLabel, 168, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, typeLabel, 268, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, evolvableBox, 6, SpringLayout.EAST, evolvableLable);
		appLayout.putConstraint(SpringLayout.SOUTH, evolvableBox, 0, SpringLayout.SOUTH, evolvableLable);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableLable, 6, SpringLayout.SOUTH, modifierField);
		appLayout.putConstraint(SpringLayout.SOUTH, evolvableLable, -6, SpringLayout.NORTH, typeLabel);
		appLayout.putConstraint(SpringLayout.EAST, evolvableLable, 0, SpringLayout.EAST, typeLabel);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 0, SpringLayout.SOUTH, iconLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -106, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, -6, SpringLayout.WEST, typeLabel);
		appLayout.putConstraint(SpringLayout.NORTH, firstType, 168, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, firstType, -16, SpringLayout.NORTH, descriptionArea);
		appLayout.putConstraint(SpringLayout.NORTH, secondType, 29, SpringLayout.SOUTH, modifierField);
		appLayout.putConstraint(SpringLayout.SOUTH, secondType, -16, SpringLayout.NORTH, descriptionArea);
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
