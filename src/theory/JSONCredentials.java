package theory;

@SuppressWarnings("ALL")
public class JSONCredentials {

    /*
    *
    * Executando leitura das credenciais de acesso através de um arquivo JSON
    * Como o sistema está modularizado não haverá problemas na alteração do SecurityManagerImpl
    * Para criar o arquivo JSON vamos primeiro colocar na estrutura da pasta módulo securityimpl uma pasta com nome resources
    * Para isso no menu do intellij File / Project Structure... / com a aba Modules selecionada / e a pasta módulo securityimpl selecionada /
    * Do lado direito na aba Sources / clicar no diretório endereço do módulo com botão menu / New Directory... / informar nome resources / ok /
    * Clicar nessa pasta resources com o botão de menu e marcar como Resources caso já não esteja marcada pela IDE.
    * No canto direito será possível observar que haverá o Source Folders (onde ficam os códigos Java) e o Resource Folders (que são os arquivos não Java) /
    * apply e ok / Na sequencia com o botão de menu sobre a pasta resources / New / File / nomear como credentials.json / no arquivo criar uma lista
    * (arrays) com as credenciais para fazer a leitura pela aplicação. Por isso o código anterior foi comentado.
    * Para fazer a leitura utilizamos um getClass, a fim de obter um objeto class associado a instância de SecurityManagerImpl, e um getResourceAsStream
    * permitindo recuperar um resource (na raiz do sistema) de uma forma simples e transparente. Isso é armezenado dentro de uma InputStream por isso o uso
    * do try-with-resources com um catch para capturrar alguma exceção.
    * Posteriormente será criado o mecanismo parseJSON para transformar em um objeto do Java.
    * Dentro do src desse módulo securityimpl criar um packge model e arrastar para dentro do br.com.myapp.security.impl, criando duas classes na sequencia.
    * Credentials para respresentar as credenciais e Credential para representar a credencial em si.
    * Professor alterou a Credential para um record com os atributos username / password. Na classe Credentials uma lista de Credential com método para
    * recuperar uma credencial (para retornar uma outra String que é o password associado utilizando a StreamAPI).
    * Em seguida será efetuado a implementação da leitura via JSON com uma API externa.
    *
    *
    *
    * */
}
