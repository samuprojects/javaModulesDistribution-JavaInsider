package theory;

@SuppressWarnings("ALL")
public class ConceptRequiresTransitive {

    /*
    *
    * Supondo os módulos A, que depende de B, e este de C, e em outro momento B também D, caso queira utilizar o que está em B, C, D no A pode
    * simplesmente acrescentar a palavra chave transitive para que A tenha acesso a tudo que é exportado por B, C e D ao invés de redeclarar vários requires.
    *
    *               requires          requires
    *           A---------------->B---------------->C <---\
    *          /                 ^ \                       \
    *        /                  /   \-------------->D <---/
    *       |                  /        requires         /
    *       v                 /                         /
    * module-info            /                        /
    *     |                 /                       /
    *     |                /                      /
    *     v               /                     /
    * requires transitive B; -------------------
    *
    *
    * */
}
