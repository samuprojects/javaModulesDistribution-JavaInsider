import br.com.myapp.security.SecurityManager;
import br.com.myapp.security.impl.SecurityManagerImpl;

module securityimpl {

    requires security;
    provides SecurityManager with SecurityManagerImpl;
}