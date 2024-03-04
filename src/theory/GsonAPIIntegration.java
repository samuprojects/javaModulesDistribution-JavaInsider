package theory;

@SuppressWarnings("ALL")
public class GsonAPIIntegration {
    /*
    *
    * Para fazer a leitura das credenciais no formato JSON o professor optou por utilizar a API Gson disponível em
    * https://github.com/google/gson
    * mais abaixo na página localizar o link Gson jar downloads para ser redirecionado para a Maven Central
    * na sequencia realizar o download no botão ao lado direito e integrar ao projeto java.
    * O professor optou por integrar essa API apenas com o módulo securityimpl (dependencia modular).
    * Na pasta do módulo com o botão de menu do mouse clicar em New / Directory / nomear como lib / colar direto dentro do intellij nessa pasta.
    * Com o botão direito sobre o jar adicionado selecionar Add as Library... / em Level selecionar
    * Module Library (Global ou Project Library vai expandir para outros módulos) / depois ok.
    * Na sequencia para utilizar o módulo Gson incluir o requires com.google.gson no module-info do securityimpl.
    * Com isso será possível instanciar objetos Gson (new Gson())
    * Professor abriu parenteses para salientar que no código fonte do Gson não existe um module-info, ou seja, não é modularizado.
    * Explicou que quando importamos o jar e realizamos um requires para o módulo Gson o Java automaticamente "cria" esse módulo mesmo não sendo suportado
    * na fonte original.
    *
    *
    * */
}
