import java.util.Locale;
import java.util.Scanner;

// Desenvolvedor Fabricio Rezende - Calculadora de Anuncios On-line

public class calculadora {
	private static final Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
	public static void main(String[] args) {
		
		double valInvestido = 0, compartilhaOriginal = 1;
		int total = 0;
		int visualizaAnuncio = 1;
		int clicaAnuncio = 1;
		int compartilha = 1;
		int novaVisualizacao = 1;
		
		System.out.println("*****************************************");
		System.out.println("*                                       *");
		System.out.println("*    Calculadora de anuncios On-line    *");
		System.out.println("*   Desenvolvido por Fabricio Rezende   *");
		System.out.println("*                                       *");
		System.out.println("*****************************************");
		System.out.println("");
		
	while(true) {
		
			System.out.print("Entre com o valor investido: R$ ");
			valInvestido = sc.nextDouble();
			
			if (valInvestido < 0) {
				System.out.println("O valor investido não pode ser negativo");	
			}else if (valInvestido != 0) {
				visualizaAnuncio = (int) valInvestido * 30; // 30 pessoas visualizam o anúncio original a cada R$ 1,00 investido.
					if(visualizaAnuncio != 0) {
						clicaAnuncio = (int) (visualizaAnuncio / 100) * 12; // A cada 100 pessoas q visualizam o anúncio 12 clicam nele.
					}
					
					if(clicaAnuncio != 0) {
						compartilha = (int) (clicaAnuncio / 20) * 3; // A cada 20 pessoas que clicam no anuncio 3 compartilham nas redes sociais.
					}
					
					if(compartilha != 0){
						novaVisualizacao = (int) compartilha * 40; // Cada compartilhamento nas redes sociais gera 40 novas visualizações.
					}
					
					if (novaVisualizacao != 0) {
						compartilhaOriginal = (int)compartilha * 4; // O mesmo anúncio é compartilhado no máximo 4 vezes em sequência.
					}
							
						total = visualizaAnuncio + novaVisualizacao; //cálculo do retorno aproximado da quantidade máxima de pessoas que visualizarão o mesmo anúncio.
						System.out.println("Quantidade máxima de pessoas que visualizarão o mesmo anuncio : " + total + " pessoas"); // Aqui imprime na tela a quantidade de pessas que visualizarão o anúncio.
			break;
		}else {
			System.out.println("O valor investido não pode ser zero.");
		}
	}	
		sc.close();			
	}

}
