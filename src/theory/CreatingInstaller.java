package theory;

@SuppressWarnings("ALL")
public class CreatingInstaller {

    /*
    *
    * Criando instalador para aplicação (terminal)
    * o jlink faz montagem final da aplicação, comandos são até um pouco parecidos com os do jdeps
    * primeiro informamos onde estão os módulos da aplicação e o do Gson, seguidos dos módulos java
    * jlink --module-path "./out/production/;./securityimpl/lib;%JAVA_HOME%/jmods"
    *
    * depois adicionar os módulos que farão parte, security não entrou porque o módulo app já depende do security
    * como o securityimpl não tem uma dependência direta informamos também para o link
    * --add-modules app,securityimpl
    *
    * depois incluímos um diretório para salvar esse Bundle
    * --output dist
    *
    * O caminho completo ficou assim
    * jlink --module-path "./out/production/;./securityimpl/lib;%JAVA_HOME%/jmods" --add-modules app,securityimpl --output dist
    *
    * será criado uma pasta dist no diretório do projeto com uma estrutura personalizada de um JRE para executar a aplicação
    * para executar, dentro da pasta dist digitar ./bin/java e o módulo a ser executado como caminho da classe executável
    * ./bin/java --module app/br.com.myapp.app.Main
    *
    * O detalhe importante desse processo é que não é necessário ter instalado a JRE no computador onde será executado.
    * Basta disponibilizar a pasta dist completa que será possível executar a aplicação.
    *
    *
    * No linux funcionou utilizando o separador padrão Unix ":" ao invés do ";" do windows resultando no comando final
    * jlink --module-path "./out/production/:./securityimpl/lib:%JAVA_HOME%/jmods" --add-modules app,securityimpl --output dist
    *
    * */
}
