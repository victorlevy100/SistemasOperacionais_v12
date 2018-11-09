package fernandes.lucas.sistemasop.LinuxR;

public class Linux {

    private String Title;
    private String Category;
    private String Description;
    private int Thumbnail;
    private int ImgPrincipal;

    public Linux() {
    }

    public Linux(String title, String category, String description, int thumbnail, int imgPrincipal) {
        Title = title;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;
        ImgPrincipal = imgPrincipal;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }

    public int getImgPrincipal() {
        return ImgPrincipal;
    }

    public void setImgPrincipal(int imgPrincipal) {
        ImgPrincipal = imgPrincipal;
    }
}
