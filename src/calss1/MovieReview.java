package calss1;

public class MovieReview {
    public static void main(String[] args){
        Movies movies1 = new Movies();
        movies1.title = "엄복동";
        movies1.review = "똥 쓰레기";


        Movies movies2 = new Movies();
        movies2.title = "엄복동2";
        movies2.review = "상상이상의 똥";

        movies1 = movies2;
        movies1.title = "어른 제국의 역습";

        System.out.println("movies1 참조값: "+movies1);
        System.out.println("movies2 참조값: "+movies2);
        System.out.println("영화 제목: "+movies1.title+", 리뷰: "+movies1.review);
        System.out.println("영화 제목: "+movies2.title+", 리뷰: "+movies2.review);
    }

}
