public class TestPoint3 {

	public static void main(String[] args) throws Exception {
		
		Point3 p0 = new Point3(-2, 2);
		Point3 p1 = new Point3(p0);

		System.out.println(p0.toString());
		System.out.println(p1);

		// comparaison d'objets: == vs equals
		String res = new String("avec == p0 et P1 sont:      ");
		if (p0 == p1)
			res = res + "identiques";
		else
			res = res + "differents";
		System.out.println(res);

		res = new String("avec equals p0 et P1 sont:  ");
		if (p0.equals(p1))
			res = res + "identiques";
		else
			res = res + "differents";
		System.out.println(res);
		
	}
}
