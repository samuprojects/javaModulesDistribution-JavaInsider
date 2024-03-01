package theory;

@SuppressWarnings("ALL")
public class JavaModularization {

    /*
    * Quando o recurso de modularização do Java foi criado na versão 9, os engenheiros do Java decidiram manter a compatibilidade desse novo recurso
    * com as versões anteriores, porque houve várias mudanças internas na forma como o java trabalhava. Por isso a decisão foi de manter os módulos
    * desabilitados por padrão. Por isso que apenas utilizando os módulos do intellij e conectando as dependencias tudo funciona.
    * Para ativar a modularização com o botão direito de menu no pacote criado dentro do módulo (exemplo o app) clicar em New / module-info.java
    * Esse module-info pertence ao código fonte, é um arquivo java e tem uma sintaxe um pouco diferente, pois é um module descriptor (descreve o módulo).
    * Ou seja, para utilizarmos um module descriptor utilizamos a palavra chave module seguido do nome do módulo (que geralmente vai seguir o nome do módulo criado).
    * Entre as chaves {} colocamos as configurações.
    * Realizamos esse mesmo passo para o módulo security.
    * A partir daí o código deixará de compilar, porque foi ativado a modularização do Java que por padrão deixa tudo oculto, mesmo que esteja ativado e configurado
    * os módulos do intellij. Isso é necessário para que possamos expor somente o necessário e manter o forte encapsulamento proposto pela modularização.
    * Para deixar o código compilando a primeira coisa é expor a classe SecurityManager para o mundo exterior. No arquivo module-info do security colocar a
    * palavra chave exports seguido do nome do pacote a ser exportado (sempre pacotes, não é possível exportar uma classe específica).
    * Agora do outro lado é necessário fazer a importação desse módulo, por isso, no module-info do app utilizamos a palavra chave requires seguido do nome do
    * módulo que se deseja importar.
    * IMPORTANTE:
    * no módulo que estamos exportando informar sempre os pacotes que se deseja expor ao mundo (exports "pacote")
    * quando desejamos utilizar alguma coisa devemos indicar o nome do módulo para ser importado. (requires "modulo")
    *
    * Assim o código voltará a compilar.
    * O que não for expostado ficará oculto.
    *
    *
    * */
}
