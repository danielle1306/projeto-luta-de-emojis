
class Ultraemojicombat {

	public static void main(String[] args) {
		
//Criando um vetor para abrigar todos os lutaddores
		Lutador l[] = new Lutador[6];
		l[0] = new Lutador("Pretty Boy", "França", 1.75f, 68.9f, 31, 11, 2, 1);
		l[1] = new Lutador("Putscript ", "Brasil ", 1.65f, 81.6f, 29, 14, 2, 1);
		l[2] = new Lutador("Snapshasow", "Australia", 1.95f, 68.9f, 31, 11, 3, 0);
		l[3] = new Lutador("Dead Code ", "Brasil ", 1.75f, 75.6f, 29, 13, 2, 3);
 		
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[0], l[2]);
		l[0].apresentar();
		l[2].apresentar();
		UEC01.lutar();
		
		

	}

}
