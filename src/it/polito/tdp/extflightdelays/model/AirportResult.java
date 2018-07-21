package it.polito.tdp.extflightdelays.model;

public class AirportResult {
	
	private Airport a1;
	private Airport a2;
	private double avg;
	
	public AirportResult(Airport a1, Airport a2, double avg) {
		this.a1 = a1;
		this.a2 = a2;
		this.avg = avg;
	}

	public Airport getA1() {
		return a1;
	}

	public void setA1(Airport a1) {
		this.a1 = a1;
	}

	public Airport getA2() {
		return a2;
	}

	public void setA2(Airport a2) {
		this.a2 = a2;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	

}
