import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//Desenvolvedor Fabricio Rezende - Calculadora de Anuncios On-line

public class CadastraAnuncio {
	private static final Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	private static final SimpleDateFormat SDF;
    static {
        SDF = new SimpleDateFormat("dd/MM/yyyy");
        SDF.setLenient(false); // para validar corretamente as datas
    }
    
    static Date lerData(String mensagem) {
    	while (true) { // enquanto a data for inválida, pede que digite novamente
            System.out.print(mensagem);
            try { 
            	// lê a string e já passa para parse, que retorna o Date
            	return SDF.parse(sc.nextLine());
            } catch (ParseException e) {
            	System.out.println("********Digite uma data válida no formato indicado!!!********");
            	System.out.println("");
            }
    	}
    }
	
	public static void main(String[] args) {
			
		Date dtInicio, dtTermino;
				
		System.out.println("*****************************************");
		System.out.println("*                                       *");
		System.out.println("*         Cadastro de anuncios          *");
		System.out.println("*   Desenvolvido por Fabricio Rezende   *");
		System.out.println("*                                       *");
		System.out.println("*****************************************");
		System.out.println("");
		
		System.out.print("Entre com o nome do anúncio: ");
		String nomeAnuncio = sc.nextLine();	
	
		//Só sairá do loop quando digitar um anúncio
		
		while (nomeAnuncio.isEmpty()) {
			System.out.println("Favor digitar o anúncio!!!");
			nomeAnuncio = sc.nextLine();	
		}
		
		
		System.out.print("Entre com o nome do cliente: ");
		String cliente = sc.nextLine();
		
		// Só sairá do loop quando digitar o nome do cliente
		
		while (cliente.isEmpty()) {
			System.out.println("Favor digitar o nome do cliente!!!");
			cliente = sc.nextLine();
		}
		
		System.out.println("");
		
		dtInicio = lerData("Entre com a data de inicio (entrar com o padrão dd/MM/yyyy) :");
		dtTermino = lerData("Entre com a data de termino (entrar com o padrão dd/MM/yyyy) :");
		System.out.print("Entre com o investimento do dia: R$ ");
		double investDia = Double.parseDouble(sc.nextLine());
		
		while (true){
			long dias = (dtTermino.getTime() - dtInicio.getTime()) / (1000 * 60 * 60 * 24);
			double totInvestido = investDia * dias; //Valor total investido seria a quantidade de dias multiplicada pelo investimento diário
			double visualizaAnuncio = (investDia * 30) * dias; //30 pessoas visualizam o anúncio original a cada R$ 1,00 investido (por dia)
			double qtdeMaxCliques = ((int)((visualizaAnuncio / 100) * 12) * dias); // A cada 100 visualizações, 12 cliques multiplicado pelo total de dias
			double compartilha = ((int)((qtdeMaxCliques / 20) * 3) * dias); //A cada 20 cliques, 3 compartilhamentos multiplicado pelo total de dias
			double compartilhaOriginal = ((int)(compartilha * 4) * dias); // cada compartilhamento que ocorre até 4 vezes multiplicado pelo total de dias
			double novaVisualizacao =  ((int)(compartilha * 40) * dias);  //Cada compartilhamento gera 40 novas visualizações
			double qtdeMaxCompartilhamentos = compartilhaOriginal + compartilha;
			double qtdeMaxVisualizacoes = novaVisualizacao + visualizaAnuncio;
			
			if (dtInicio.before(dtTermino)){
				if(investDia != 0) {
					System.out.println("");
	                System.out.println("*************************************************");
	                System.out.println("********************Relatório********************");
	                System.out.println("*************************************************");
	                System.out.println("");
	                System.out.printf("O total dos investimentos : R$ %.2f%n ", totInvestido);
	                System.out.println("");
	                System.out.printf("Quantidade máxima de visualizações : %.0f%n ", qtdeMaxVisualizacoes);	
	                System.out.println("");
	                System.out.printf("Quantidade máxima de cliques: %.0f%n ",qtdeMaxCliques);
	                System.out.println("");
	                System.out.printf("Quantidade máxima de compartilhamentos: %.0f%n ",qtdeMaxCompartilhamentos);
	                System.out.println("");
	                System.out.println("*********************Fim*************************");
	                break;
				}else {
					System.out.println("");
					System.out.println("********O valor investido incorreto!!!********");
					System.out.println("");
					System.out.print("Entre com o investimento do dia: R$ ");
					investDia = Double.parseDouble(sc.nextLine());
				}           
			}else {
                // se data inicial não é menor que a data final, mostra mensagem e volta pro início do while (aí vai pedir que digite novamente)
              		System.out.println("");
					System.out.println("********A data inicial deve ser menor que a data final!!!********");
              		dtInicio = lerData("Entre com a data de inicio (entrar com o padrão dd/MM/yyyy) :");
            		dtTermino = lerData("Entre com a data de termino (entrar com o padrão dd/MM/yyyy) :");
            }
	            
	    }
		
		sc.close();
    }
}


