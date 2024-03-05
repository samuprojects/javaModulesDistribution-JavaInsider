package theory;

@SuppressWarnings("ALL")
public class JdepsTool {

    /*
    *
    * A ferramenta jdeps serve para mostrar a árvore de dependencia dos módulos
    * Para isso utilizar os comandos em terminal na pasta do projeto indicando onde está o código compilado
    * Fica localizado na pasta out / production do projeto, que contém a pasta dos módulos com os bytecodes do Java
    *
    * Dentro da pasta citada inserir o comando com o nome do módulo que deseja ver as dependencias
    * jdeps --module-path ./out/production/ -s --module app
    * o comando -s é para exibir um sumário com as dependências do módulo indicado
    *
    * Por exemplo para ver as dependências do módulo securityimpl
    * jdeps --module-path "./out/production;./securityimpl/lib" --add-modules com.google.gson -s --module securityimpl
    *
    * vai apresentar um erro de multi-release porque o Gson trabalha com várias versões do java por isso acrescentar no comando
    * jdeps --module-path "./out/production;./securityimpl/lib" --add-modules com.google.gson -s --module securityimpl --multi-release base
    *
    *
    * */
}
