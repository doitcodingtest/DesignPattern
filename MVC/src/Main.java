public class Main {
    public static void main(String[] args) {
        //DB에서 가져온 데이터라고 가정합니다.
        UserModel model = new UserModel(1, "하루코딩", "브론즈");
        UserView view = new UserView();
        // 컨트롤러 생성시 모델과 뷰를 매개변수로 추가
        UserController controller = new UserController(model, view);

        controller.updateView(); //최초 화면을 보여준다.

        controller.setUserGrade("골드"); //모델 데이터를 변경한다. 등급 수정 (브론즈 -> 골드)
        // 컨트롤러는 모델과 뷰의 정보를 알고 있기 때문에 뷰도 자동 업데이트 된다.
        controller.updateView(); //화면을 다시 출력한다. View에서 등급이 변경된 것이 확인 된다.
    }
}


