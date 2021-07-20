import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;


public class IndustryProjectsFinal extends Application {   
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {   
		TabPane tabPane = new TabPane();
		
		//utah standard
		Tax taxRate = new Tax();
		
		MenuBar menuBar = new MenuBar();

		Menu menuTax = new Menu("Tax");
		menuBar.getMenus().addAll(menuTax);
		
		MenuItem menuItemTax = new MenuItem("Change Tax Rate");
		menuTax.getItems().add(menuItemTax);

		
		menuItemTax.setOnAction(e -> {
			GridPane gp2 = new GridPane();
			
			Label taxText = new Label("Tax Rate: %");
			TextField tfTax = new TextField(String.valueOf(taxRate.getTax() * 100));
			Button bTax = new Button("Enter New Tax Rate");
			
			bTax.setOnAction(b -> {
				if (tfTax.getText().matches("[0-9]+")) 
					taxRate.setTax((Double.valueOf(tfTax.getText()) / 100));
			});
			
			gp2.add(taxText,0,0);
			gp2.add(tfTax,1,0);
			gp2.add(bTax,0,1);
			
			Scene scene2 = new Scene(gp2,230,100);
			
			Stage newWindow = new Stage();
			newWindow.setTitle("Tax");
			newWindow.setScene(scene2);
			
			newWindow.show();
		});
		
		//tab 1
		Tab tab1 = new Tab("Mickey D");
		GridPane pane1 = new GridPane();
		Label text1 = new Label("Menu:");
		Label text2 = new Label("Cheez Borg - $2.49");
		Label text3 = new Label("Deez Peanuts - $1.49");
		Label text4 = new Label("Soda Surpreme - $0.99");
		Label text5 = new Label("Sunday Sundae - $0.99");
		TextField tf1 = new TextField("0");
		tf1.setAlignment(Pos.BASELINE_RIGHT);
		TextField tf2 = new TextField("0");
		tf2.setAlignment(Pos.BASELINE_RIGHT);
		TextField tf3 = new TextField("0");
		tf3.setAlignment(Pos.BASELINE_RIGHT);
		TextField tf4 = new TextField("0");
		tf4.setAlignment(Pos.BASELINE_RIGHT);
		pane1.add(text1,0,0);
		pane1.add(text2,0,1);
		pane1.add(text3,0,2);
		pane1.add(text4,0,3);
		pane1.add(text5,0,4);
		pane1.add(tf1,1,1);
		pane1.add(tf2,1,2);
		pane1.add(tf3,1,3);
		pane1.add(tf4,1,4);
		pane1.setHgap(30.0);
		tab1.setContent(pane1);
		
		//tab 2
		Tab tab2 = new Tab("Bib Bibbon");
		GridPane pane2 = new GridPane();
		Label text12 = new Label("Menu:");
		Label text22 = new Label("Bibbon Burger - $1.49");
		Label text32 = new Label("Apple - $0.99");
		Label text42 = new Label("Rabbit Stew - $2.99");
		Label text52 = new Label("Mystery Meat - $0.01");
		TextField tf12 = new TextField("0");
		tf12.setAlignment(Pos.BASELINE_RIGHT);
		TextField tf22 = new TextField("0");
		tf22.setAlignment(Pos.BASELINE_RIGHT);
		TextField tf32 = new TextField("0");
		tf32.setAlignment(Pos.BASELINE_RIGHT);
		TextField tf42 = new TextField("0");
		tf42.setAlignment(Pos.BASELINE_RIGHT);
		pane2.add(text12,0,0);
		pane2.add(text22,0,1);
		pane2.add(text32,0,2);
		pane2.add(text42,0,3);
		pane2.add(text52,0,4);
		pane2.add(tf12,1,1);
		pane2.add(tf22,1,2);
		pane2.add(tf32,1,3);
		pane2.add(tf42,1,4);
		pane2.setHgap(39.0);
		tab2.setContent(pane2);
		
		//tab 3
		Tab tab3 = new Tab("Roasty's");
		GridPane pane3 = new GridPane();
		Label text13 = new Label("Menu:");
		Label text23 = new Label("Burnt Burger - $2.49");
		Label text33 = new Label("Soda Bran - $0.98");
		Label text43 = new Label("A Fake Salad - $3.99");
		Label text53 = new Label("A Real Salad - $99.99");
		TextField tf13 = new TextField("0");
		tf13.setAlignment(Pos.BASELINE_RIGHT);
		TextField tf23 = new TextField("0");
		tf23.setAlignment(Pos.BASELINE_RIGHT);
		TextField tf33 = new TextField("0");
		tf33.setAlignment(Pos.BASELINE_RIGHT);
		TextField tf43 = new TextField("0");
		tf43.setAlignment(Pos.BASELINE_RIGHT);
		pane3.add(text13,0,0);
		pane3.add(text23,0,1);
		pane3.add(text33,0,2);
		pane3.add(text43,0,3);
		pane3.add(text53,0,4);
		pane3.add(tf13,1,1);
		pane3.add(tf23,1,2);
		pane3.add(tf33,1,3);
		pane3.add(tf43,1,4);
		pane3.setHgap(40.0);
		tab3.setContent(pane3);
		
		//tab4
		Tab tab4 = new Tab("Lucky Land");
		GridPane pane4 = new GridPane();
		Label text14 = new Label("Menu:");
		Label text24 = new Label("JoJo Meal - $5.49");
		Label text34 = new Label("HamonBurger - $3.49");
		Label text44 = new Label("Coca Cola - $0.99");
		Label text54 = new Label("Spaghetti Di Nero - $4.99");
		TextField tf14 = new TextField("0");
		tf14.setAlignment(Pos.BASELINE_RIGHT);
		TextField tf24 = new TextField("0");
		tf24.setAlignment(Pos.BASELINE_RIGHT);
		TextField tf34 = new TextField("0");
		tf34.setAlignment(Pos.BASELINE_RIGHT);
		TextField tf44 = new TextField("0");
		tf44.setAlignment(Pos.BASELINE_RIGHT);
		pane4.add(text14,0,0);
		pane4.add(text24,0,1);
		pane4.add(text34,0,2);
		pane4.add(text44,0,3);
		pane4.add(text54,0,4);
		pane4.add(tf14,1,1);
		pane4.add(tf24,1,2);
		pane4.add(tf34,1,3);
		pane4.add(tf44,1,4);
		pane4.setHgap(16.0);
		tab4.setContent(pane4);

		//add tabs to pane
		tabPane.getTabs().addAll(tab1, tab2, tab3, tab4);
		
		GridPane gpTotal = new GridPane();
		Label lTotal = new Label("Total: $0.00");
		Label lNotif = new Label(" ");
		Button bTotal = new Button("Order!");
		
		bTotal.setOnAction (e -> {
			double temp = 0.0;
			
			switch (tabPane.getSelectionModel().getSelectedIndex()){
				case 0:
					if (tf1.getText().matches("[0-9]+") && tf2.getText().matches("[0-9]+") && tf3.getText().matches("[0-9]+") && tf4.getText().matches("[0-9]+")){
						temp = (Integer.valueOf(tf1.getText()) * 2.49) + (Integer.valueOf(tf2.getText()) * 1.49) + 	(Integer.valueOf(tf3.getText()) * 0.99) + (Integer.valueOf(tf4.getText()) * 0.99);
						lTotal.setText("Total: $" + ((double)((int)((temp + (temp*taxRate.getTax()))*100)))/100);
						lNotif.setText("Please have the money ready when the delivery \nshows up! Enjoy your food~!");
					}
					else{
						lNotif.setText("Incompatable values placed in Textfields, \nplease try again.");
					}
					break;
				case 1:
					if (tf12.getText().matches("[0-9]+") && tf22.getText().matches("[0-9]+") && tf32.getText().matches("[0-9]+") && tf42.getText().matches("[0-9]+")){
						temp = (Integer.valueOf(tf12.getText()) * 1.49) + (Integer.valueOf(tf22.getText()) * 0.99) + 	(Integer.valueOf(tf32.getText()) * 2.99) + (Integer.valueOf(tf42.getText()) * 0.01);
						lTotal.setText("Total: $" + ((double)((int)((temp + (temp*taxRate.getTax()))*100)))/100);
						lNotif.setText("Please have the money ready when the delivery \nshows up! Enjoy your food~!");
					}
					else{
						lNotif.setText("Incompatable values placed in Textfields, \nplease try again.");
					}

					break;
				case 2:
					if (tf13.getText().matches("[0-9]+") && tf23.getText().matches("[0-9]+") && tf33.getText().matches("[0-9]+") && tf43.getText().matches("[0-9]+")){
						temp = (Integer.valueOf(tf13.getText()) * 2.49) + (Integer.valueOf(tf23.getText()) * 0.98) + 	(Integer.valueOf(tf33.getText()) * 3.99) + (Integer.valueOf(tf43.getText()) * 99.99);
						lTotal.setText("Total: $" + ((double)((int)((temp + (temp*taxRate.getTax()))*100)))/100);
						lNotif.setText("Please have the money ready when the delivery \nshows up! Enjoy your food~!");
					}
					else{
						lNotif.setText("Incompatable values placed in Textfields, \nplease try again.");
					}

					break;
				case 3:
					if (tf14.getText().matches("[0-9]+") && tf24.getText().matches("[0-9]+") && tf34.getText().matches("[0-9]+") && tf44.getText().matches("[0-9]+")){
						temp = (Integer.valueOf(tf14.getText()) * 5.49) + (Integer.valueOf(tf24.getText()) * 3.49) + 	(Integer.valueOf(tf34.getText()) * 0.99) + (Integer.valueOf(tf44.getText()) * 4.99);
						lTotal.setText("Total: $" + ((double)((int)((temp + (temp*taxRate.getTax()))*100)))/100);
						lNotif.setText("Please have the money ready when the delivery \nshows up! Enjoy your food~!");
					}
					else{
						lNotif.setText("Incompatable values placed in Textfields, \nplease try again.");
					}
			}
		});
		
		gpTotal.add(bTotal,0,0);
		gpTotal.add(lTotal,0,1);
		gpTotal.add(lNotif,0,2);
		
		tabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		
		Label padding = new Label(" ");
		
		VBox vbox = new VBox();
		vbox.getChildren().addAll(menuBar,tabPane,padding,gpTotal);
		
		Scene scene = new Scene(vbox, 350, 300);  
		primaryStage.setTitle("Meal Order!"); // Set the window title
		primaryStage.setResizable(false); // bah screw resizing!
		primaryStage.setScene(scene); // Place the scene in the window
		primaryStage.show(); // Display the window
	}

	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 * line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
	
	
}

class Tax{
	double tax;
	
	Tax(){
		tax = 0.047;
	}
		
	void setTax(double newTax){
		tax = newTax;
	}
	
	double getTax(){
		return tax;
	}
}