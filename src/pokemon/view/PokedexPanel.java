package pokemon.view;

import pokemon.controller.PokedexController;
import pokemon.model.Pokemon;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Color;

public class PokedexPanel extends JPanel
{
	private PokedexController app;
	private SpringLayout appLayout;
	
	private JButton changeButton;
	private JButton saveButton;
	private JComboBox<String> pokedexDropDown;
	
	private JTextField healthField;
	private JTextField attackField;
	private JTextField enhancementField;
	private JTextField numberField;
	private JTextField nameField;
	private JTextField evolveField;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel enhancementModifierLabel;
	private JLabel numberLabel;
	private JLabel nameLabel;
	private JLabel canEvolveLabel;
	private JLabel imageLabel;
	
	private ImageIcon pokemonIcon;
	
	public PokedexPanel(PokedexController appController)
	{
		super();
		this.app = appController;
		appLayout = new SpringLayout();
		
		this.pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/pokeball.jpeg"));
		
		changeButton = new JButton("Click here to edit your pokemon!");
		saveButton = new JButton("Click here to save all your pokemon!");
		pokedexDropDown = new JComboBox<String>();
		
		healthField = new JTextField("0");
		attackField = new JTextField("0");
		enhancementField = new JTextField("0");
		numberField = new JTextField("0");
		numberField.setHorizontalAlignment(SwingConstants.TRAILING);
		evolveField = new JTextField("False");
		appLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, evolveField);
		nameField = new JTextField("MissingNo.");
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 63, SpringLayout.SOUTH, numberField);
		numberField.setEnabled(false);
		
		healthLabel = new JLabel("Health Points:");
		attackLabel = new JLabel("Attack Points:");
		enhancementModifierLabel = new JLabel("Enhancement Modifier:");
		numberLabel = new JLabel("Pokemon Number:");
		nameLabel = new JLabel("Pokemon Name:");
		canEvolveLabel = new JLabel("Can Evolve:");
		imageLabel = new JLabel("Pokemon goes here", pokemonIcon, JLabel.CENTER);
		
		setupDropdown();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.darkGray);
		
		this.add(changeButton);
		this.add(saveButton);
		this.add(pokedexDropDown);
		
		this.add(healthField);
		this.add(attackField);
		this.add(enhancementField);
		this.add(numberField);
		this.add(nameField);
		this.add(evolveField);
		
		this.add(healthLabel);
		this.add(attackLabel);
		this.add(enhancementModifierLabel);
		this.add(numberLabel);
		this.add(nameLabel);
		this.add(canEvolveLabel);
		this.add(imageLabel);
		
		imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
		imageLabel.setHorizontalTextPosition(JLabel.CENTER);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropDown, 0, SpringLayout.WEST, imageLabel);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropDown, 0, SpringLayout.EAST, imageLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 128, SpringLayout.EAST, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropDown, 1, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, changeButton, 40, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, changeButton, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 1, SpringLayout.EAST, changeButton);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 262, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, enhancementModifierLabel, -394, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 72, SpringLayout.SOUTH, enhancementModifierLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, healthLabel, -72, SpringLayout.NORTH, enhancementModifierLabel);
		appLayout.putConstraint(SpringLayout.NORTH, enhancementModifierLabel, 144, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, enhancementModifierLabel, 262, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 262, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, -422, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 262, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, -436, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 72, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, canEvolveLabel, 262, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, canEvolveLabel, -466, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, canEvolveLabel, 72, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 0, SpringLayout.NORTH, changeButton);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 63, SpringLayout.SOUTH, healthField);
		appLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, healthField);
		appLayout.putConstraint(SpringLayout.NORTH, enhancementField, 63, SpringLayout.SOUTH, attackField);
		appLayout.putConstraint(SpringLayout.EAST, enhancementField, 0, SpringLayout.EAST, healthField);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 63, SpringLayout.SOUTH, enhancementField);
		appLayout.putConstraint(SpringLayout.EAST, numberField, 0, SpringLayout.EAST, healthField);
		appLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, healthField);
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, 63, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, evolveField, 0, SpringLayout.EAST, healthField);
		appLayout.putConstraint(SpringLayout.WEST, enhancementField, 121, SpringLayout.EAST, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 72, SpringLayout.EAST, enhancementModifierLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 72, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, -21, SpringLayout.EAST, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 51, SpringLayout.EAST, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolveField, 120, SpringLayout.EAST, canEvolveLabel);
		appLayout.putConstraint(SpringLayout.NORTH, imageLabel, 34, SpringLayout.SOUTH, changeButton);
		appLayout.putConstraint(SpringLayout.EAST, imageLabel, -19, SpringLayout.WEST, attackLabel);
	}
	
	private void setupDropdown()
	{
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>(app.buildPokedexText());
		pokedexDropDown.setModel(temp);
	}
	
	private void sendDataToController()
	{
		int index = pokedexDropDown.getSelectedIndex();
		if(app.isInt(attackField.getText()) && app.isDouble(enhancementField.getText()) && app.isInt(healthField.getText()))
		{
			String [] data = new String[5];
			
			//code goes here
			app.updatePokemon(index, data);
		}
	}
	
	private void changeImageDisplay(String name)
	{
		String path = "/pokemon/view/images/";
		String defaultName = "pokeball";
		String extension = ".jpeg";
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name.toLowerCase() + extension));
		}
		catch (NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		imageLabel.setIcon(pokemonIcon);
		repaint();
	}
	
	private void updateFields(int index)
	{
		String [] data = app.getPokemonData(index);
		healthField.setText(data[0]);
		attackField.setText(data[1]);
		enhancementField.setText(data[2]);
		numberField.setText(data[3]);
		nameField.setText(data[4]);
		evolveField.setText(data[5]);
	}
	
	private void setupListeners()
	{
		changeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				sendDataToController();
			}
		});
		
		pokedexDropDown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				String name = pokedexDropDown.getSelectedItem().toString();
				changeImageDisplay(name);
				int index;
				switch(name)
				{
				case "Ivysaur":
					index = 0;
					break;
				case "Flareon":
					index = 1;
					break;
				case "Charizard":
					index = 2;
					break;
				case "Pikachu":
					index = 3;
					break;
				case "Squirtle":
					index = 4;
					break;
				case "Samus":
					index = 5;
					break;
				default:
					index = 0;
				}
				if(name.equals("Select a Pokemon"))
				{
					healthField.setText("0");
					attackField.setText("0");
					enhancementField.setText("0");
					numberField.setText("0");
					nameField.setText("MissingNo.");
					evolveField.setText("false");
					imageLabel.setText("Pokemon goes here");
				}
				else
				{
					updateFields(index);
					imageLabel.setText(nameField.getText());
				}
			}
		});
		
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				app.savePokedex();
			}
		});
	}
}
