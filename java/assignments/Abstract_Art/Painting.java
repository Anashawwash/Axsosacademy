public class Painting extends Art{
    String colorType; 

    public Painting(String colorType,String title,String auhor , String discription){
        super(title , auhor ,discription);
        this.colorType = colorType;
    }


}