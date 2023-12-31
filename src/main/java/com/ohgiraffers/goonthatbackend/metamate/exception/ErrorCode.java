package com.ohgiraffers.goonthatbackend.metamate.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    /* 400 BAD_REQUEST */
    USER_BAD_REQUEST(BAD_REQUEST, "잘못된 요청입니다."),

    /* 401 UNAUTHORIZED */
    UNAUTHORIZED_USER(UNAUTHORIZED, "인증되지 않은 사용자입니다."),

    /* 404 NOT_FOUND */
    POST_NOT_FOUND(NOT_FOUND, "게시글을 찾을 수 없습니다."),
    USER_NOT_FOUND(NOT_FOUND, "사용자를 찾을 수 없습니다."),
    COMMENT_NOT_FOUND(NOT_FOUND, "댓글을 찾을 수 없습니다."),
    MESSAGE_NOT_FOUND(NOT_FOUND, "쪽지를 찾을 수 없습니다.")
    ;

    private final HttpStatus httpStatus;
    private final String detail;
}
