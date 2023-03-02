package segment;

import point.Point;

public class TestSegment {
	public static void main(String[] args) {
	Point A = new Point(1, 2);
	Point B = new Point(1, 3);
	Segment seg_test = new Segment(A,B);
	System.out.println(seg_test);
	
	//on teste la nouvelle méthode longueur
	System.out.println(seg_test.longueur());
	
	
}
}
