import java.util.ArrayList;

public class YoutubeChannel {
    private ArrayList<Subscriber> subscriberList;
    private String uploadTitle;
    private String channelName;
    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
        subscriberList = new ArrayList<>();
        System.out.println( this.channelName + "채널이 개설 되었습니다");
    }
    public void registerSubscriber(Subscriber o) {
        subscriberList.add(o);
        System.out.println("하루코딩에 신규 구독자가 발생하였습니다. " +
                "현재 구독자는 "+ subscriberList.size() + "명 입니다");
    }

    public void removeSubscriber(Subscriber o) {
        subscriberList.remove(o);
        System.out.println("하루코딩" +
                "에 구독자 취소가 발생하였습니다. " +
                "현재 구독자는 "+ subscriberList.size() + "명 입니다");
    }

    public void notifySubscriber(){
        for(int i=0; i< subscriberList.size(); i++){
            Subscriber subscriber = (Subscriber)subscriberList.get(i);
            subscriber.notify(channelName, uploadTitle);
        }
    }
    public void uploadNewContents(String title){
        uploadTitle = title;
        this.notifySubscriber();
    }
}
