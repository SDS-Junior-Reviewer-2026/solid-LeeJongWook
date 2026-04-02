package greeter;

// 1. 추상 클래스 정의
abstract class Greeter {

    //String formality;
    // 공통적으로 사용할 수 있는 메서드나 필드 (필요 시)
    abstract public String greet();
//        if (this.formality == "formal") {
//            return "Good evening, sir.";
//        } else if (this.formality == "casual") {
//            return "Sup bro?";
//        } else if (this.formality == "intimate") {
//            return "Hello Darling!";
//        } else {
//            return "Hello.";
//        }


//    public void setFormality(String formality) {
//        this.formality = formality;
//    }
}