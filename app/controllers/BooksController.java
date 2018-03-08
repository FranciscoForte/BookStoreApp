package controllers;

import play.mvc.Controller;
import play.mvc.Result;
public class BooksController extends Controller  {
//Show all books to user
    public Result index(){
        return ok("index");
    }
    // to create book
    public Result create(){
        return TODO;
    }
    public Result save(){
        return TODO;
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
