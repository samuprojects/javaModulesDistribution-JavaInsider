import br.com.myapp.security.SecurityManager;
import br.com.myapp.security.impl.SecurityManagerImpl;

module securityimpl {

    requires security;
    requires com.google.gson;
    requires java.logging;
    provides SecurityManager with SecurityManagerImpl;
    opens br.com.myapp.security.impl.model;
}