package MyTubeProject.src.com.mytube;

public class SqlVideoDatabase implements VideoDatabase{
    @Override
    public void store(Video video) {
        System.out.println("Storing video metadata");
        System.out.println("Title: " +video.getTitle());
        System.out.println("FileName: " + video.getFileName());
        System.out.println("Done!\n");
    }
}
