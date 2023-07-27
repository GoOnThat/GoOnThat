//package com.ohgiraffers.goonthatbackend.metamate.like.command.infra.service;
//
//import com.ohgiraffers.goonthatbackend.metamate.like.command.infra.mapper.IfreeBoardMapper;
//import com.ohgiraffers.goonthatbackend.metamate.like.command.infra.mapper.freeboardVO;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Service
//public class freeBoardService implements IfreeBoardService {
//
//    @Autowired
//    private IfreeBoardMapper mapper;
//
//    @Override
//    public freeboardVO freeDetail(int freeboard_no) {
//        return mapper.freeDetail(freeboard_no);
//    }
//
//    @Override
//    public void hit(int freeboard_no) {
//        mapper.hit(freeboard_no);
//    }
//
//    @Override
//    public int findLike(int board_no, String user_no) {
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("board_no", board_no);
//        map.put("user_no", user_no);
//        return mapper.findLike(map);
//    }
//
//    @Override
//    public void likeUp(int board_no, String user_no , int like_type) {
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("board_no", board_no);
//        map.put("user_no", user_no);
//        map.put("like_type", like_type);
//        mapper.likeUp(map);
//    }
//    @Override
//    public void likeDown(int board_no, String user_no, int like_type) {
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("board_no", board_no);
//        map.put("user_no", user_no);
//        map.put("like_type", like_type);
//        mapper.likeDown(map);
//    }
//    @Override
//    public int getLike(int board_no,int like_type) {
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("board_no", board_no);
//        map.put("like_type", like_type);
//        return mapper.getLike(map);
//    }
//}
