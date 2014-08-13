package freako

import java.lang.ProcessBuilder.Redirect;

class AcessoFilters {

    def filters = {
        all(controller:'*', action:'*' ) {
            before = {
				if(!session.usuario && ! actionName.equals("login")){
					Redirect(uri : "login")
					return false
				}

            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
