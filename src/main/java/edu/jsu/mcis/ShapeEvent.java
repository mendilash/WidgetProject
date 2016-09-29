package edu.jsu.mcis;

public class ShapeEvent {
    private boolean hexagonIsSelected;
	private boolean octogonIsSelected;
	
    public ShapeEvent() {
        this(false, false);
    }
    public ShapeEvent(boolean hexagonIsSelected, boolean octogonIsSelected) {
        this.hexagonIsSelected = hexagonIsSelected;
		this.octogonIsSelected = octogonIsSelected;
    }
    public boolean isHexagonSelected() { return hexagonIsSelected; }
	public boolean isOctogonSelected() {return octogonIsSelected; }
	
}
