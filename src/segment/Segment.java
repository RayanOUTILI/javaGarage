package segment;

public class Segment {
	private point.Point origine;
	private point.Point extremite;
	
	public Segment(point.Point origine, point.Point extremite) {
		this.origine = origine;
		this.extremite = extremite;
	}

	public point.Point getOrigine() {
		return origine;
	}

	public void setOrigine(point.Point origine) {
		this.origine = origine;
	}

	public point.Point getExtremite() {
		return extremite;
	}

	public void setExtremite(point.Point extremite) {
		this.extremite = extremite;
	}

	public String toString() {
		return "Segment [origine=" + origine + ", extremite=" + extremite + "]";
	}
	
	public double longueur() {
		return origine.getDistance(extremite);
	}

	/*public Segment projX() {
		return origine.projX();
	}
	
	public Segment projY() {
		return extremite.projY();
	}*/
	
	
	
}
