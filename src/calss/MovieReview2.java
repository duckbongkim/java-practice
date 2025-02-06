package calss;

public class MovieReview2 {
    public static void main(String[] args){
        Movies movies1 = new Movies();
        movies1.title = "엄복동";
        movies1.review = "똥 쓰레기";


        Movies movies2 = new Movies();
        movies2.title = "엄복동2";
        movies2.review = "상상이상의 똥";

        Movies[] reviews = new Movies[2];
        reviews[0] = movies1;
        reviews[1] = movies2;

        for(Movies r : reviews){
            System.out.println("제목: "+r.title+", 리뷰: "+r.review);
        }
    }

}
