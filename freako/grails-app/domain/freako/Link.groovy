package freako

class Link {

	String nome
	String url
	String descricao
	int votosPositivos
	int votosNegativos
	int visualizacaos
	int cliques
	Categoria categoria
	Usuario autor
	String objeto
	byte[] imagem
 	
	static hasMany = [comentarios : Comentario]
	static belongsTo = [Categoria , Usuario]

    static constraints = {
		nome(blank : false, nullable : false)
		url(url : true, blank : false, nullable : false, unique : true)
		descricao(blank : false, nullable : false)
		votosNegativos(min : 0, nullable : false)
		votosPositivos(min : 0, nullable : false)
		visualizacaos(min : 0, nullable : false)
		cliques(min : 0, nullable : false)
		objeto(nullable : true, blank : true)
		imagem(size : 0..131072)
    }
}
