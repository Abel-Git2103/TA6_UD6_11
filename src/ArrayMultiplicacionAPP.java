import javax.swing.JOptionPane;

public class ArrayMultiplicacionAPP {

	public static void main(String[] args) {
		
		//INDICAR EL TAMAÑO DEL ARRAY
		String numTexto = JOptionPane.showInputDialog("Introduce el tamaño del array");
		int tamaño = Integer.parseInt(numTexto);
		
		//CREAR LOS ARRAYS
		int array1[] = new int[tamaño];
		int array2[];
		
		//INVOCAR LAS FUNCIONES
		rellenarArray(array1, 1, 20);
		
		array2 = array1;
		
		array1 = new int[tamaño];
		
		rellenarArray(array1, 1, 20);
		
		int array3[] = multiplicador(array1, array2);
		
		System.out.println("Array1");
        mostrarArray(array1);
 
        System.out.println("\nArray2");
        mostrarArray(array2);
 
        System.out.println("\nArray3");
        mostrarArray(array3);
	
	}
	
	public static void rellenarArray(int lista[], int num1, int num2) {
		
		for(int i = 0; i < lista.length; i++) {
			lista[i] = ((int)Math.floor(Math.random() * (num1 - num2) + num2));
		}
	}
	
	public static void mostrarArray(int lista[]) {
		
		for(int i = 0; i < lista.length; i++) {
			System.out.println("En el indice " + i + " esta el valor " + lista[i]);
		}
	}
		
	public static int[] multiplicador(int array1[], int array2[]){
		
		int array3[]=new int[array1.length];
		
		for(int i=0; i<array1.length; i++){
			array3[i] = array1[i] * array2[i];
		}
		return array3;
	}
}
