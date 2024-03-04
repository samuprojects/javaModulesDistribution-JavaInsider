package theory;

@SuppressWarnings("ALL")
public class JDKModularization {

    /*
    * Utilizado cenário de Log, na tentativa de autenticação, para explicar o funcionamento da modularização do JDK
    *
    * Criado módulo de teste para relembrar uso do Logging, excluído no final da aula, e mostrar que não está disponível
    * no módulo securityimpl, explicado que isso ocorre porque quando a modularização é ativada o próprio JDK entra no contexto
    * e para compreender isso foi mostrado a imagem da modularização do JDK no endereço https://docs.oracle.com/javase/9/docs/api/java.se-graph.png
    * Explicado que todos os módulos dependem do java.base (que contém o core, a API Coleções, os tipos do Java, etc), outras coisas foram quebradas
    * como java.sql, java.desktop, java.logging , etc. No módulo de teste foi possível utilizar porque era apenas o módulo da IDE Itellij, não havia o
    * arquivo module-info do Java, a partir da criação dele já não funcionava mais o Logger.
    * Dentro desse tema existe o conceito de unnamed module (que faz o papel de expostar tudo que existe dentro dele).
    * Quando criamos uma aplicação que não usa modularização do Java, tudo que é utilizado da JDK
    * é criado dentro de um módulo a parte chamado unnamed module (módulo sem nome), ou seja, nem se percebe que está trabalhando com JDK modularizado.
    * Que é como se fosse um módulo extra disponivel para aplicações que não usam a modularização do Java utilizarem o JDK completo e de forma transparente.
    * Isso foi criado para manter a compatibilidade com aplicações que não trabalham com a modularização.
    * Corrigindo isso no module-info do securityimpl acrescentamos requires java.logging;
    * Foi criado um mecaniasmo para geração de logs e na pasta resources um arquivo logging.properties para utilizar um Handler de console
    * (para jogar os dados de log no console que por padrão uitilizará o nível info), seguido de um Formatter com um SimpleFormatter
    * passando um padrão para exibir o nível do log, a mensagem e uma quebra de linha
    * Para inicializar o arquivo de configuração do log o professor optou por usar a mesma estrutura do SecurityManagerImpl por ser somente esta classe,
    * na maioria das vezes é inicializado em um código a parte, chamando o gerenciador de Logs do java e o caminho da configuração que se deseja fornecer
    * depois incluiu um try/catch por conta da possibilidade de exceção e excluído o módulo de teste.
    *
    * O professor explicou que o log foi apenas uma ferramenta utilizada para demonstrar como funciona a modularização do Java incluindo o JDK
    *
    *
    *
    *
    * */
}
