package com.springboard.board.service;

import java.util.List;

import com.springboard.board.BoardNotFoundException;
import com.springboard.board.vo.AttatchVO;
import com.springboard.board.vo.FreeBoardVO;
import com.springboard.paging.vo.PaginationInfo;

public interface BoardService {
	/**
	 * 게시글 상세조회
	 * @param board
	 * @return 존재하지 않으면, {@link BoardNotFoundException} 발생, 동시에 404 응답 전송
	 */
	public void createBoard(FreeBoardVO board);
	public FreeBoardVO retrieveBoard(int boNo);
	
	public AttatchVO retrieveAttatch(int attNo);
	
	public List<FreeBoardVO> retrieveBoardList(PaginationInfo<FreeBoardVO> paging);
}