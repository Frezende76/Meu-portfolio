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
    	while (true) { // enquanto a data for inv�lida, pede que digite novamente
            System.out.print(mensagem);
            try { 
            	// l� a string e j� passa para parse, que retorna o Date
            	return SDF.parse(sc.nextLine());
            } catch (ParseException e) {
            	System.out.println("********Digite uma data v�lida no formato indicado!!!********");
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
		
		System.out.print("Entre com o nome do an�ncio: ");
		String nomeAnuncio = sc.nextLine();	
	
		//S� sair� do loop quando digitar um an�ncio
		
		while (nomeAnuncio.isEmpty()) {
			System.out.println("Favor digitar o an�ncio!!!");
			nomeAnuncio = sc.nextLine();	
		}
		
		
		System.out.print("Entre com o nome do cliente: ");
		String cliente = sc.nextLine();
		
		// S� sair� do loop quando digitar o nome do cliente
		
		while (cliente.isEmpty()) {
			System.out.println("Favor digitar o nome do cliente!!!");
			cliente = sc.nextLine();
		}
		
		System.out.println("");
		
		dtInicio = lerData("Entre com a data de inicio (entrar com o padr�o dd/MM/yyyy) :");
		dtTermino = lerData("Entre com a data de termino (entrar com o padr�o dd/MM/yyyy) :");
		System.out.print("Entre com o investimento do dia: R$ ");
		double investDia = Double.parseDouble(sc.nextLine());
		
		while (true){
			long dias = (dtTermino.getTime() - dtInicio.getTime()) / (1000 * 60 * 60 * 24);
			double totInvestido = investDia * dias; //Valor total investido seria a quantidade de dias multiplicada pelo investimento di�rio
			double visualizaAnuncio = (investDia * 30) * dias; //30 pessoas visualizam o an�ncio original a cada R$ 1,00 investido (por dia)
			double qtdeMaxCliques = ((int)((visualizaAnuncio / 100) * 12) * dias); // A cada 100 visualiza��es, 12 cliques multiplicado pelo total de dias
			double compartilha = ((int)((qtdeMaxCliques / 20) * 3) * dias); //A cada 20 cliques, 3 compartilhamentos multiplicado pelo total de dias
			double compartilhaOriginal = ((int)(compartilha * 4) * dias); // cada compartilhamento que ocorre at� 4 vezes multiplicado pelo total de dias
			double novaVisualizacao =  ((int)(compartilha * 40) * dias);  //Cada compartilhamento gera 40 novas visualiza��es
			double qtdeMaxCompartilhamentos = compartilhaOriginal + compartilha;
			double qtdeMaxVisualizacoes = novaVisualizacao + visualizaAnuncio;
			
			if (dtInicio.before(dtTermino)){
				if(investDia != 0) {
					System.out.println("");
	                System.out.println("*************************************************");
	                System.out.println("********************Relat�rio********************");
	                System.out.println("*************************************************");
	                System.out.println("");
	                System.out.printf("O total dos investimentos : R$ %.2f%n ", totInvestido);
	                System.out.println("");
	                System.out.printf("Quantidade m�xima de visualiza��es : %.0f%n ", qtdeMaxVisualizacoes);	
	                System.out.println("");
	                System.out.printf("Quantidade m�xima de cliques: %.0f%n ",qtdeMaxCliques);
	                System.out.println("");
	                System.out.printf("Quantidade m�xima de compartilhamentos: %.0f%n ",qtdeMaxCompartilhamentos);
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
                // se data inicial n�o � menor que a data final, mostra mensagem e volta pro in�cio do while (a� vai pedir que digite novamente)
              		System.out.println("");
					System.out.println("********A data inicial deve ser menor que a data final!!!********");
              		dtInicio = lerData("Entre com a data de inicio (entrar com o padr�o dd/MM/yyyy) :");
            		dtTermino = lerData("Entre com a data de termino (entrar com o padr�o dd/MM/yyyy) :");
            }
	            
	    }
		
		sc.close();
    }
}


