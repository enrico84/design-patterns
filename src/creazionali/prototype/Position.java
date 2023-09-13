package creazionali.prototype;

public class Position {
	
	private String xPosition;
	private String yPosition;
	
	public Position(String xPosition, String yPosition) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}

	public String getxPosition() {
		return xPosition;
	}

	public void setxPosition(String xPosition) {
		this.xPosition = xPosition;
	}

	public String getyPosition() {
		return yPosition;
	}

	public void setyPosition(String yPosition) {
		this.yPosition = yPosition;
	}

	@Override
	public String toString() {
		return "Position [xPosition=" + xPosition + ", yPosition=" + yPosition + "]";
	}

}
