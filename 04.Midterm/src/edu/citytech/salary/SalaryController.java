package edu.citytech.salary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class SalaryController {

	@FXML
	private AnchorPane ancBox;

	@FXML
	private TextField OverTimeDiplay;

	@FXML
	private TextField RegularHoursDisplay;

	@FXML
	private TextField OverTimePayDisplay;

	@FXML
	private TextField RegularPayDisplay;

	@FXML
	private TextField WeeklyPayDisplay;

	@FXML
	private TextField YearlyPayDisplay;


	@FXML
	private TextField txtfd_HourlyWage;

	@FXML
	private TextField txtfd_HoursWork;
	
	@FXML
    private TextField NetSalaryDisplay;

    @FXML
    private TextField MarginalTaxDisplay;


	@FXML
	void calculate(ActionEvent event) {

		double hoursWorked, hourlyPay, RegularPay, RegularHour, OverTime,
		OverTimePay, WeeklyPay, YearlyPay;
		double tax = 0, net = 0;
		hoursWorked = Double.parseDouble(txtfd_HoursWork.getText());
		hourlyPay = Double.parseDouble(txtfd_HourlyWage.getText());

		if (hoursWorked <= 40) {
			RegularHour = hoursWorked;
			hoursWorked = RegularHour;
			OverTimePay = 0;
			OverTime = 0;
			RegularPay = hoursWorked * hourlyPay;
			WeeklyPay = RegularPay;
			YearlyPay = WeeklyPay * 52;

			tax = YearlyPay;
			if (tax >= 0 && tax <= 9_699.99  ) {
				tax = 10 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}
			else if(tax >= 9_699.99 && tax <= 39_474.99  ) {
				tax = 12 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}
			else if( tax >= 39_474.99 && tax <= 84_199.99) {
				tax = 22 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}
			
			else if( tax >= 84_200.00 && tax <= 160_725.999) {
				tax = 24 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}
			
			else if( tax >= 160_725.999 && tax <= 204_100.999) {
				tax = 32 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}
			
			else if( tax >= 204_100.999 && tax <= 400_999.999) {
				tax = 35 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}

			else if( tax >= 400_999.999 && tax >= 550_999.999) {
				tax = 37 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}

			
		}

		else {
			OverTime = hoursWorked - 40;
			OverTimePay = OverTime * 1.5 * hourlyPay;
			RegularHour = 40;
			hoursWorked = RegularHour;
			RegularPay = 40 * hourlyPay;
			WeeklyPay = OverTimePay + RegularPay;
			YearlyPay = WeeklyPay * 52;
			
			tax = YearlyPay + OverTime;
			if (tax >= 0 && tax <= 9_699.99  ) {
				tax = 10 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}
			else if(tax >= 9_699.99 && tax <= 39_474.99  ) {
				tax = 12 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}
			else if( tax >= 39_474.99 && tax <= 84_199.99) {
				tax = 22 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}
			
			else if( tax >= 84_200.00 && tax <= 160_725.999) {
				tax = 24 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}
			
			else if( tax >= 160_725.999 && tax <= 204_100.999) {
				tax = 32 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}
			
			else if( tax >= 204_100.999 && tax <= 400_999.999) {
				tax = 35 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}

			else if( tax >= 400_999.999 && tax >= 550_999.999) {
				tax = 37 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}




		}

		OverTimeDiplay.setText(Double.toString(OverTime) + "0");
		RegularHoursDisplay.setText(Double.toString(RegularHour) + "0");
		OverTimePayDisplay.setText(Double.toString(OverTimePay) + "0");
		RegularPayDisplay.setText(Double.toString(RegularPay) + "0");
		WeeklyPayDisplay.setText(Double.toString(WeeklyPay) + "0");
		YearlyPayDisplay.setText(Double.toString(YearlyPay) + "0");
		MarginalTaxDisplay.setText(Double.toString(tax) + "0");
		NetSalaryDisplay.setText(Double.toString(net) + "0");



	}

	@FXML
	void reset(ActionEvent event) {

		txtfd_HoursWork.setText("");
		txtfd_HourlyWage.setText("");
		OverTimeDiplay.setText("");
		RegularHoursDisplay.setText("");
		OverTimePayDisplay.setText("");
		RegularPayDisplay.setText("");
		WeeklyPayDisplay.setText("");
		YearlyPayDisplay.setText("");



	}

}
