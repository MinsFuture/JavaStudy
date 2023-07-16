package Exam07;

public class Chatting {
    class Chat{
        void start(){};
        void sendMessage(String message){};
    }

    void startChat(String chatId) {
        String nickname = null;
        nickname = chatId;

        Chat chat = new Chat() { // 메소드내에서 정의되는 로컬 클래스(익명 객체)
            @Override
            public void start() {
                while (true) {
                    String inputData = "안녕하세요";
                    // String message = "[" + nickname + "] " + inputData;
                    // sendMessage(message);

                    // 로컬 변수 nickname을 로컬 클래스에서 사용할 경우, 로컬 변수 nickname은 final 특성을 갖게된다
                    // 따라서 위에서 nickname이 참조하는 객체를 chatId로 변경하는 것이 허용되지 않기 때문에 컴파일 에러가 발생한다
                }
            }
        };

        chat.start();
    }
}
