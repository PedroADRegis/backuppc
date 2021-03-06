// INVARIANT DE CLASSE: y >= 0 (why not?)

public class Point3 {
	
	public int x;
	private int y;


	/** Construit un point de coordonnées (a,y). */
	public Point3(int a, int y) {
		x = a;
		setY(y);		// pourquoi pas this.y = y ? 
	}
	
	/** Construit un point de même coordonnées que p. */
	public Point3(Point3 p) {
		this.x = p.x;
		this.y = p.y;	// dangeureux ou non? utiliser setY?
	}
	// => on parle de CONSTRUCTEUR PAR COPIE, à partir de p existant

	/** Construit un point de coordonnées (0,0). */
	public Point3() {
		this(0, 0);		// réinvoque un autre constructeur 
	}
	// => on parle de CONSTRUCTEUR PAR DEFAUT

	
	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		if (y < 0) {
			throw new IllegalArgumentException("Invariant sur y non respecte");
		}
		this.y = y;		
	}

	public void translate(int dx, int dy) {
		x += dx;
		setY(y + dy);
	}

	
	/**
	 *  Retourne représentation de l'objet sous forme de chaine de 
	 *  caracteres: "(x,y)"
	 */	 
	@Override
	public String toString() {
		return new String("(" + x + ", " + y + ")"); 
	}

	/**
	 * Indique si l'objet o est "égal" à l'instance.
	 * Ici cela signifie qu'ils sont du même type (Point3)
	 * et de même coordonnées.	 
	 */
	@Override
	public boolean equals(Object o) {
		return  o instanceof Point3
				&& ((Point3) o).x == this.x
				&& ((Point3) o).y == this.y;
	}
}
