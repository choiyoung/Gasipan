package dao;

import java.util.List;

public interface CommonDAO {
	// 추가 CREATE
	public int insert(Object obj);
	// 전체 요소의 갯수 count는 DB에서 where절이 필요 없기 때문에 파라미터값을 안넣는다.
	public int count();
	// ID로 중복값 없이 추출
	public Object getElementById(String id);
	// Name으로 중복값 허용하며 추출
	public List<Object> getElementsByName(String name);
	// 전체 목록 추출
	public List<Object> list();	
	// 수정
	public int update(Object obj);
	// 삭제 delete는 id 키워드만 있어도 그 테이블의 id 라인을 지울수 있다.
	public int delete(String id);
}
