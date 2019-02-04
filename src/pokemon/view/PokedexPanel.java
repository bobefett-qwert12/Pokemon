package pokemon.view;

import pokemon.controller.PokedexController;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Color;

public class PokedexPanel extends JPanel
{
	private PokedexController appController;
	private SpringLayout appLayout;
	private JTextField healthPointsText;
	private JTextField attackPointsText;
	private JTextField enhancementModifierText;
	private JTextField numberText;
	private JTextField nameText;
	private JTextField canEvolveText;
	private JLabel healthPointsLabel;
	private JLabel attackPointsLabel;
	private JLabel enhancementModifierLabel;
	private JLabel numberLabel;
	private JLabel nameLabel;
	private JLabel canEvolveLabel;
	
	public PokedexPanel(PokedexController appController)
	{
		super();
		this.appController = appController;
		appLayout = new SpringLayout();
		
		healthPointsText = new JTextField("");
		attackPointsText = new JTextField("");
		enhancementModifierText = new JTextField("");
		numberText = new JTextField("");
		nameText = new JTextField("");
		canEvolveText = new JTextField("");
		healthPointsLabel = new JLabel("Health Points:");
		attackPointsLabel = new JLabel("Attack Points:");
		enhancementModifierLabel = new JLabel("Enhancement Modifier:");
		numberLabel = new JLabel("Pokemon Number:");
		nameLabel = new JLabel("Pokemon Name:");
		canEvolveLabel = new JLabel("Can Evolve:");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.darkGray);
		this.add(healthPointsText);
		this.add(attackPointsText);
		this.add(enhancementModifierText);
		this.add(numberText);
		this.add(nameText);
		this.add(canEvolveText);
		this.add(healthPointsLabel);
		this.add(attackPointsLabel);
		this.add(enhancementModifierLabel);
		this.add(numberLabel);
		this.add(nameLabel);
		this.add(canEvolveLabel);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
