Create Table BOOK(
Book_ID varchar(5) check(book_id like 'B%') not null, Book_Title varchar(40) not null,
Copies number(5) check (copies > 2) not null

);
