// INVARIANT DE CLASSE: y >= 0 (why not?)

public class Point2 {
	
	public int x;
	private int y;


	/** Construit un point de coordonnées (a,y). */
	public Point2(int a, int y) {
		x = a;
		setY(y);		// pourquoi pas this.y = y ? 
	}
	
	/** Construit un point de même coordonnées que p. */
	public Point2(Point2 p) {
		this.x = p.x;
		this.y = p.y;	// dangeureux ou non? utiliser setY?
	}
	// => on parle de CONSTRUCTEUR PAR COPIE, à partir de p existant

	/** Construit un point de coordonnées (0,0). */
	public Point2() {
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
}
