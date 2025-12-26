/*Q21. WAP to create POJO class name as Book with field id,name and price and we have to
create one more class name as Library and Library class contain two methods
void setBook(Book book)
void showBook()*/


class Book{
    int id;
    String name;
    int price; 

    void setId(int id){
        this.id=id;
    }
    int getId(){
        return id;
    } 
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void setPrice(int price){
        this.price=price;
    }
    int getPrice(){
        return price;
    }
}

class Library{
     Book book;
     void setBook(Book book){
       this.book=book;
     }
     void showBook(){
          System.out.println(book.getId());
          System.out.println(book.getName());
          System.out.println(book.getPrice());
     }
}

class LibraryApp{
     public static void main(String []args){
     Book b=new Book();
     b.setId(1);
     b.setName("Yash");
     b.setPrice(100);

     Library l=new Library();
     l.setBook(b);
     l.showBook();
     }
}