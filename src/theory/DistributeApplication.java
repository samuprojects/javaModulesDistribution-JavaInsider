package theory;

@SuppressWarnings("ALL")
public class DistributeApplication {
    /*
    * A distribuição Java é dividida em dois momentos, antes do Java 9 e depois dele
    *
    *     < JAVA 9             |      >= JAVA 9
    *                          |
    *    APP <---|             |    |-----APP  ____
    *            |             |    v             |---> java.logging
    *      /---->jvm --->      |    M1            |---> java.base
    * JRE /                    |           |
    *    java                  |           v  BUNDLE
    *                          |       APP + MODULES
    *                          |
    * JVM + Libs (biblotecas)  |     no exemplo acima o módulo 1 da aplicação depende de apenas 2 módulos do java
    *  era obrigatório         |     com isso a partir do java 9 podemos criar um Bundle
    * instalar a enorme JRE    |     que consiste em montar um "pacote" que contém nossa aplicação junto com os módulos Java
    *                                ou seja, não é necessário ter a JRE instalada no computador de destino
    *                                o próprio Bundle possui uma JRE criada de uma forma específica para execução dessa aplicação
    *                                E totalmente otimizada. Isso diminui o tamanho do pacote da aplicação e na hora de executar
    *                                carrega apenas o necessário, ganhando em velocidade e gasto de memória para subir a aplicação.
    *                                A criação desse Bundle será visto posteriormente.
    *
    *
    * */
}
