package creazionali.prototype;

public class AbeteTree extends Tree {

	public AbeteTree(String height, String weigth) {
		super(height, weigth);
	}

	@Override
	public Tree copy() {
		AbeteTree abeteTree = new AbeteTree(this.getHeight(), this.getWeigth());
		abeteTree.setPosition(this.getPosition());
		return abeteTree;
	}

}
