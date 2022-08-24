package Entity.Proxy;

public class Image implements FoodImage {
	private String url;
	 
    public Image(String url) {
        this.url = url;
        System.out.println("Image loaded: " + this.url);
    }
 
    @Override
    public void showFoodImage() {
        System.out.println("FoodImage showed: " + this.url);
    }
}
