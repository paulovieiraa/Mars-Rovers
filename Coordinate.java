package Common;
/* Autor: Paulo Vieira - 19/07/16
 * Criar plano cartesiano para movimentar robo em MARTE
 * Coordenadas central (0,0)
 * Movimentos:  R - Girar 90 � para direita (Right) 
 * 				L - Girar 90 � para esquerda (Left)
 * 				M - Avan�ar 1 um ponto  de grade em 90� (North) (x,y+1) se 0 > x <=180�
 * 														        (x,y-1) se 180> x <=360
 * */
public class Coordinate {
	//pontos cartesianos
	public int x; 
	public int y;
	//construtor
	public Coordinate(int x, int y) { 
	    this.x = x; 
	    this.y = y; 
	} 
}
