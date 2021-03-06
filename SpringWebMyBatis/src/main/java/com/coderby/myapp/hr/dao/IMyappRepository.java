package com.coderby.myapp.hr.dao;

import java.util.List;
import java.util.Map;

import com.coderby.myapp.hr.model.AssignVO;
import com.coderby.myapp.hr.model.EntVO;
import com.coderby.myapp.hr.model.LecVO;
import com.coderby.myapp.hr.model.MemberVO;


public interface IMyappRepository {
	int getEntCount();				//기업 수	
	int getLecCount();				//수강 과목 수
	int getSeqNextVal();
	List<Map<String, Object>> getListLec(int seq_id);
	List<Map<String, Object>> getListLec(int lec_id, int seq_id);
	List<Map<String, Object>> getListEnt(int seq_id);
	List<Map<String, Object>> getListAssign(int lec_id);
	List<Map<String, Object>> getListAssignS(int seq_id);
	List<Map<String, Object>> getListMember(int seq_id);
	List<Map<String, Object>> getListMember(String mem_id, String mem_pw);
	List<Map<String, Object>> getListMember();
	
	AssignVO getAssignInfo(int lec_id);
	//AssignVO getAssignInfo(int lec_id, String asign_name);
	AssignVO getAssignInfo(int lec_id, String asign_name, int seq_id);
	EntVO getEntInfo(int ent_id, int seq_id);
	LecVO getLecInfo(int lec_id, int seq_id);
	MemberVO getMemberInfo(int seq_id); //회원 정보 열람
	MemberVO getMemberInfo(String mem_pw); //회원 정보 열람
	MemberVO getMemberInfo(String mem_id, String mem_pw); //회원 정보 열람
	
	
	void updateEnt(EntVO ent);
	void updateLec(LecVO lec);		//과목 수정
	void updateAssign(AssignVO asign);
	void updateMember(MemberVO mem);

	void insertEnt(EntVO ent);			//기업 추가
	void insertLec(LecVO lec);			//과목 추가
	void insertAssign(AssignVO asign);	//과제 추가
	void insertMember(MemberVO mem);  
		
	void deleteEnt(int ent_id, int seq_id); 	//기업 삭제
	void deleteLec(int lec_id, int seq_id);		//과목 삭제
	void deleteAssign(int lec_id, String asign_name, int seq_id);	//과제 삭제
	void deleteMember(String mem_id, String mem_pw);	//회원 탈퇴	
	int getSeqFromEnt(int ent_id);
	int getSeqFromLec(int lec_id);
	void deleteMember(int seq_id);
	
}
