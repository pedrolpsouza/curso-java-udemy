package poo.heranca;

public class Jogo {
	public static void main(String[] args) {
		Jogador j1 = new Jogador();
		j1.x = 10;
		j1.y = 10;
		/*
		 * j1.andar(Direcao.NORTE); j1.andar(Direcao.NORTE); j1.andar(Direcao.NORTE);
		 * j1.andar(Direcao.SUL); j1.andar(Direcao.SUL);
		 */

		Heroi j2 = new Heroi();
		j2.x = 10;
		j2.y = 11;
		Monstro monster = new Monstro();
		monster.x = 11;
		monster.y = 10;
		
		System.out.println(j1.vida);
		System.out.println(j2.vida);
		System.out.println(monster.vida);
		j1.atacar(j2);

		//System.out.println(j1.vida);
		System.out.println(j2.vida);
		j2.atacar(j1);
		
		System.out.println(j1.vida);
		//System.out.println(j2.vida);
		monster.atacar(j1);
		System.out.println(j1.vida);
		
	}
}
