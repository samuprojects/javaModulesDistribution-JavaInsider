package theory;
@SuppressWarnings("ALL")
public class UnderstandingDependencies {

    /*
    *            A aplicação foi quebrada em 3 módulos java:  app, security, securityimpl
    *
    *     USES SecurityManager   ------------------------------------------>  provides SecurityManager
    *     app ---\                                                          /--- securityimpl
    *     main    \  requires                                    requires  /     SecurityManagerImpl
    *              \                                                      /
    *               \--------------------> security <-------------------/
    *  Desacoplamento               SecurityManager \
    *                                                \
    *                                                 \requires
    *                                                  \--------------DB
    *                                                                provides SecurityManager
    *
    *    Nesse exemplo poderia remover o módulo securityimpl sem problemas que poderia utilizar um provides de um banco de dados.
    *
    * */
}
