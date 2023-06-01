package objects;

public class Book {
   
   // 필드
   int bookNumber;
   String bookTitle;
   
   // 생성자
   Book(int bookNumber, String bookTitle){
      this.bookNumber = bookNumber;
      this.bookTitle = bookTitle;
   }

   // 메서드 재정의
   @Override
   public String toString() {
	   return bookNumber + ", " + bookTitle;
   }

   
   //equals() 재정의
   @Override
   public boolean equals(Object obj) {
	   if(obj instanceof Book) {  //obj의 Book의 인스턴스(객체)라면
		   Book book = (Book)obj;  //강제 형변환
		   if(this.bookNumber == book.bookNumber)
			   return true;   //true 반환
	   }
	   return false;
   }

}