package com.secondhand.car.trade.system.exception;

import com.secondhand.car.trade.system.pojo.ApiResponse;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常
 *
 * @author ZengXuebin
 * @since 2024/1/3 23:33
 */
@RestControllerAdvice
public class GlobalException {

    private static final Logger logger = LoggerFactory.getLogger(GlobalException.class);

    @ExceptionHandler(Exception.class)
    public ApiResponse<Void> exception(Exception e) {
        logger.error("全局异常信息 e={}", e.getMessage());
        return ApiResponse.error();
    }

    @ExceptionHandler(CustomException.class)
    public ApiResponse<Void> customExceptionHandler(CustomException e) {
        return ApiResponse.fail(e.getCode(), e.getMessage());
    }
}
