package freako

class Usuario {

	String login
	String hashSenha
	String email
	String senha
	
	static transients = ['senha']
	
	static hasMany = [links : Link]

    static constraints = {
		login(blank : false, nullable : false, unique : true)
		//hashSenha(blank : false, nullable : false)
		email(email : true, blank : false, nullable : false)
    }
	
	void setSenha(String valor){
		this.senha = valor
		if(valor != null){
			this.hashSenha = valor
		}
	}
	
	String toString(){
		return login
	}
}
