/**
 * Point 2D, representé par deux coordonnées entières.
 * @author chabanam
 * 2015
 */
class Point0 {
	
	/** Abscisse du point */
	int x;

	/** Ordonnee du point */
	int y;

	/**
	 * Translate le point a la position (x+dx, y+dy).  
	 * @param dx deplacement selon la coordonnee x
	 * @param dy deplacement selon la coordonnee y
	 */
	void translate(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
}
