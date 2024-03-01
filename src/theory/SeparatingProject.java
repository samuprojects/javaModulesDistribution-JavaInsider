package theory;

@SuppressWarnings("ALL")
public class SeparatingProject {

    /*
    * Antes de trabalhar com os módulos do Java é preciso configurar os módulos da sua ferramenta de desenvolvimento
    * No caso o intellij vamos separar a classe SecurityManager da Main em outro módulo, para separar o conceito da classe que representa a
    * segurança da nossa aplicação.
    * Para isso foi criado na pasta do projeto principal um novo módulo com nome security, no src desse novo módulo excluímos o Main criado pela IDE
    * Depois criamos um pacote com o mesmo prefixo da aplkicação geral e no sufixo com o módulo em si br.com.myapp.security
    * Em seguida movemos a classe SecurityManager para este pacote e a IDE vai alertar que na classe Main a classe SecurityManager ficará inacessível
    * Clicar em Continue.
    * Isso resultará na quebra da nossa aplicação em módulos e o Main deixará de compilar. Esse problema ocorre porque no intellij os módulos são
    * totalmente independentes. Só podemos usar recursos de um módulo em outro se explicitamente realizarmos um link entre eles.
    * Para criar esse link no menu File / Project Structure... / na aba lateral Modules será possível observar:
    * módulo app recém criado na aula passada
    * módulo com a pasta principal do projeto (basicamente é nossa raiz)
    * módulo security criado nesta aula
    * Para liberar os serviços de segurança em app indicamos que ele tem uma dependencia de security. Com app selecionado, na aba da direita
    * haverá uma aba Dependencies com o Module SDK em uso e abaixo dele um botão de + (Add) (pelo menos nessa versão do intellij),
    * abrirá um pequeno menu com as opções 1 JARs or Directories... 2 Library... 3 Module Dependency..., selecionamos esta última e,
    * na pequena caixa que será exibida (Choose Modules) clicamos no security para fazer a indicação de dependencia, depois ok.
    * Agora na classe Main apenas autalizamos o import para o novo pacote encontrado e a aplicação voltará a funcionar.
    *
    * IMPORTANTE: Essas ações no intellij não tem nada a ver com os módulos do Java, e sim com divisão de módulos dentro da IDE. Essa parte inicial
    * diz respeito somente a ferramenta intellij, ou seja, para outras IDEs será de outra forma.
    * Os módulos do intellij servem apenas para criar dependências entre módulos, ou seja, em nenhum momento informamos o que será exposto, ou o que
    * ficará escondido, porque isso tem relação com os módulos do Java (a partir da versão 9) que serão abordados posteriormente.
    * Todavia, para chegar nessa parte de usar os módulos do Java é necessário primeiro quebrar em módulos dentro da IDE, como visto nessa aula.
    *
    * */
}
