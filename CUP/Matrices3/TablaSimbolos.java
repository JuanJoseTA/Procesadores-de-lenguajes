import java.util.HashMap;

public class TablaSimbolos {
	
	public final static String ERROR_NOEXISTE = "ERROR6: No se ha encontrado este indentificador en la tabla de simbolos";
	public final static String ERROR_DUPLICADA = "ERROR9: Variable duplicada en la tabla de simbolos";
	
	private static HashMap<String,double[][]> tablaMatrices = new HashMap<String,double[][]>();
	private static HashMap<String,double[]> tablaVectores = new HashMap<String,double[]>();
	private static HashMap<String,double[]> tablaConjuntos = new HashMap<String,double[]>();
	
	public static double[][] buscar(String ident) {
		return tablaMatrices.get(ident);
	}
	
	public static void insertar(String ident, double[][] matriz) {
		if (check(ident)) {
			tablaMatrices.put(ident, matriz);
		}
	}
	
	public static boolean check(String ident) {
		if (buscar(ident)!=null || buscarVector(ident)!=null || buscarConjunto(ident)!=null) {
			System.out.println(ERROR_DUPLICADA);
			System.exit(0);
		}
		return true;
	}

    /* ********************************************* */
    /*   Matrices                                    */
    /* ********************************************* */    
	
	public static double[][] buscarMatriz(String ident) {
		return buscar(ident);
	}
	
	public static void insertarMatriz(String ident, double[][] matriz) {
		insertar(ident, matriz);
	}

    /* ********************************************* */
    /*   Vectores                                    */
    /* ********************************************* */    

	public static double[] buscarVector(String ident) {
		return tablaVectores.get(ident);
	}
	
	public static void insertarVector(String ident, double[] vector) {
		if (check(ident)) {
			tablaVectores.put(ident, vector);
		}
	}

    /* ********************************************* */
    /*   Conjuntos                                   */
    /* ********************************************* */    

	public static double[] buscarConjunto(String ident) {
		return tablaConjuntos.get(ident);
	}
	
	public static void insertarConjunto(String ident, double[] conjunto) {
		if (check(ident)) {
			tablaConjuntos.put(ident, conjunto);
		}
	}

}