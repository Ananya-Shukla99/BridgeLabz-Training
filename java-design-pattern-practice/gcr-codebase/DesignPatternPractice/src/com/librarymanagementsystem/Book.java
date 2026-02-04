package com.librarymanagementsystem;

public class Book {

	// book attributes
	private String title;
	private String authors;
	private String edition;
	private String genre;
	private String publisher;

	private Book(BookBuilder builder) {

		this.title = builder.title;
		this.authors = builder.authors;
		this.edition = builder.edition;
		this.setPublisher(builder.publisher);
	}

	//Inner class 
	public static class BookBuilder {

		// Builder Class
		private String title;
		private String authors;
		private String edition;
		private String genre;
		private String publisher;

		// constructor
		public BookBuilder(String title) {
			this.title = title;
		}

		// for creating author
		public BookBuilder authors(String authors) {
			this.authors = authors;
			return this;
		}

		// for adding editor
		public BookBuilder edition(String edition) {
			this.edition = edition;
			return this;
		}

		// for adding genre
		public BookBuilder genre(String genre) {
			this.setGenre(genre);
			return this;
		}

		// for adding publisher
		public BookBuilder publisher(String publisher) {
			this.publisher = publisher;
			return this;
		}

		// for creating book
		public Book build() {
			return new Book(this);
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", authors=" + authors + ", edition=" + edition + "]";
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getTitle() {

		return title;
	}
}
