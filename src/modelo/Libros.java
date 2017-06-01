package modelo;

public class Libros {
	private String ISBN = "";
	private String titulo = "";
	private String autor = "";
	private int num_paginas = 0;
	private String editorial = "";
	
	public Libros(String iSBN, String titulo, String autor, int num_paginas, String editorial) {
		super();
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.num_paginas = num_paginas;
		this.editorial = editorial;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNum_paginas() {
		return num_paginas;
	}

	public void setNum_paginas(int num_paginas) {
		this.num_paginas = num_paginas;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	@Override
	public String toString() {
		return "Libros [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", num_paginas=" + num_paginas
				+ ", editorial=" + editorial + "]";
	}
	
	
}
