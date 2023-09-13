package creazionali.prototype;

public class PinoTree extends Tree {

	public PinoTree(String height, String weigth) {
		super(height, weigth);
	}

	@Override
	public Tree copy() {
		PinoTree pinoTree = new PinoTree(this.getHeight(), this.getWeigth());
		pinoTree.setPosition(this.getPosition());
		return pinoTree;
	}

}
