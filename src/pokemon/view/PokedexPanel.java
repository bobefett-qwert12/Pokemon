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
	
	public PokedexPanel(PokedexController appController)
	{
		super();
		this.appController = appController;
		appLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.darkGray);
		//this.add();
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
