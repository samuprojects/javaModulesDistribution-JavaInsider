package theory;

@SuppressWarnings("ALL")
public class FinishingReadingImplementation {

    /*
    *
    * Para realizar a leitura dos dados JSON dentro de um objeto Credentials o professor optou por externalizar a lógica, do SecurityManagerImpl, anterior em um método
    * privado com nome getCredentials para retornar as credenciais.
    * Em seguida criou um objeto Gson passando a variável do caminho do arquivo e ajustando para Reader com InputStreamReader validando para não dar null no try
    * e o Credentials.class que será passado para fora no retorno. Em seguida ajustou a exceção para lançar uma RuntimeException.
    * Na sequencia chamou esse novo método com o getPasswordByUsername criado anteriormente para retornar a String com password salvo.
    * Depois verificar se são iguais ao informado pelo usuário, ou, se não é nulo.
    * Após isso executando a aaplicação surgiram alguns erros que foram corrigidos pontualmente:
    * -> Failed making field 'br.com.myapp.security.impl.model.Credentials#credentials' accessible;
    * corrigido visibilidade com método get
    * -> ...module securityimpl does not "opens br.com.myapp.security.impl.model" to module com.google.gson
    * corrigido com opens no module-info
    * O erro acima ocorre porque o Gson precisa fazer a leitura dos objetos Credentials e Credential via reflexão, como por padrão o Java não permite
    * que ninguém acesse os elementos de um módulo via reflectionAPI é necessário que você dê a permissão (informando os pacotes que deseja abrir).
    * se quiser abrir o módulo inteiro colocar o open antes do module (open module securityimpl {...})
    * -> Expected BEGIN_OBJECT but was BEGIN_ARRAY at line 1 column 2 path $
    * faltou informar que o objeto credentials possui uma propriedade credentials que é uma lista {"credentials":[{...},{...}]} de credential
    * Após isso feitos os testes na classe Main tudo ok
    *
    * */
}
