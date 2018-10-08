public class Imagine {

    private String imgPath;

    Imagine(String imgPath){
        this.imgPath = imgPath;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    @Override
    public String toString() {
        return "Imagine{" +
                "imgPath='" + imgPath + '\'' +
                '}';
    }
}