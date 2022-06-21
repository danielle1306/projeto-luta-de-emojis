import java.util.Random;

public class Luta {

	//atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	//métodos públicos
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria())&& l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
		
	}
	public void lutar() {
		if (this.aprovada) {
			System.out.println("### DESAFIADO! ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE! ###");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // vai gerar 0 1 ou 2
			switch(vencedor) {
			case 0:				//caso 0: empate
				System.out.println("Empatou!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;				//o switch precisa de um break.
			case 1:				//caso 1: desafiado ganha.
				System.out.println("Desafiado ganhou a luta!");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
				
			case 2:				//caso 2: desafiado perde
				System.out.println("Desafiante ganhou a luta!");
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
				
			}
			
		} else {
			System.out.println("a luta não pode acontecer.");
		}
		
	}
	//métodos especiais
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
}
