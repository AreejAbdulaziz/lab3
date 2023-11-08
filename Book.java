import java.util.ArrayList;

public class Book extends Media{

    private int stock;
    private ArrayList<Review> reviews;
    public void addReview(Review review){
        reviews.add(review);
    }
    public double getAverageRating(){
        double x=0;
        for(Review r:reviews){
            x=x+r.getRating();
        }
        return x/reviews.size();
    }
    public void purchase(User user){
        purchase.add(Book);
stock=stock-1;
    }
//    public boolean isBestseller(){
//         for(int i=1;i<=5;i++)
//         {if(i>=3)
//         }
//    }
//        return ;

    public void restock(int quantity){
        stock=stock+quantity;
    }

    @Override
    public String getMediaType() {
        return super.getMediaType();
    }

    @Override
    public String toString() {
        return "Book{" +
                "stock=" + stock +
                ", reviews=" + reviews +
                '}';
    }
}
