package creazionali.prototype;

public abstract class Tree {
	
	private String height;
	private String weigth;
	private Position position;
	
	protected Tree(String height, String weigth) {
		this.height = height;
		this.weigth = weigth;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeigth() {
		return weigth;
	}

	public void setWeigth(String weigth) {
		this.weigth = weigth;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	public abstract Tree copy();

	@Override
	public String toString() {
		return "Tree [height=" + height + ", weigth=" + weigth + ", position=" + position + "]";
	}

}
