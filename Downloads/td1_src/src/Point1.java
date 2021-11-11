// Ajout d'un INVARIANT DE CLASSE: y >= 0 (why not?)

public class Point1 {
	
	public int x;
	private int y;	// attribut PRIVE

	/**
	 * Accesseur (get): accède en lecture à l'ordonnée du point.
	 * @return la valeur de y
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * Mutateur (set): modifie l'ordonnée du point.
	 * @throws IllegalArgumentException si la nouvelle ordonnée ne vérifie 
	 * pas l'invariant this.y >= 0
	 */
	public void setY(int y) {
		if (y < 0) {
			throw new IllegalArgumentException("Invariant sur y non respecte");
		}
		this.y = y;		
	}
	
	public void translate(int dx, int dy) {
		this.x += dx;
		this.y += dy;	// danger?
	}

	// SURCHARGE de la methode 
	public void translate(int dx) {
		translate(dx, 0);	// en fait this.translate(dx, 0) 
	}
}
