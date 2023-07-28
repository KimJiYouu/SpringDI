package ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Printer {
	
	//@Autowired
	//-멤버변수, 생성자, setter 모두 사용
	//-bean 중에서 주입될 수 있는 적합한 타입을 찾아서 자동 주입
	
	@Autowired
	@Qualifier("document1") //일치하는 빈이 여러 개일떄 여러 개 중 특정 이름에 강제 연결
	private Document document;
	
	//기본생성자
	public Printer() {}
	
	//생성자 주입 ok
	public Printer(Document document) { //bean에서 적합한 타입이나 이름(id)를 찾음
		this.document = document;
	}

	//getter, setter 통한 주입 ok
	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
	
	

}
