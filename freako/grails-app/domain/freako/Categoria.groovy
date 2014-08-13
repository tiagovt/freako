package freako

class Categoria {

	String nome
	
	static hasMany = [links : Link]
	
    static constraints = {
		nome(unique : true, blank : false, nullable : false)
    }
	
	String toString(){
		"${this.nome}"
	}
}
