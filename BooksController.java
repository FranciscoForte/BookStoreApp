package controllers;

import models.Book;
import java.util.Set;
import play.mvc.Controller;
import play.mvc.Result;
import  views.html.books.index;


public class BooksController extends Controller  {
//Show all books to user
    public Result index(){
        Set<Book> books = Book.allBooks();

        return ok(index.render(books));
    }
    // to create book
    public Result create(){
        return ok("create");
    }
    public Result save(){
        return ok("save");
    }
    public Result edit(Integer id){
        return TODO;
    }
    public Result update(){
        return TODO;
    }
    public Result destroy(Integer id){
        return TODO;
    }
    public Result show(Integer id){
        return TODO;
    }
}
