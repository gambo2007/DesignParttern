package Entity.Proxy;

public class ProxyImage implements FoodImage {
    private Image Image;
    private String url;
 
    public ProxyImage(String url) {
        this.url = url;
        System.out.println("Image unloaded: " + this.url);
    }
 
    @Override
    public void showFoodImage() {
        if (Image == null) {
            Image = new Image(this.url);
        } else {
            System.out.println("Image already existed: " + this.url);
        }
        Image.showFoodImage();
    }
}
