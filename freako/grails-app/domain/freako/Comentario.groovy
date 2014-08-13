package freako

class Comentario {

	String nomeVisitante
	String email
	Date data
	Link link
	String mensagem
	
	static belongsTo = [Link]

    static constraints = {
		nomeVisitante(blank : false, nullable : false)
		email(blank : false, nullable : false, email : true)
		data(nullable : false)
		mensagem(blank : false, nullable : false)
    }
}
