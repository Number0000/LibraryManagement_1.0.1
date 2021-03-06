package com.LibraryManagement.app.Service;

import java.util.List;

import com.LibraryManagement.app.Entity.Author;

public interface IAuthorService {

	public List<Author> getAuthor();

	public boolean addAuthor(Author author);

	public List<Author> getAuthorById(int authorId);

	public Author getAuthorByIdReturn(int authorId);

	public boolean updateAuthor(Author author);

	public boolean deleteAuthor(Author author);

	public List<Author> getSingleAuthor(int count);

}
