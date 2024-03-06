package theory;

@SuppressWarnings("ALL")
public class CreatingLauncher {

    /*
    *
    * Utilizando o mesmo comando da aula anterior é possível criar um executável da aplicação acrescentando alguns comandos ao final
    * jlink --module-path "./out/production/;./securityimpl/lib;%JAVA_HOME%/jmods" --add-modules app,securityimpl --output dist --launcher dist=app/br.com.myapp.app.Main
    *
    * Excluir a pasta do dist gerado no conteúdo da aula anterior pois será gerado novamente
    * E a diferença é que dentro da pasta bin existirá or arquivos dist (executável linux/macos) e dist.bat (executável para windows)
    *
    * É a forma mais simples e otimizada de distribuir uma aplicação.
    *
    * No linux funcionou utilizando o separador padrão Unix ":" ao invés do ";" do windows resultando no comando final
    * jlink --module-path "./out/production/:./securityimpl/lib:%JAVA_HOME%/jmods" --add-modules app,securityimpl --output dist --launcher dist=app/br.com.myapp.app.Main
    *
    * Intellij não estava reconhecendo os comandos no terminal, após pesquisa, alterado o shell path para /bin/bash nos passos:
    * "File" (Arquivo) > "Settings" (Configurações) > "Tools" > "Terminal" e alterando as configurações do terminal para Bash.
    *
    * */
}
