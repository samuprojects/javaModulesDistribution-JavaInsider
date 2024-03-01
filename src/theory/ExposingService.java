package theory;

@SuppressWarnings("ALL")
public class ExposingService {
    /*
    * No exemplo que utilizamos estanciamos um SecurityManager diretamente na classe Main, isso significa que temos uma dependencia direta
    * da forma como essa classe está implementada. Isso é um problema, porque se mudar alguma coisa em SecurityManager terá de mudar no Main também.
    * Para eliminar o que é chamado de acoplamento o sistema de modularização do Java permite expor serviços e criar módulos que implementam esses serviços,
    * desacoplando totalmente todos eles.
    * Para isso vamor copiar o código de SecurityManager para uma nova classe SecurityManagerImpl e alterar o SecurityManager para interface.
    * O SecurityManagerImpl vai implementar essa interface.
    * No main ainda há uma depebdência pois temos que alterar a implementação para SecurityManagerImpl que tem ainda tem referências a detalhes
    * internos de como o SecurityManager funciona e precisa mudar isso criando um novo módulo intellij.
    * Dentro da aplicação foi escolhido nome securityimpl e adicionado uma depêndencia do intellij para depender de security.
    * Após apagar o Main criado automaticamente e criar um pacote br.com.myapp.security.impl, foi movido a classe SecurityManagerImpl para esse pacote.
    * Depois criar o módulo do java deixando o SecurityManager sozinho como uma interface, importar o módulo security nesse do impl.
    * Agora no módulo java do securityimpl vamos informar que ele provê o serviço de SecurityManager (provides) através (with) da classe SecurityManagerImpl
    * No módulo java do app indicamos que vai usar (uses) SecurityManager;
    * Com isso não é mais necessário usar o new e sim ServiceLoader.load passando a classe do módulo do serviço SecurityManager.class.
    * O load pode retornar vários serviços (caso tenha várias implementações), como no exemplo só tem uma então pela StreamAPI é possível buscar um
    * findFirst para retornar um Optional de um SecurityManager e um orElseThrow para lançar exceção caso não exista.
    * Ao executar o código dará um erro porque ainda não fizemos a ligação do módulo do intellij app como dependente do módulo intellij securityimpl
    * Após fazer isso tudo volta a funcionar.
    *
    * */
}
