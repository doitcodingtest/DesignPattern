public class Main {
    public static void main(String[] args) {
        // 채널 생성
        YoutubeChannel youtubeChannel = new YoutubeChannel("하루코딩");
        
        // 채널 구독
        YoutubeSubscriber subscriber1 = new YoutubeSubscriber("JIHYE");
        youtubeChannel.registerSubscriber(subscriber1);
        YoutubeSubscriber subscriber2 = new YoutubeSubscriber("JUA");
        youtubeChannel.registerSubscriber(subscriber2);

        // 신규 콘텐츠 업로드 1
        youtubeChannel.uploadNewContents("클린코드 강의");

        //구독 취소
        youtubeChannel.removeSubscriber(subscriber1);

        // 신규 콘텐츠 업로드 2
        youtubeChannel.uploadNewContents("리팩토링 강의");
    }
}