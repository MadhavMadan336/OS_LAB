CREATE TABLE AUTHOR_LIST (
Author_ID CHAR(5), Book_ID CHAR(5), Role VARCHAR2(15),
PRIMARY KEY (Author_ID, Book_ID),
FOREIGN KEY (Author_ID) REFERENCES
AUTHOR(Author_ID),
FOREIGN KEY (Book_ID) REFERENCES
BOOK(Book_ID)
);
