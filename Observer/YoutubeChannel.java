import java.util.ArrayList;

public class YoutubeChannel {
    private ArrayList<Subscriber> subScriberList;
    private String uploadTitle;
    private String channelName;
    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
        subScriberList = new ArrayList<>();
        System.out.println( this.channelName + "채널이 개설 되었습니다");
    }
    public void registerSubScriber(Subscriber o) {
        subScriberList.add(o);
        System.out.println("하루코딩에 신규 구독자가 발생하였습니다. " +
                "현재 구독자는 "+ subScriberList.size() + "명 입니다");
    }

    public void removeSubScriber(Subscriber o) {
        subScriberList.remove(o);
        System.out.println("하루코딩+" +
                "에 구독자 취소가 발생하였습니다. " +
                "현재 구독자는 "+ subScriberList.size() + "명 입니다");
    }

    public void notifySubScriber(){
        for(int i=0; i< subScriberList.size(); i++){
            Subscriber subscriber = (Subscriber)subScriberList.get(i);
            subscriber.notify(channelName, uploadTitle);
        }
    }
    public void uploadNewContents(String title){
        uploadTitle = title;
        this.notifySubScriber();
    }
}
