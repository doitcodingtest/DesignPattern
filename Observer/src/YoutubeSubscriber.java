package src;

public class YoutubeSubscriber implements Subscriber{
    private String name;

    public YoutubeSubscriber(String name) {
        this.name = name;
    }
    @Override
    public void notify(String channelName, String title) {
        System.out.println(this.name+"님!! "+channelName+"채널에 새로운 컨텐츠 ["+title+"]가 업로드 되었습니다.");
    }
}
