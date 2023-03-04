import java.util.Scanner;

class Ejercicio4 {
    public static void main(String[] args) {
        int edjuan, edana, edmama, edalberto;
        Scanner leerporteclado = new Scanner(System.in);
        
        
        
        System.out.println("Ingrese la edad de juan");
        edjuan = leerporteclado.nextInt();
        edalberto = (2*edjuan)/3;
        edana = (4*edjuan)/3;
        edmama = edjuan + edana + edalberto;
        System.out.println("La edad de juan es " + edjuan);
        System.out.println("La edad de alberto es " + edalberto);
        System.out.println("La edad de ana es " + edana);
        System.out.println("La edad de la mama es " + edmama);
        
    }
}