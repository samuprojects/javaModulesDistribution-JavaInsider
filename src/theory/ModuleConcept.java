package theory;

@SuppressWarnings("ALL")
public class ModuleConcept {

    /*
    *
    * Módulos consiste em dividir a aplicação.
    * Passou a fazer parte do Java a partir da versão 9. Ainda assim os engenheiros do Java criaram mecanismos para que as versões anteriores continuem funcionando.
    * Antes disso, no projeto, vários pacotes agrupam códigos com similaridades, incluindo a visibilidade de elementos em pacotes diferentes para ter um certo
    * tipo de encapsulamento e somente isso era possível.
    * A grande palavra por tras dos módulos é Encapsulamento
    * Que consiste em basicamente esconder detalhes internos de implementação de outros lugares, reduzindo a dependência entre elementos da aplicação.
    * Essa redução de dependência (com menor interação) permite expandir e manter mais facilmente sistemas dessa natureza.
    * Sistemas com previsão de crescimento desejam um alto encapsulamento.
    *
    *          ANTES        |      DEPOIS
    *      Projeto          |       Projeto pode ser quabrado em módulos
    *        Pacote A       |         Módulo1
    *        Pacote B       |               Pacotes A, B, C
    *        Pacote C       |         Módulo2
    *        Pacote D       |               Pacote D
    *                       |         Módulo3
    *                       |               Pacote E,F
    *
    *                                   Ou seja, é ter mais um nível para fazer um encapsulamento mais forte
    *                                   é possível esconder melhor as coisas.
    *                                   Para isso é necessário entender que um módulo deve ser considerado
    *                                   como uma parte totalmente independente do sistema.
    *                                   Expor o mínimo possível do módulo para fora, do contrário, seria como o se tivesse só os pacotes.
    *                                   Por exemplo: módulo segurança num lugar, interface gráfica em outro, etc.
    *                                   Módulos 1, 2 e 3 podem até conversar, mas de forma muito simplificada, isso permite alterar o funcionamento
    *                                   de um módulo específico internamente sem atrapalhar os demais.
    * */
}
