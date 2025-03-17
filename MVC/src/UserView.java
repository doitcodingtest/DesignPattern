public class UserView {
    // 화면 출력 기능만 보유
    public void displayUserInfo(int id, String name, String grade){
        System.out.println("[회원 정보]");
        System.out.println("ID: "+id);
        System.out.println("이름: "+name);
        System.out.println("등급: "+grade);
        System.out.println();
    }
}
